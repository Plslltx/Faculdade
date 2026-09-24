package TrabalhoPOO;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        FuncionarioAbono funcionario = new FuncionarioAbono(nome, idade, sexo, salarioBruto);
        funcionario.mostrarSalarioLiquido();

        scanner.close();
    }
}

class FuncionarioAbono {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioBruto;

    public FuncionarioAbono(String nome, int idade, char sexo, double salarioBruto) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            if (idade >= 30) {
                return 100.00;
            } else {
                return 50.00;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                return 200.00;
            } else {
                return 80.00;
            }
        }
        return 0;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto + calcularAbono();
    }

    public void mostrarSalarioLiquido() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário líquido: " + calcularSalarioLiquido());
    }
}