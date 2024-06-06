package com.entornos.calculadora;

public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(3, 4);

        System.out.println(calc.realizarOperación("suma"));
    }
}