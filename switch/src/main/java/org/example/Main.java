package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int teste = 5;

        switch (teste){
            case 1: {
                System.out.println("Teste1");
                break;
            }
            case 2: {
                System.out.println("Teste2");
                break;
            }
            case 3: {
                System.out.println("Teste3");
                break;
            }
            case 4: {
                System.out.println("Teste4");
                break;
            }
            case 5: {
                System.out.println("Teste5");
                break;
            }
            default: {
                System.out.println("Teste Default");
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para manhã");
        System.out.println("Digite 2 para tarde");
        System.out.println("Digite 3 para noite");

        int periodoDia = scanner.nextInt();

        switch (periodoDia){
            case 1: {
                System.out.print("Bom dia");
                break;
            }
            case 2: {
                System.out.print("Boa tarde");
                break;
            }
            case 3: {
                System.out.print("Boa noite");
                break;
            }
            default: {
                System.out.print("Opção Inválida");
            }
        }
    }
}