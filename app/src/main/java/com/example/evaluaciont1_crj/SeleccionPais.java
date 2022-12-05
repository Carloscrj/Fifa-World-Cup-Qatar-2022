package com.example.evaluaciont1_crj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class SeleccionPais extends AppCompatActivity implements View.OnClickListener {

    EditText etEquipoSeleccion;
    Button btnaceptarSeleccion;
    Button btncancelarSeleccion;
    Button btnAlemania, btnArabiaSaudi, btnArgentina, btnAustralia, btnBelgica, btnBrasil,btnCamerun, btnCanada,
    btnCoreadelSur, btnCostaRica, btnCroacia, btnDinamarca, btnEcuador, btnEspania, btnEstadosUnidos, btnFrancia,
    btnGhana, btnHolanda, btnIran, btnJapon, btnMexico, btnPortugal, btnMarruecos, btnPolonia, btnSenegal, btnQatar,
    btnTunez, btnUruguay, btnSuiza, btnGales, btnInglaterra, btnSerbia;


    Button button;
    public static final int RESULT_OK_SELECCION_1 = 100;
    public static final String CLAVE_PAIS_1 = "PAIS_1";
    public static final int RESULT_OK_SELECCION_2 = 101;
    public static final String CLAVE_PAIS_2 = "PAIS_2";
    public static final int RESULT_OK_SELECCION_3 = 101;
    public static final String CLAVE_PAIS_3 = "PAIS_3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_pais);


        btnaceptarSeleccion = findViewById(R.id.btnaceptarSeleccion);
        btncancelarSeleccion = findViewById(R.id.btncancelarSeleccion);
        etEquipoSeleccion= findViewById(R.id.etEquipoSeleccion);
        btnAlemania = findViewById(R.id.btnAlemania);
        btnArabiaSaudi = findViewById(R.id.btnArabiaSaudi);
        btnArgentina = findViewById(R.id.btnArgentina);
        btnAustralia = findViewById(R.id.btnAustralia);
        btnBelgica = findViewById(R.id.btnBelgica);
        btnBrasil = findViewById(R.id.btnBrasil);
        btnCamerun = findViewById(R.id.btnCamerun);
        btnCanada = findViewById(R.id.btnCanada);
        btnCoreadelSur = findViewById(R.id.btnCoreadelSur);
        btnCostaRica = findViewById(R.id.btnCostaRica);
        btnCroacia = findViewById(R.id.btnCroacia);
        btnDinamarca = findViewById(R.id.btnDinamarca);
        btnEcuador = findViewById(R.id.btnEcuador);
        btnEspania = findViewById(R.id.btnEspania);
        btnEstadosUnidos = findViewById(R.id.btnEstadosUnidos);
        btnFrancia = findViewById(R.id.btnFrancia);
        btnGhana = findViewById(R.id.btnGhana);
        btnHolanda = findViewById(R.id.btnHolanda);
        btnIran = findViewById(R.id.btnIran);
        btnJapon = findViewById(R.id.btnJapon);
        btnMexico = findViewById(R.id.btnMexico);
        btnPortugal = findViewById(R.id.btnPortugal);
        btnMarruecos = findViewById(R.id.btnMarruecos);
        btnPolonia = findViewById(R.id.btnPolonia);
        btnSenegal = findViewById(R.id.btnSenegal);
        btnQatar = findViewById(R.id.btnQatar);
        btnTunez = findViewById(R.id.btnTunez);
        btnUruguay = findViewById(R.id.btnUruguay);
        btnSuiza = findViewById(R.id.btnSuiza);
        btnGales = findViewById(R.id.btnGales);
        btnInglaterra = findViewById(R.id.btnInglaterra);
        btnSerbia = findViewById(R.id.btnSerbia);

        btnaceptarSeleccion.setOnClickListener(this);
        btncancelarSeleccion.setOnClickListener(this);
        btnAlemania.setOnClickListener(this);
        btnArabiaSaudi.setOnClickListener(this);
        btnArgentina.setOnClickListener(this);
        btnAustralia.setOnClickListener(this);
        btnBelgica.setOnClickListener(this);
        btnBrasil.setOnClickListener(this);
        btnCamerun.setOnClickListener(this);
        btnCanada.setOnClickListener(this);
        btnCoreadelSur.setOnClickListener(this);
        btnCostaRica.setOnClickListener(this);
        btnCroacia.setOnClickListener(this);
        btnDinamarca.setOnClickListener(this);
        btnEcuador.setOnClickListener(this);
        btnEspania.setOnClickListener(this);
        btnEstadosUnidos.setOnClickListener(this);
        btnFrancia.setOnClickListener(this);
        btnGhana.setOnClickListener(this);
        btnHolanda.setOnClickListener(this);
        btnIran.setOnClickListener(this);
        btnJapon.setOnClickListener(this);
        btnMexico.setOnClickListener(this);
        btnPortugal.setOnClickListener(this);
        btnMarruecos.setOnClickListener(this);
        btnPolonia.setOnClickListener(this);
        btnSenegal.setOnClickListener(this);
        btnQatar.setOnClickListener(this);
        btnTunez.setOnClickListener(this);
        btnUruguay.setOnClickListener(this);
        btnSuiza.setOnClickListener(this);
        btnGales.setOnClickListener(this);
        btnInglaterra.setOnClickListener(this);
        btnSerbia.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view.getId()== R.id.btnaceptarSeleccion){
            aceptar();


        } else if (view.getId()== R.id.btncancelarSeleccion){
            setResult(RESULT_CANCELED);
            finish();

        } else{
            Button boton = (Button)view;
            String textoBoton = boton.getText().toString();
            etEquipoSeleccion.setText(textoBoton);
        }

    }


    private void aceptar() {
        String pais = etEquipoSeleccion.getText().toString();
        String seleccion1 = getIntent().getStringExtra(MainRegistro.CLAVE_SELECCION_1);
        String seleccion2 = getIntent().getStringExtra(MainRegistro.CLAVE_SELECCION_2);
        String seleccion3 = getIntent().getStringExtra(MainConsultar.CLAVE_SELECCION_3);
        String boton1 = "SELECCION_1";
        String boton2 = "SELECCION_2";
        String boton3 = "SELECCION_3";


        if (pais.isEmpty()) Toast.makeText(this, R.string.sin_seleccion, Toast.LENGTH_LONG).show();
        else {
            if(boton1.equalsIgnoreCase(seleccion1)){
                Intent i = new Intent();
                //Le asignamos a la clave, el nombre que hemos recuperado:
                i.putExtra(CLAVE_PAIS_1, pais);
                //Le pasamos result OK y el nombre:
                setResult(RESULT_OK_SELECCION_1,i);
                finish();
            }else if(boton2.equalsIgnoreCase(seleccion2)){
                Intent i = new Intent();
                //Le asignamos a la clave, el nombre que hemos recuperado:
                i.putExtra(CLAVE_PAIS_2, pais);
                //Le pasamos result OK y el nombre:
                setResult(RESULT_OK_SELECCION_2,i);
                finish();
            }else if(boton3.equalsIgnoreCase(seleccion3)){
                Intent i = new Intent();
                //Le asignamos a la clave, el nombre que hemos recuperado:
                i.putExtra(CLAVE_PAIS_3, pais);
                //Le pasamos result OK y el nombre:
                setResult(RESULT_OK_SELECCION_3,i);
                finish();
            }
        }

    }




}