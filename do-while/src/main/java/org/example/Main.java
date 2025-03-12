package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(5);
        int numeroUsuario = 0;

        do {
            System.out.println("Seja Bem Vindo(a) ao jogo de adivinha!!!");
            System.out.print("Digite um número de um 1 à 5: ");
            numeroUsuario = scanner.nextInt();

        } while (numeroSecreto != numeroUsuario);

        System.out.println("Número Secreto: " + numeroSecreto);
        System.out.println("Sistema Encerrado");
    }
}