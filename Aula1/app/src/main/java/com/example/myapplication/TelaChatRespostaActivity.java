package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityChatTela1Binding;

public class TelaChatRespostaActivity extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String valor = getIntent().getStringExtra("key");
        binding.tvMensagem.setText(valor);

        Intent respostaIntent = new Intent(this, ChatTela1Activity.class);
        binding.btEnviar.setOnClickListener(view -> {
            String resposta = binding.edMensagem.getText().toString();
            binding.tvResposta.setText(resposta);
            respostaIntent.putExtra("ResponseKey", resposta);
            setResult(RESULT_OK, respostaIntent);
            finish();
        });
    }
}