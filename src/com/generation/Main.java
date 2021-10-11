package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Validacion de año bisiesto
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el año que quieres calcular");
        int anio = sc.nextInt();
        if (anio % 4 == 0 &&
                anio % 100 != 0 ||
                anio % 400 == 0) {
            System.out.println("El año " + anio + ", es bisiesto");
        } else {
            System.out.println("El año " + anio + ", no es bisiesto");
        }
    }
}
