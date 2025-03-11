package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String nome = "";
//        int idade = 0;
//
//        Scanner scaneer = new Scanner(System.in);
//
//        System.out.print("Digite o seu Nome: ");
//        nome = scaneer.nextLine();
//
//        System.out.print("Digite o sua Idade: ");
//        idade = scaneer.nextInt();
//
//        System.out.printf("Nome: %s\nIdade: %d", nome, idade);

        double pi = Math.PI;
        System.out.printf("Pi = %f\n", pi);
        System.out.printf("Pi = %.2f\n", pi);
        System.out.printf("Pi = %10.2f\n", pi);
        System.out.printf(Locale.CANADA,"Pi = %f\n", pi);
    }
}