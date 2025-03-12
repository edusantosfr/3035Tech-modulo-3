package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int contador = 10;
//
//        int comparador = 5;
//
//        if (contador > comparador) {
//            System.out.println("Executou!!");
//        }

        Scanner sc = new Scanner(System.in);

//        System.out.print("Por favor digite a sua idade: ");
//        int idade = sc.nextInt();
//        final int IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
//
//        if (idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA) {
//            System.out.println("Você já pode tirar sua carteira de motorista!!");
//        } else {
//            System.out.println("Ops, você não tem idade para tirar sua carteira de motorista...");
//        }

        System.out.print("Por favor digite a sua nota: ");
        int nota = sc.nextInt();
        final int NOTA_MINIMA_PARA_NAO_REPROVAR = 30;
        final int NOTA_MINIMA_PARA_RECUPERACAO = 50;

        if (nota < NOTA_MINIMA_PARA_NAO_REPROVAR) {
            System.out.println("Você foi reprovado!!");
        } else if (nota < NOTA_MINIMA_PARA_RECUPERACAO) {
            System.out.println("Você pegou recuperação");
        } else {
            System.out.println("Parabéns, você foi aprovado!!!");
        }
    }
}