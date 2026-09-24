package TrabalhoPOO;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador5 comparador = new Comparador5();

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        comparador.mostrarMaiorMenor(a, b, c);

        scanner.close();
    }
}

class Comparador5 {
    public void mostrarMaiorMenor(int a, int b, int c) {
        int maior = a;
        int menor = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}