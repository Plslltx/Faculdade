package TrabalhoPOO;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo lado: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int c = scanner.nextInt();

        Triangulo triangulo = new Triangulo(a, b, c);
        triangulo.mostrarTipo();

        scanner.close();
    }
}

class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean ehTriangulo() {
        return lado1 < lado2 + lado3
                && lado2 < lado1 + lado3
                && lado3 < lado1 + lado2;
    }

    public void mostrarTipo() {
        if (!ehTriangulo()) {
            System.out.println("Os valores informados não formam um triângulo.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}