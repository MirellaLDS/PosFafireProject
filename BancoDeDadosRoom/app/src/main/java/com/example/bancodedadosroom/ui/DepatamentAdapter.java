package com.example.bancodedadosroom.ui;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bancodedadosroom.R;
import com.example.bancodedadosroom.model.DepartamentoRes;
import com.example.bancodedadosroom.model.Department;

import java.util.List;

public class DepatamentAdapter extends RecyclerView.Adapter<DepartamentItemHolder> {

    private List<Department> departaments;

    public DepatamentAdapter(List<Department> departaments) {
        this.departaments = departaments;
    }

    public void configureDepartamentList(List<Department> departaments) {
        this.departaments = departaments;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DepartamentItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext())
                .inflate(
                        R.layout.depatament_item_layout,
                        parent,
                        false
                );

        return new DepartamentItemHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull DepartamentItemHolder holder, int position) {
        Department departamento = departaments.get(position);
        holder.setupItem(departamento.getName());
    }

    @Override
    public int getItemCount() {
        return departaments.size();
    }
}
