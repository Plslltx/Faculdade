package TrabalhoPOO;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordenador ordenador = new Ordenador();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        ordenador.mostrarCrescente(a, b, c);

        scanner.close();
    }
}

class Ordenador {
    public void mostrarCrescente(int a, int b, int c) {
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}