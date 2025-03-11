package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int numero = 10;
//
//        System.out.println(numero);
//        System.out.print("Hello Teach");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro Número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Segundo Número: ");
        int segundoNumero = scanner.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma: " + resultado);
    }
}