package com.example.appconteoelectoral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
    }

    public void Anterior(View view) {
        Intent anterior = new Intent(this, VotacionesView.class);
        startActivity(anterior);
    }
}