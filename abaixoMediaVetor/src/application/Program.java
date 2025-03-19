package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n;
        double soma = 0; // Alterado para double
        double mediaVetor; // Alterado para double

        System.out.println("Quantos elementos o vetor vai possuir? ");
        n = sc.nextDouble();

        double[] vetor = new double[(int) n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        mediaVetor = soma / n; // Cálculo da média com números de ponto flutuante

        System.out.printf("Media do vetor: %.3f%n", mediaVetor); // %n adicionado para quebra de linha

        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}