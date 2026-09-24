package TrabalhoPOO;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o código do cargo: ");
        int codigo = scanner.nextInt();

        Funcionario funcionario = new Funcionario(salario, codigo);
        funcionario.mostrarReajuste();

        scanner.close();
    }
}

class Funcionario {
    private double salario;
    private int codigo;

    public Funcionario(double salario, int codigo) {
        this.salario = salario;
        this.codigo = codigo;
    }

    public double obterPercentual() {
        switch (codigo) {
            case 101:
                return 10;
            case 102:
                return 20;
            case 103:
                return 30;
            default:
                return 40;
        }
    }

    public double calcularNovoSalario() {
        return salario + (salario * obterPercentual() / 100);
    }

    public void mostrarReajuste() {
        double novoSalario = calcularNovoSalario();
        double diferenca = novoSalario - salario;

        System.out.println("Salário antigo: " + salario);
        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Diferença: " + diferenca);
    }
}