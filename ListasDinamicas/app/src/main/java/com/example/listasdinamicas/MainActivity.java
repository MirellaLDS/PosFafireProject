package com.example.listasdinamicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton button = findViewById(R.id.floatButton);
        button.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(),
                    "Mensagem aqui",
                    Toast.LENGTH_LONG).show();
        });
    }
}