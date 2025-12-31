package Atividades;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String id = ("Daniel Dos Santos Guimaraes");
        String cc = ("Corrente");
        double saldo = 2000;
        int opcao = 0;

        String menu = ("\nOperações:\n 1-Consultar Saldos \n 2-Receber Valor \n 3-Transferir Valor \n 4-Sair \nInforme a opção desejada");

        System.out.println("\n************************************************************");
        System.out.println("Dados iniciais do Cliente:\n");
        System.out.printf("Nome:                 %s\n", id);
        System.out.printf("Tipo de Conta:        %s\n", cc);
        System.out.printf("Saldo total:          R$%s\n", saldo);
        System.out.println("************************************************************");
        System.out.println(menu);

        while (opcao != 4) {
            opcao = leitura.nextInt();
            for (int i = 0; i < 50; ++i) System.out.println();
            if (opcao == 1) {
                System.out.printf("************************************************************\n" +
                        "\n\nSeu Saldo e de:                R$%s\n\n\n", saldo);
                System.out.println("************************************************************");
                System.out.println(menu);
            }
            if (opcao == 2) {
                System.out.println("************************************************************\n\n\n" +
                        "Quanto de dinheiro você vai depositar?\n\n\n" +
                        "************************************************************\n");
                double vlMovimentado = 0;
                vlMovimentado = leitura.nextDouble();
                if (true) {
                    saldo += vlMovimentado;
                    System.out.printf("Seu Saldo a parti de agora e de: R$" + saldo);
                    System.out.println(menu);
                }
            }
            if (opcao == 3) {
                System.out.println("************************************************************\n\n\n" +
                        "Quanto de dinheiro você vai Transferir?\n\n\n" +
                        "************************************************************\n");
                double vlMovimentado = 0;
                vlMovimentado = leitura.nextDouble();
                if (vlMovimentado > saldo) {
                    System.out.println("Seu saldo e menor que a quantidade deseja para a transação");
                    System.out.println(menu);
                } else if (true) {
                    saldo -= vlMovimentado;
                    System.out.printf("Seu Saldo a parti de agora e de: R$" + saldo);
                    System.out.println(menu);
                }
            }
            if (opcao == 4) {
                System.out.println("Sessão Finalizada");
                 break;
            }
            if (opcao > 4) {
                System.out.println("***********************************************************\n\n\n" +
                        "Opção invalida, digite outra opção\n\n\n" +
                        "************************************************************\n");
                System.out.println(menu);
            }
        }
    }
}