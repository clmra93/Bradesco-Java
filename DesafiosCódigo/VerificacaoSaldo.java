package DesafiosCódigo;

import java.util.Scanner;

public class VerificacaoSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        if (saldo < 0) {
          System.out.println("Negativado");
        }
        else if (saldo < 500) {
          System.out.println("Baixo");
        }
        else {
          System.out.println("Confortavel");
        }


        scanner.close();
    }
}