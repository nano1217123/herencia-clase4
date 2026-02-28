package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible  = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            throw new IllegalArgumentException("error: Valor negativo, no hay carga");
        } else {
            this.capacidadCarga = carga;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

 public int viajar(int distancia) {
    int consumo = distancia / 10;

    if (this.combustible >= consumo) {
        this.combustible -= consumo;
    } else {
        this.combustible = 0;
        System.out.println("No hubo combustible suficiente para todo el trayecto.");
    }
    
    return (int) this.combustible;
}
}
