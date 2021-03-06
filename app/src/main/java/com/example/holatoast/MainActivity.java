package com.example.holatoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private TextView principal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        principal = findViewById(R.id.textViewContador);
    }

    public void saludar(View view) {

        Toast toast = Toast.makeText(this, R.string.mensaje, Toast.LENGTH_SHORT );
        toast.show();
        contador = 0;
        principal.setText(String.valueOf(contador));


    }

    public void sumar(View view) {
        contador ++;
        // esto es un comentario
        if(contador==1000) principal.setTextSize(150);
        principal.setText(String.valueOf(contador));
    }
}