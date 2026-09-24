package TrabalhoPOO;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador3 comparador = new Comparador3();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        comparador.mostrarMaior(a, b, c);

        scanner.close();
    }
}

class Comparador3 {
    public void mostrarMaior(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);
    }
}