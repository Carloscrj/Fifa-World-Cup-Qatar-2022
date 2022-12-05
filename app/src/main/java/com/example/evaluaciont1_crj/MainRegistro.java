package com.example.evaluaciont1_crj;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.evaluaciont1_crj.datosSelecciones.ListaResultados;
import com.example.evaluaciont1_crj.datosSelecciones.Resultado;

public class MainRegistro extends AppCompatActivity implements View.OnClickListener {
    EditText etFechaHora;
    EditText etFase;
    EditText etEquipo1;
    Button btnSeleccionar1;
    EditText etEquipo2;
    Button btnSeleccionar2;
    EditText etGoles1;
    EditText etGoles2;
    Button btnGuardarResultado;
    Button btnLimpiarDatos;
    public static final String CLAVE_SELECCION_1= "SELECCION_1";
    public static final String CLAVE_SELECCION_2= "SELECCION_2";

    ActivityResultLauncher<Intent> startActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    String seleccion = null;
                    String seleccion2 = null;
                    if (result.getResultCode() == SeleccionPais.RESULT_OK_SELECCION_1) {
                       seleccion = result.getData().getStringExtra(SeleccionPais.CLAVE_PAIS_1);
                       etEquipo1.setText(seleccion);
                    } else if ((result.getResultCode() == SeleccionPais.RESULT_OK_SELECCION_2)) {
                        seleccion2 = result.getData().getStringExtra(SeleccionPais.CLAVE_PAIS_2);
                        etEquipo2.setText(seleccion2);
                    }

                }
            }
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);

        etFechaHora = findViewById(R.id.etFechaHora);
        etFase = findViewById(R.id.etFase);
        etEquipo1 = findViewById(R.id.etEquipo1);
        etEquipo2 = findViewById(R.id.etEquipo2);
        etGoles1 = findViewById(R.id.etGoles1);
        etGoles2 = findViewById(R.id.etGoles2);
        btnSeleccionar1 = findViewById(R.id.btnSeleccionar1);
        btnSeleccionar2 = findViewById(R.id.btnSeleccionar2);
        btnGuardarResultado = findViewById(R.id.btnGuardarResultado);
        btnLimpiarDatos = findViewById(R.id.btnLimpiarDatos);

        etEquipo1.setEnabled(false);
        etEquipo2.setEnabled(false);

        btnSeleccionar1.setOnClickListener(this);
        btnSeleccionar2.setOnClickListener(this);
        btnGuardarResultado.setOnClickListener(this);
        btnLimpiarDatos.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view.getId()== R.id.btnGuardarResultado){
           if (etFechaHora.getText().toString().trim().isEmpty() || etFase.getText().toString().trim().isEmpty()
                   || etEquipo1.getText().toString().trim().isEmpty() || etEquipo2.getText().toString().trim().isEmpty()
                   || etGoles1.getText().toString().trim().isEmpty() || etGoles2.getText().toString().trim().isEmpty()){
               Toast.makeText(this, R.string.camposObligatorios, Toast.LENGTH_SHORT).show();

           }else if(etEquipo1.getText().toString().trim().equalsIgnoreCase(etEquipo2.getText().toString().trim())){
               Toast.makeText(this, R.string.seleccionesIguales, Toast.LENGTH_SHORT).show();

           }else if(!etFase.getText().toString().trim().equalsIgnoreCase(getString(R.string.faseDeGrupos)) &&
                   !etFase.getText().toString().trim().equalsIgnoreCase(getString(R.string.octavos)) &&
                   !etFase.getText().toString().trim().equalsIgnoreCase(getString(R.string.cuartos)) &&
                   !etFase.getText().toString().trim().equalsIgnoreCase(getString(R.string.semifinal)) &&
                   !etFase.getText().toString().trim().equalsIgnoreCase(getString(R.string.faseFinal))){

                Toast.makeText(this, R.string.faseCorrecta, Toast.LENGTH_SHORT).show();

           }else {
               String fase = etFase.getText().toString();
               String fecha = etFechaHora.getText().toString();
               String equipoUno = etEquipo1.getText().toString();
               int golesEquipoUno = Integer.parseInt(etGoles1.getText().toString());
               String equipoDos = etEquipo2.getText().toString();
               int golesEquipoDos = Integer.parseInt(etGoles2.getText().toString());

               Resultado resultado = new Resultado(fase, fecha, equipoUno,golesEquipoUno, equipoDos, golesEquipoDos);
               ListaResultados listaResultados = new ListaResultados();
               listaResultados.addResultado(resultado);

               Toast.makeText(this, R.string.datosGuardados, Toast.LENGTH_SHORT).show();
                etFechaHora.setText("");
                etFase.setText("");
                etEquipo1.setText("");
                etEquipo2.setText("");
                etGoles1.setText("");
                etGoles2.setText("");

           }
           
        }else if (view.getId()== R.id.btnLimpiarDatos){
            etFechaHora.setText("");
            etFase.setText("");
            etEquipo1.setText("");
            etEquipo2.setText("");
            etGoles1.setText("");
            etGoles2.setText("");

        } else if(view.getId()== R.id.btnSeleccionar1){
            String seleccion1= "SELECCION_1";
            //Pasamos al siguiente activity los datos:
            Intent i = new Intent(MainRegistro.this, SeleccionPais.class);
            i.putExtra(CLAVE_SELECCION_1, seleccion1);
            //Arrancamos el siguiente activity:
            startActivityForResult.launch(i);

        } else if(view.getId()== R.id.btnSeleccionar2){
            String seleccion2= "SELECCION_2";
            //Pasamos al siguiente activity los datos:
            Intent i = new Intent(MainRegistro.this, SeleccionPais.class);
            i.putExtra(CLAVE_SELECCION_2, seleccion2);
            //Arrancamos el siguiente activity:
            startActivityForResult.launch(i);
        }


    }
}

