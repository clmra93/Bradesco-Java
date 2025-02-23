package DesafiosCódigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
        double saldoFinal = saldoInicial; // Inicializa saldoFinal com saldoInicial
        int transacoes = 0;

        // Entrada das três transações
        while (transacoes < 3) {
            double operacao = scanner.nextDouble();
            saldoFinal += operacao; // Adiciona ou subtrai a operação do saldo
            transacoes++;
        }

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}