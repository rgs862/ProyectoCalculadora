package com.entornos.calculadora;

public class Calculadora {
    private int numero1, numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int realizarOperación(String operacion) {

        switch (operacion) {
            case "suma":
                return numero1 + numero2;

            default:
                return numero1 + numero2;

        }

    }

}
