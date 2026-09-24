package TrabalhoPOO;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        PessoaPesoIdeal pessoa = new PessoaPesoIdeal(nome, sexo, altura, idade);
        pessoa.mostrarPesoIdeal();

        scanner.close();
    }
}

class PessoaPesoIdeal {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public PessoaPesoIdeal(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    return (72.7 * altura) - 53;
                } else {
                    return (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    return (72.7 * altura) - 50;
                } else {
                    return (72.7 * altura) - 58;
                }
            }
        } else {
            if (altura > 1.50) {
                if (idade >= 35) {
                    return (62.1 * altura) - 44.7;
                } else {
                    return (62.1 * altura) - 49;
                }
            } else {
                if (idade >= 35) {
                    return (62.1 * altura) - 45;
                } else {
                    return (62.1 * altura) - 49;
                }
            }
        }
    }

    public void mostrarPesoIdeal() {
        System.out.println("Nome: " + nome);
        System.out.printf("Peso ideal: %.2f kg%n", calcularPesoIdeal());
    }
}