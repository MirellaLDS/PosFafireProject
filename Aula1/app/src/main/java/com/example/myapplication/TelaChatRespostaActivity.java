package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
        binding.tvResposta.setText(valor);

    }
}