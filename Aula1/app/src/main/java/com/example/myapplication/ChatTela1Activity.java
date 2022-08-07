package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityChatTela1Binding;

public class ChatTela1Activity extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btEnviar.setOnClickListener(view -> {
            Intent mensageiro = new Intent(getApplicationContext(), TelaChatRespostaActivity.class);
            mensageiro.putExtra("key", binding.edMensagem.getText().toString());
            startActivity(mensageiro);
        });

    }
}