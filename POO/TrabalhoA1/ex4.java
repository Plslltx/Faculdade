package TrabalhoPOO;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador comparador = new Comparador();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        comparador.mostrarMaior(a, b);

        scanner.close();
    }
}

class Comparador {
    public void mostrarMaior(int a, int b) {
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais: " + a);
        }
    }
}