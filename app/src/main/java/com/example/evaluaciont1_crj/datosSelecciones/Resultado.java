package com.example.evaluaciont1_crj.datosSelecciones;

public class Resultado {
    private String fase;
    private String fecha;
    private String equipoUno;
    private int golesEquipoUno;
    private String equipoDos;
    private int golesEquipoDos;

    public Resultado(String fase, String fecha, String equipoUno, int golesEquipoUno, String equipoDos, int golesEquipoDos) {
        this.fase = fase;
        this.fecha = fecha;
        this.equipoUno = equipoUno;
        this.golesEquipoUno = golesEquipoUno;
        this.equipoDos = equipoDos;
        this.golesEquipoDos = golesEquipoDos;
    }

    public String getFase() {
        return fase;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEquipoUno() {
        return equipoUno;
    }

    public int getGolesEquipoUno() {
        return golesEquipoUno;
    }

    public String getEquipoDos() {
        return equipoDos;
    }

    public int getGolesEquipoDos() {
        return golesEquipoDos;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "fase='" + fase + '\'' +
                ", fecha='" + fecha + '\'' +
                ", equipoUno='" + equipoUno + '\'' +
                ", golesEquipoUno=" + golesEquipoUno +
                ", equipoDos='" + equipoDos + '\'' +
                ", golesEquipoDos=" + golesEquipoDos +
                '}';
    }
}
