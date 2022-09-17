package com.example.bancodedadosroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.bancodedadosroom.model.Department;
import com.example.bancodedadosroom.model.DepartamentDTO;
import com.example.bancodedadosroom.service.DepartamentService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DepartamentService service = RetrofitConfig
                .newInstance()
                .departamentService();
        createDepartment(service);
    }

    private void createDepartment(DepartamentService service){
        DepartamentDTO  dto =  new DepartamentDTO();
        dto.setName("Mirella Departamento");
        // loading
        service.createDepartment(dto).enqueue(new Callback<Department>() {
            @Override
            public void onResponse(Call<Department> call, Response<Department> response) {
                if(response.isSuccessful()) {
                    Toast.makeText(
                            getApplicationContext(),
                            " Departamento criado com sucesso ",
                            Toast.LENGTH_LONG
                    ).show();
                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            " Erro ao criar um departamento ",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }

            @Override
            public void onFailure(Call<Department> call, Throwable t) {
                Toast.makeText(
                        getApplicationContext(),
                        "Erro na request",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }

    private void getAll(DepartamentService service) {
        service.getAllDepartaments().enqueue(new Callback<List<Department>>() {
            @Override
            public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {
                List<Department> lista = response.body();
                for (Department item : lista) {
                    Log.i(">>>", item.getName());
                }
            }

            @Override
            public void onFailure(Call<List<Department>> call, Throwable t) {
                Toast.makeText(
                        getApplicationContext(),
                        "Falha na request!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }

}