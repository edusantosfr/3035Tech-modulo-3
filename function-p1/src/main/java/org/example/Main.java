package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean novoCalculo;

        do {
            System.out.print("Informe o 1 número: ");
            int primeiroNumero = Integer.parseInt(scanner.nextLine());

            System.out.print("Informe o 2 número: ");
            int segundoNumero = Integer.parseInt(scanner.nextLine());
            char operacao;

            do {
                System.out.println("Informe a Operação");
                System.out.print("Operações Válidas: + - *: ");
                operacao = scanner.next().charAt(0);

                if (verificaOperacao(operacao)) {
                    System.out.println("Operação Inválida. Tente novamente.");
                }
            } while (verificaOperacao(operacao));

            switch (operacao) {
                case '+': {
                    calculoSomar(primeiroNumero, segundoNumero);
                    break;
                }
                case '-': {
                    calculoSubtracao(primeiroNumero, segundoNumero);
                    break;
                }
                default: {
                    calculoMultiplicacao(primeiroNumero, segundoNumero);
                }
            }

            System.out.println("Você gostaria de fazer mais um cálculo");
            System.out.print("Digite true para SIM e false para NÃO: ");
            novoCalculo = scanner.nextBoolean();

        } while (novoCalculo);

        System.out.println("Sistema Encerrado!");
    }

    public static boolean verificaOperacao(char operacao) {
        boolean retornoVerificaOperacao = operacao != '+' && operacao != '-' && operacao != '*';

        return retornoVerificaOperacao;
    }

    public static void calculoSomar(int primeiroNumero, int segundoNumero) {
        System.out.println(primeiroNumero + segundoNumero);
    }

    public static void calculoSubtracao(int primeiroNumero, int segundoNumero) {
        System.out.println(primeiroNumero - segundoNumero);
    }

    public static void calculoMultiplicacao(int primeiroNumero, int segundoNumero) {
        System.out.println(primeiroNumero * segundoNumero);
    }
}