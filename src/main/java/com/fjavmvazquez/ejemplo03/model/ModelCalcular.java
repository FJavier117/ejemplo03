package com.fjavmvazquez.ejemplo03.model;

import java.util.Objects;

public class ModelCalcular {
    private double tInicial;
    private double tFinal;
    private double distancia;
    private double velocidad;
    private double tTotal;

    public ModelCalcular(String tInicial, String tFinal, String distancia) {
        this.tInicial = Double.parseDouble(tInicial);
        this.tFinal = Double.parseDouble(tFinal);
        this.distancia = Double.parseDouble(distancia);
    }

    public double gettInicial() {
        return tInicial;
    }

    public double gettFinal() {
        return tFinal;
    }


    public double getDistancia() {
        return distancia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double gettTotal() {
        return tTotal;
    }

    public void settTotal(double tTotal) {
        this.tTotal = tTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelCalcular that = (ModelCalcular) o;
        return Double.compare(tInicial, that.tInicial) == 0 && Double.compare(tFinal, that.tFinal) == 0 && Double.compare(distancia, that.distancia) == 0 && Double.compare(velocidad, that.velocidad) == 0 && Double.compare(tTotal, that.tTotal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tInicial, tFinal, distancia, velocidad, tTotal);
    }

    @Override
    public String toString() {
        return "ModelCalcular{" +
                "tInicial=" + tInicial +
                ", tFinal=" + tFinal +
                ", distancia=" + distancia +
                ", velocidad=" + velocidad +
                ", tTotal=" + tTotal +
                '}';
    }
}
