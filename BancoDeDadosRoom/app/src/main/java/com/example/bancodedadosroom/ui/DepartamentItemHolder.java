package com.example.bancodedadosroom.ui;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bancodedadosroom.MainActivity;
import com.example.bancodedadosroom.R;

public class DepartamentItemHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private ConstraintLayout container;
    private View view;

    public DepartamentItemHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        container = itemView.findViewById(R.id.container);
        tvName = itemView.findViewById(R.id.tvDepatamentName);
    }

    public void setupItem(String nome) {
       tvName.setText(nome);

        container.setOnClickListener(view -> {
            Intent newScreen = new Intent(view.getContext(), MainActivity.class);
            view.getContext().startActivity(newScreen);
       });
    }

    public TextView getTvName() {
        return tvName;
    }
}
