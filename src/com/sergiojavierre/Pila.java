package com.sergiojavierre;

import java.util.ArrayList;
import java.util.List;

public class Pila {

    //El primer elemento es la base y el último es la cima
    private List<Integer> elementos = null;

    public Pila(){
        elementos = new ArrayList<>();
    }

    void apilar(Integer i){
        elementos.add(i);
    }

    Integer desapilar(){
        int ultimaPosicion = elementos.size();
        Integer elemento = elementos.remove(ultimaPosicion-1);
        return elemento;
    }

    void mostrarNumeroDeElementos(){
        System.out.format("Hay %d elementos\n",elementos.size());
    }

    void mostrarElementos(){
        elementos.forEach(elemento->{
            System.out.println(elemento);
        });
    }
}
