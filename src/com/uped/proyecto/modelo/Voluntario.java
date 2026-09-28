package com.uped.proyecto.modelo;

public class Voluntario extends Persona {
    private String proyectoAsignado;
    private int horasComunitarias;

    public Voluntario(String nombre, String dui, String proyectoAsignado, int horasComunitarias) {
        super(nombre, dui);
        this.proyectoAsignado = proyectoAsignado;
        this.horasComunitarias = horasComunitarias;
    }

    public String getProyectoAsignado() {
        return proyectoAsignado;
    }

    public int getHorasComunitarias() {
        return horasComunitarias;
    }

    @Override
    public double calcularBeneficioAnual() {
        return horasComunitarias * 5.0;
    }

    @Override
    public String toString() {
        return presentarse() + " | Proyecto: " + proyectoAsignado;
    }
}