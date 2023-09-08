package com.example.appconteoelectoral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText et1, et2;
    public TextView tv1, tv2;
    public Button btn; ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        tv1 = (TextView) findViewById(R.id.tv1);
        et2 = (EditText) findViewById(R.id.et2);
        tv2 = (TextView) findViewById(R.id.tv2);

    }

    public void ValidarEdad(View view) {
        String edadStr = et1.getText().toString();
        int edad = Integer.parseInt(edadStr);

        if (edad >= 18) {
            Toast.makeText(this,"Puedes votar, eres mayor de edad.",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"No puedes votar, no eres mayor de edad.",Toast.LENGTH_SHORT).show();
        }
    }


    //Validaciones


    //Método para el botón siguiente
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, VotacionesView.class);
        startActivity(siguiente);
    }


}

