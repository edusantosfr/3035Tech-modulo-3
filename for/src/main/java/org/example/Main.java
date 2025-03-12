package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota para o %d aluno:", i + 1);
            double nota = scanner.nextDouble();

            System.out.printf("\nO aluno %d está com a nota: %.2f\n", i + 1, nota);
        }

        System.out.println("Sistema Encerrado!");
    }
}