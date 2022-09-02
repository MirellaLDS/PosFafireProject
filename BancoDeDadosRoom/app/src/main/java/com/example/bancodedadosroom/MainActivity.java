package com.example.bancodedadosroom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.bancodedadosroom.model.Departamento;
import com.example.bancodedadosroom.model.DepartamentoRes;
import com.example.bancodedadosroom.model.ProfessorRes;
import com.example.bancodedadosroom.service.DepartamentoService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DepartamentoService retrofit = RetrofitConfig
                .newInstance()
                .departamentService();

        retrofit.getAll().enqueue(
                new Callback<List<DepartamentoRes>>() {
                    @Override
                    public void onResponse(Call<List<DepartamentoRes>> call, Response<List<DepartamentoRes>> response) {
                       List<DepartamentoRes> list = response.body();
                        for (DepartamentoRes item : list) {
                            Log.i(">>>", item.getName());
                            for (ProfessorRes prof : item.getProfessors()) {
                                Log.i(">>>", prof.getName());
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<DepartamentoRes>> call, Throwable t) {
                       Toast.makeText(getApplicationContext(), "Erro na requisição!", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}