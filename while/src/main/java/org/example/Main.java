package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número qualquer: ");
        int numero = scanner.nextInt();

        while (numero < 10) {
            System.out.println("Numero: " + numero);
            System.out.print("Informe mais um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Sistema Encerrado!!");
    }
}