package program;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, numMulheres = 0, numHomens = 0, contador = 0;
        double maiorAltura = 0.0, menorAltura = Double.MAX_VALUE, mediaAltura = 0.0;
        double somaAlturasMulheres = 0.0;

        System.out.println("Quantas pessoas serão digitadas?");
        n = sc.nextInt();

        double[] altura = new double[n];
        String[] genero = new String[n];

        for (int i = 0; i < n; i++) { 
            contador++;

            System.out.println("Altura da " + contador + "a pessoa:");
            altura[i] = sc.nextDouble();

            System.out.println("Genero da " + contador + "a pessoa:");
            genero[i] = sc.next(); 

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (genero[i].equalsIgnoreCase("F")) {
                numMulheres++;
                somaAlturasMulheres += altura[i];
            } else if (genero[i].equalsIgnoreCase("M")) {
                numHomens++;
            }
        }

        if (numMulheres > 0) {
            mediaAltura = somaAlturasMulheres / numMulheres;
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres %.2f = ", mediaAltura);
        System.out.println();
        System.out.println("Número de homens = " + numHomens);

        sc.close();
    }
}