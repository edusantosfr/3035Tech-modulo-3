package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        String[] nomes = new String[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um %dº numero: ", i+1);
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        numeros[0] = 1234;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição do array" + i);
            System.out.println("Valor do indice do array" + numeros[i]);
        }
    }
}