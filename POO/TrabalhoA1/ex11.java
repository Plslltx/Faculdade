package TrabalhoPOO;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de matrícula: ");
        int matricula = scanner.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Estudante estudante = new Estudante(nome, matricula, nota1, nota2, nota3);
        estudante.mostrarResultado();

        scanner.close();
    }
}

class Estudante {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public char classificar(double notaFinal) {
        if (notaFinal >= 8) {
            return 'A';
        } else if (notaFinal >= 7) {
            return 'B';
        } else if (notaFinal >= 6) {
            return 'C';
        } else if (notaFinal >= 5) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public void mostrarResultado() {
        double notaFinal = calcularNotaFinal();
        char classificacao = classificar(notaFinal);

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }
}