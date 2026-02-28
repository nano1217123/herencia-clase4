package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga,
            boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;

    }

    @Override
    public int viajar(int distancia) {
        int consumo = distancia / 10;
        if (tieneRefrigeracion) {
            consumo = distancia / 5;
            if (getCombustible() >= consumo) {
                setCombustible(getCombustible() - consumo * 2);
            } else {
                setCombustible(0);
                System.out.println("No hubo combustible suficiente para todo el trayecto.");
            }
        } else {
            if (getCombustible() >= consumo) {
                setCombustible(getCombustible() - consumo);
            } else {
                setCombustible(0);
                System.out.println("No hubo combustible suficiente para todo el trayecto.");
            }
        }

        return (int) getCombustible();
    }
}
