import java.util.Scanner;

public class Main {

    // Função para área do triângulo
    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Função para área do círculo
    public static double circulo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    // Função para área do losango
    public static double losango(double D, double d) {
        return (D * d) / 2;
    }

    // Função para área do retângulo
    public static double retangulo(double base, double altura) {
        return base * altura;
    }

    // Função para área do trapézio
    public static double trapezio(double B, double b, double altura) {
        return ((B + b) * altura) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nVocê quer calcular:");
        System.out.println("[1] Triângulo");
        System.out.println("[2] Círculo");
        System.out.println("[3] Losango");
        System.out.println("[4] Retângulo");
        System.out.println("[5] Trapézio");
        System.out.print("Escolha uma opção: ");

        String op = sc.nextLine();

        switch (op) {
            case "1":
                System.out.println("\nVocê escolheu Triângulo");
                System.out.print("Digite a altura: ");
                double a1 = sc.nextDouble();
                System.out.print("Digite a base: ");
                double b1 = sc.nextDouble();
                System.out.printf("\nÁrea = %.2f\n", triangulo(b1, a1));
                break;

            case "2":
                System.out.println("\nVocê escolheu Círculo");
                System.out.print("Digite o raio: ");
                double r = sc.nextDouble();
                System.out.printf("\nÁrea = %.2f\n", circulo(r));
                break;

            case "3":
                System.out.println("\nVocê escolheu Losango");
                System.out.print("Digite a diagonal maior: ");
                double D = sc.nextDouble();
                System.out.print("Digite a diagonal menor: ");
                double d = sc.nextDouble();
                System.out.printf("\nÁrea = %.2f\n", losango(D, d));
                break;

            case "4":
                System.out.println("\nVocê escolheu Retângulo");
                System.out.print("Digite a base: ");
                double br = sc.nextDouble();
                System.out.print("Digite a altura: ");
                double ar = sc.nextDouble();
                System.out.printf("\nÁrea = %.2f\n", retangulo(br, ar));
                break;

            case "5":
                System.out.println("\nVocê escolheu Trapézio");
                System.out.print("Digite a base maior: ");
                double B = sc.nextDouble();
                System.out.print("Digite a base menor: ");
                double b = sc.nextDouble();
                System.out.print("Digite a altura: ");
                double at = sc.nextDouble();
                System.out.printf("\nÁrea = %.2f\n", trapezio(B, b, at));
                break;

            default:
                System.out.println("\nOpção inválida!");
        }

        sc.close();
    }
}
