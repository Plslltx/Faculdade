package TrabalhoPOO;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador2 comparador = new Comparador2();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        comparador.mostrarMaior(a, b);

        scanner.close();
    }
}

class Comparador2 {
    public void mostrarMaior(int a, int b) {
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("São iguais");
        }
    }
}
