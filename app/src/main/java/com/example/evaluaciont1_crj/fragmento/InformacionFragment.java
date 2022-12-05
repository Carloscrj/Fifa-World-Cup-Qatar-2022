package com.example.evaluaciont1_crj.fragmento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.evaluaciont1_crj.R;
import com.example.evaluaciont1_crj.datosSelecciones.ListaResultados;
import com.example.evaluaciont1_crj.datosSelecciones.Resultado;

import java.util.ArrayList;

public class InformacionFragment extends Fragment {
    private static final String ARG_SELECCION = "SELECCION";
    private String seleccion;
    TextView tvFrameFase, tvFrameFecha, tvFrameEquipo1, tvFrameGoles1, tvFrameEquipo2, tvFrameGoles2;
    TextView tvFrameFaseDos, tvFrameFechaDos, tvFrameEquipo1Dos, tvFrameGoles1Dos, tvFrameEquipo2Dos, tvFrameGoles2Dos;
    TextView tvFrameFaseTres, tvFrameFechaTres, tvFrameEquipo1Tres, tvFrameGoles1Tres, tvFrameEquipo2Tres, tvFrameGoles2Tres;
    TextView tvFrameFaseCuatro, tvFrameFechaCuatro, tvFrameEquipo1Cuatro, tvFrameGoles1Cuatro, tvFrameEquipo2Cuatro, tvFrameGoles2Cuatro;
    TextView tvFrameFaseCinco, tvFrameFechaCinco, tvFrameEquipo1Cinco, tvFrameGoles1Cinco, tvFrameEquipo2Cinco, tvFrameGoles2Cinco;
    TextView tvFrameFaseSeis, tvFrameFechaSeis, tvFrameEquipo1Seis, tvFrameGoles1Seis, tvFrameEquipo2Seis, tvFrameGoles2Seis;
    TextView tvFrameFaseSiete, tvFrameFechaSiete, tvFrameEquipo1Siete, tvFrameGoles1Siete, tvFrameEquipo2Siete, tvFrameGoles2Siete;




    public InformacionFragment() {
        // Required empty public constructor
    }

    public static InformacionFragment newInstance(String pSeleccion) {
        InformacionFragment fragment = new InformacionFragment();
        Bundle args = new Bundle();
        //recogemos los valores que nos pasa el activity y los guardamos
        args.putString(ARG_SELECCION, pSeleccion);
        fragment.setArguments(args);
        return fragment;
    }

    //extraemos los datos del fragmento
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            seleccion = getArguments().getString(ARG_SELECCION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_informacion, container, false);

        tvFrameFase = vista.findViewById(R.id.tvFrameFase);
        tvFrameFecha = vista.findViewById(R.id.tvFrameFecha);
        tvFrameEquipo1 = vista.findViewById(R.id.tvFrameEquipo1);
        tvFrameGoles1 = vista.findViewById(R.id.tvFrameGoles1);
        tvFrameEquipo2 = vista.findViewById(R.id.tvFrameEquipo2);
        tvFrameGoles2 = vista.findViewById(R.id.tvFrameGoles2);
        tvFrameFaseDos = vista.findViewById(R.id.tvFrameFaseDos);
        tvFrameFechaDos = vista.findViewById(R.id.tvFrameFechaDos);
        tvFrameEquipo1Dos = vista.findViewById(R.id.tvFrameEquipo1Dos);
        tvFrameGoles1Dos = vista.findViewById(R.id.tvFrameGoles1Dos);
        tvFrameEquipo2Dos = vista.findViewById(R.id.tvFrameEquipo2Dos);
        tvFrameGoles2Dos = vista.findViewById(R.id.tvFrameGoles2Dos);
        tvFrameFaseTres = vista.findViewById(R.id.tvFrameFaseTres);
        tvFrameFechaTres = vista.findViewById(R.id.tvFrameFechaTres);
        tvFrameEquipo1Tres = vista.findViewById(R.id.tvFrameEquipo1Tres);
        tvFrameGoles1Tres = vista.findViewById(R.id.tvFrameGoles1Tres);
        tvFrameEquipo2Tres = vista.findViewById(R.id.tvFrameEquipo2Tres);
        tvFrameGoles2Tres = vista.findViewById(R.id.tvFrameGoles2Tres);
        tvFrameFaseCuatro = vista.findViewById(R.id.tvFrameFaseCuatro);
        tvFrameFechaCuatro = vista.findViewById(R.id.tvFrameFechaCuatro);
        tvFrameEquipo1Cuatro = vista.findViewById(R.id.tvFrameEquipo1Cuatro);
        tvFrameGoles1Cuatro = vista.findViewById(R.id.tvFrameGoles1Cuatro);
        tvFrameEquipo2Cuatro = vista.findViewById(R.id.tvFrameEquipo2Cuatro);
        tvFrameGoles2Cuatro = vista.findViewById(R.id.tvFrameGoles2Cuatro);
        tvFrameFaseCinco = vista.findViewById(R.id.tvFrameFaseCinco);
        tvFrameFechaCinco = vista.findViewById(R.id.tvFrameFechaCinco);
        tvFrameEquipo1Cinco = vista.findViewById(R.id.tvFrameEquipo1Cinco);
        tvFrameGoles1Cinco = vista.findViewById(R.id.tvFrameGoles1Cinco);
        tvFrameEquipo2Cinco = vista.findViewById(R.id.tvFrameEquipo2Cinco);
        tvFrameGoles2Cinco = vista.findViewById(R.id.tvFrameGoles2Cinco);
        tvFrameFaseSeis = vista.findViewById(R.id.tvFrameFaseSeis);
        tvFrameFechaSeis = vista.findViewById(R.id.tvFrameFechaSeis);
        tvFrameEquipo1Seis = vista.findViewById(R.id.tvFrameEquipo1Seis);
        tvFrameGoles1Seis = vista.findViewById(R.id.tvFrameGoles1Seis);
        tvFrameEquipo2Seis = vista.findViewById(R.id.tvFrameEquipo2Seis);
        tvFrameGoles2Seis = vista.findViewById(R.id.tvFrameGoles2Seis);
        tvFrameFaseSiete = vista.findViewById(R.id.tvFrameFaseSiete);
        tvFrameFechaSiete = vista.findViewById(R.id.tvFrameFechaSiete);
        tvFrameEquipo1Siete = vista.findViewById(R.id.tvFrameEquipo1Siete);
        tvFrameGoles1Siete = vista.findViewById(R.id.tvFrameGoles1Siete);
        tvFrameEquipo2Siete = vista.findViewById(R.id.tvFrameEquipo2Siete);
        tvFrameGoles2Siete = vista.findViewById(R.id.tvFrameGoles2Siete);



        ListaResultados listaResultados = new ListaResultados();
        ArrayList<Resultado> resultadosSeleccion = listaResultados.getListaResultados(seleccion);

        for (int i = 0; i < resultadosSeleccion.size(); i++) {
            switch (i) {
                case 0:
                    tvFrameFase.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFecha.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;
                case 1:
                    tvFrameFaseDos.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaDos.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Dos.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Dos.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Dos.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Dos.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;
                case 2:
                    tvFrameFaseTres.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaTres.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Tres.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Tres.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Tres.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Tres.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;
                case 3:
                    tvFrameFaseCuatro.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaCuatro.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Cuatro.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Cuatro.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Cuatro.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Cuatro.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;
                case 4:
                    tvFrameFaseCinco.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaCinco.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Cinco.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Cinco.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Cinco.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Cinco.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;
                case 5:
                    tvFrameFaseSeis.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaSeis.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Seis.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Seis.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Seis.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Seis.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;

                case 6:
                    tvFrameFaseSiete.setText(resultadosSeleccion.get(i).getFase());
                    tvFrameFechaSiete.setText(resultadosSeleccion.get(i).getFecha());
                    tvFrameEquipo1Siete.setText(resultadosSeleccion.get(i).getEquipoUno());
                    tvFrameGoles1Siete.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoUno()));
                    tvFrameEquipo2Siete.setText(resultadosSeleccion.get(i).getEquipoDos());
                    tvFrameGoles2Siete.setText(String.valueOf(resultadosSeleccion.get(i).getGolesEquipoDos()));
                    break;

            }

        }


        return vista;

    }


}
