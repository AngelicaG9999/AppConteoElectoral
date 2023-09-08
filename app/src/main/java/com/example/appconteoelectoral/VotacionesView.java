package com.example.appconteoelectoral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class VotacionesView extends AppCompatActivity {

    private RadioButton radioButton,radioButton2,radioButton3;
    private Button button;
    private int Candidato1 = 0,Cantidato2 = 0,Candidato3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.votaciones);

        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        button = (Button) findViewById(R.id.button);
    }

    //Método para el botón anterior
    public void Anterior(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, Resultado.class);
        startActivity(siguiente);
    }

    public void CandidatoUno(View view){

    }
    public void ElegirCandidato(View view){

        if(radioButton.isChecked() == false && radioButton2.isChecked() == false && radioButton3.isChecked() == false){

            Toast.makeText(this,"No puedes continuar,debes seleccionar un candidato",Toast.LENGTH_LONG).show();
        } else {
            if(radioButton.isChecked() == true){

            }

            if(radioButton2.isChecked() == true){

            }

            if(radioButton.isChecked() == true){

            }
            if(radioButton3.isChecked() == true){

            }
        }




    }
};