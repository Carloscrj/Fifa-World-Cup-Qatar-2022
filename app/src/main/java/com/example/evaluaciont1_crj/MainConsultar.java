package com.example.evaluaciont1_crj;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluaciont1_crj.fragmento.InformacionFragment;

public class MainConsultar extends AppCompatActivity implements View.OnClickListener {
    EditText etEquipoConsulta;
    Button btnSeleccionarConsulta;
    public static final String CLAVE_SELECCION_3= "SELECCION_3";
    FragmentManager fm;
    FragmentTransaction ft;

    ActivityResultLauncher<Intent> startActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    String seleccion = null;
                    if (result.getResultCode() == SeleccionPais.RESULT_OK_SELECCION_3) {
                        //A la variable nombre le asignamos el texto que nos hemos traído de la otra activity:
                        seleccion = result.getData().getStringExtra(SeleccionPais.CLAVE_PAIS_3);
                        etEquipoConsulta.setText(seleccion);
                        btnSeleccionarConsulta.setText(R.string.btnLimpiarDatos);

                        seleccion = etEquipoConsulta.getText().toString();
                        fm = getSupportFragmentManager();
                        ft = fm.beginTransaction();
                        //de esta manera añadiremos el fragmento cuando le queremos pasar información desde
                        //el activity con el new Instance
                        ft.add(R.id.flContenedor, InformacionFragment.newInstance(seleccion));
                        ft.addToBackStack(null); //para que cuando le des atrás desaparezca el fragmento
                        ft.commit(); // para ejecutar lo anterior
                    }

                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_consultar);

        etEquipoConsulta = findViewById(R.id.etEquipoConsulta);
        btnSeleccionarConsulta = findViewById(R.id.btnSeleccionarConsulta);

        etEquipoConsulta.setEnabled(false);


        btnSeleccionarConsulta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String seleccion3 = "SELECCION_3";
        if (btnSeleccionarConsulta.getText().toString().trim().equalsIgnoreCase(String.format(getString(R.string.btnSeleccionar)))) {
            Intent i = new Intent(MainConsultar.this, SeleccionPais.class);
            //Le asignamos a la clave, el nombre que hemos recuperado:
            i.putExtra(CLAVE_SELECCION_3, seleccion3);
            //Arrancamos el siguiente activity:
            startActivityForResult.launch(i);



        }else if (btnSeleccionarConsulta.getText().toString().trim().equalsIgnoreCase(String.format(getString(R.string.btnLimpiarDatos)))){
            etEquipoConsulta.setText("");
            btnSeleccionarConsulta.setText(R.string.btnSeleccionar);
            fm.popBackStack();//metodo para limpiar los fragmentos
        }

    }
}