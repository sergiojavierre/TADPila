package com.sergiojavierre;

public class Main {

    public static void main(String[] args) {
	    Pila pila = new Pila();
	    pila.apilar(1);
	    pila.apilar(2);
	    pila.mostrarElementos();
	    pila.mostrarNumeroDeElementos();
        System.out.println("Desapilando " + pila.desapilar());
        pila.apilar(3);
        pila.mostrarElementos();
        pila.mostrarNumeroDeElementos();
    }
}
