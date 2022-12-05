package com.example.evaluaciont1_crj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegistrarResultado;
    Button btnConsultarResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistrarResultado = findViewById(R.id.btnRegistrarResultado);
        btnConsultarResultado = findViewById(R.id.btnConsultarResultado);

        btnRegistrarResultado.setOnClickListener(this);
        btnConsultarResultado.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.btnRegistrarResultado){
            //Pasamos al siguiente activity los datos:
            Intent i = new Intent(MainActivity.this, MainRegistro.class);
            //Arrancamos el siguiente activity:
            startActivity(i);

        } else if (view.getId()== R.id.btnConsultarResultado){
            Intent i = new Intent(MainActivity.this, MainConsultar.class);
            //Arrancamos el siguiente activity:
            startActivity(i);
        }
    }

}