package com.example.bancodedadosroom;

import android.app.AlertDialog;
import android.content.Context;

public class Util {

    public static AlertDialog.Builder Alert(
            Context context,
            String titulo,
            String mensagem
    ) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo);
        builder.setMessage(mensagem);
        builder.setPositiveButton(R.string.ok, (dialog, id) -> {
            // User clicked OK button
        });
        builder.setNegativeButton(R.string.cancel, (dialog, id) -> {
            // User cancelled the dialog
        });
        return builder;
    }

}
