package com.example.listasdinamicas;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvText;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        tvText = itemView.findViewById(R.id.tvItem);
    }

    public TextView getTvText() {
        return tvText;
    }
}
