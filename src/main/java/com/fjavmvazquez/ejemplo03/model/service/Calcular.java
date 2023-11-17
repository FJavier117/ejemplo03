package com.fjavmvazquez.ejemplo03.model.service;

import com.fjavmvazquez.ejemplo03.model.ModelCalcular;

public class Calcular {
    private final ModelCalcular modelCalcular;
    public Calcular(ModelCalcular modelCalcular){
        this.modelCalcular = modelCalcular;
    }

    public void velocidad(){
        double velocidad = modelCalcular.getDistancia() / (modelCalcular.gettFinal() - modelCalcular.gettInicial());
        modelCalcular.setVelocidad(velocidad);
    }

    public void tiempoTotal(){
        double tTotal = modelCalcular.gettFinal() - modelCalcular.gettInicial();
        modelCalcular.settTotal(tTotal);
    }
}
