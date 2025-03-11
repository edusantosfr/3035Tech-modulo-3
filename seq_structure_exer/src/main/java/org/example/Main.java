package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (true) {

            int option = 0;
            System.out.println("Menu");
            System.out.println("1. Exercício-1");
            System.out.println("2. Exercício-2");
            System.out.println("3. Exercício-3");
            System.out.println("0. Sair");

            System.out.print("\nDigite sua Opção: ");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                Ex1();
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 0) {
                break;
            }
        }
    }

    public static void Ex1() {
        System.out.println("\nExercicio 1");
        System.out.print("Olá, por favor informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Agora informe sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.printf("\nNome: %s\nIdade: %d", nome, idade);
        System.out.println("\n");
    }

    public static void Ex2() {

    }

    public static void Ex3() {

    }
}