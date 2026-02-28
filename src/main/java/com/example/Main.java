package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion = new CamionDeReparto("B178", -12, 12, true);

        BuqueCarga buque = new BuqueCarga("T481", 14, 70, 50);

        camion.setCombustible(-20);
        System.out.println("combustible: " + camion.getCombustible());

        System.out.println("\n---- DEMOSTRACIÓN DE POLIMORFISMO ----");

        ArrayList<Transporte> flota = new ArrayList<>();

        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            System.out.println("\nTransporte ID: " + t.getIdTransporte());
            System.out.println("Combustible antes del viaje: " + t.getCombustible());

            t.viajar(100);

            System.out.println("Combustible después del viaje: " + t.getCombustible());
        }

        System.out.println("\n---- BUQUE EN PUERTO ----");
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}