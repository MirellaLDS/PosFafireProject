package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityChatTela1Binding;

public class ChatTela1Activity extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    ActivityResultLauncher<Intent> intentResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    String mensagem =  result.getData().getStringExtra("ResponseKey");
                    if (mensagem != null && !mensagem.equals("")) {
                        binding.tvResposta.setText(mensagem);
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btEnviar.setOnClickListener(view -> {
            String mensagem = binding.edMensagem.getText().toString();
            binding.tvMensagem.setText(mensagem);
            Intent mensageiro = new Intent(getApplicationContext(), TelaChatRespostaActivity.class);
            mensageiro.putExtra("key", mensagem);
//            startActivity(mensageiro);

            intentResult.launch(mensageiro);
        });
    }

}