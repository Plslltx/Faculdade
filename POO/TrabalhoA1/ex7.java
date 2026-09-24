package TrabalhoPOO;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador4 comparador = new Comparador4();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        comparador.mostrarMaiorMenor(a, b);

        scanner.close();
    }
}

class Comparador4 {
    public void mostrarMaiorMenor(int a, int b) {
        if (a > b) {
            System.out.println("O maior número é: " + a);
            System.out.println("O menor número é: " + b);
        } else {
            System.out.println("O maior número é: " + b);
            System.out.println("O menor número é: " + a);
        }
    }
}