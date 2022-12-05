package com.example.evaluaciont1_crj.datosSelecciones;

import java.util.ArrayList;

public class ListaResultados {
    ArrayList<Resultado> listaResultados;

    public ListaResultados() {
        listaResultados = new ArrayList<>();
        listaResultados.add(new Resultado("Fase de grupos", "20/11/2022 17:00", "Qatar", 0, "Ecuador", 2));
        listaResultados.add(new Resultado("Fase de grupos", "21/11/2022 14:00", "Inglaterra", 6, "Irán", 2));
        listaResultados.add(new Resultado("Fase de grupos", "21/11/2022 17:00", "Senegal", 0, "Países Bajos", 2));
        listaResultados.add(new Resultado("Fase de grupos", "21/11/2022 20:00", "Estados Unidos", 1, "Gales", 1));
        listaResultados.add(new Resultado("Fase de grupos", "22/11/2022 11:00", "Argentina", 1, "Arabia Saudí", 2));
        listaResultados.add(new Resultado("Fase de grupos", "22/11/2022 14:00", "Dinamarca", 0, "Túnez", 0));
        listaResultados.add(new Resultado("Fase de grupos", "22/11/2022 17:00", "México", 0, "Polonia", 0));
        listaResultados.add(new Resultado("Fase de grupos", "22/11/2022 20:00", "Francia", 4, "Australia", 1));
        listaResultados.add(new Resultado("Fase de grupos", "23/11/2022 11:00", "Marruecos", 0, "Croacia", 0));
        listaResultados.add(new Resultado("Fase de grupos", "23/11/2022 14:00", "Alemania", 1, "Japón", 2));
        listaResultados.add(new Resultado("Fase de grupos", "23/11/2022 17:00", "España", 7, "Costa Rica", 0));
        listaResultados.add(new Resultado("Fase de grupos", "23/11/2022 20:00", "Bélgica", 1, "Canadá", 0));
        listaResultados.add(new Resultado("Fase de grupos", "24/11/2022 11:00", "Suiza", 1, "Camerún", 0));
        listaResultados.add(new Resultado("Fase de grupos", "24/11/2022 14:00", "Uruguay", 0, "Corea del Sur", 0));
        listaResultados.add(new Resultado("Fase de grupos", "24/11/2022 17:00", "Portugal", 3, "Ghana", 2));
        listaResultados.add(new Resultado("Fase de grupos", "24/11/2022 20:00", "Brasil", 2, "Serbia", 0));
        listaResultados.add(new Resultado("Fase de grupos", "25/11/2022 11:00", "Gales", 0, "Irán", 2));
        listaResultados.add(new Resultado("Fase de grupos", "25/11/2022 14:00", "Qatar", 1, "Senegal", 3));
        listaResultados.add(new Resultado("Fase de grupos", "25/11/2022 17:00", "Países Bajos", 1, "Ecuador", 1));
        listaResultados.add(new Resultado("Fase de grupos", "25/11/2022 20:00", "Inglaterra", 0, "Estados Unidos", 0));
        listaResultados.add(new Resultado("Fase de grupos", "26/11/2022 11:00", "Túnez", 0, "Australia", 1));
        listaResultados.add(new Resultado("Fase de grupos", "26/11/2022 14:00", "Polonia", 2, "Arabia Saudí", 0));
        listaResultados.add(new Resultado("Fase de grupos", "26/11/2022 17:00", "Francia", 2, "Dinamarca", 1));
        listaResultados.add(new Resultado("Fase de grupos", "26/11/2022 20:00", "Argentina", 2, "México", 0));
        listaResultados.add(new Resultado("Fase de grupos", "27/11/2022 11:00", "Japón", 0, "Costa Rica", 1));
        listaResultados.add(new Resultado("Fase de grupos", "27/11/2022 14:00", "Bélgica", 0, "Marruecos", 2));
        listaResultados.add(new Resultado("Fase de grupos", "27/11/2022 17:00", "Croacia", 4, "Canadá", 1));
        listaResultados.add(new Resultado("Fase de grupos", "27/11/2022 20:00", "España", 1, "Alemania", 1));
        listaResultados.add(new Resultado("Fase de grupos", "28/11/2022 11:00", "Camerún", 3, "Serbia", 3));
        listaResultados.add(new Resultado("Fase de grupos", "28/11/2022 14:00", "Corea del Sur", 2, "Ghana", 3));
        listaResultados.add(new Resultado("Fase de grupos", "28/11/2022 17:00", "Brasil", 1, "Suiza", 0));
        listaResultados.add(new Resultado("Fase de grupos", "28/11/2022 20:00", "Portugal", 2, "Uruguay", 0));
    }

    public void addResultado(Resultado resultado) {
        listaResultados.add(resultado);
    }


    public ArrayList<Resultado> getListaResultados(String seleccion) {
        ArrayList<Resultado> lista = new ArrayList<>();
        for (int i = 0; i < listaResultados.size(); i++) {
            if (listaResultados.get(i).getEquipoUno().equals(seleccion) || listaResultados.get(i).getEquipoDos().equals(seleccion)) {
                lista.add(listaResultados.get(i));
            }
        }
        return lista;
    }
}
