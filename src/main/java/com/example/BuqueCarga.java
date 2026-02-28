package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void setCantidadContenedores(int cantidadContenedores) {
        if (cantidadContenedores < 0) {
            System.out.println("Error: cantidad invalida");
        } else {
            this.cantidadContenedores = cantidadContenedores;
        }
    }

    public int getCantidadContenedores() {
        return cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("ID: " + getIdTransporte() + " esta listo para la descarga");
    }

    public void mostrarDatos() {

        double costoViaje = cantidadContenedores * 100;

        System.out.println("--DATOS DEL BUQUE");
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible actual: " + getCombustible());
        System.out.println("Cantidad de contenedores: " + cantidadContenedores);
        System.out.println("Costo de viaje: " + costoViaje + "$");

    }
}
