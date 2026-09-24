package TrabalhoPOO;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1-Residência, 2-Comércio, 3-Indústria): ");
        int tipo = scanner.nextInt();

        System.out.print("Digite o consumo em KW/h: ");
        double consumo = scanner.nextDouble();

        ContaDeLuz conta = new ContaDeLuz(tipo, consumo);
        conta.mostrarValor();

        scanner.close();
    }
}

class ContaDeLuz {
    private int tipo;
    private double consumo;

    public ContaDeLuz(int tipo, double consumo) {
        this.tipo = tipo;
        this.consumo = consumo;
    }

    public double obterValorKwh() {
        if (tipo == 1) {
            return 0.89;
        } else if (tipo == 2) {
            return 0.68;
        } else if (tipo == 3) {
            return 1.55;
        } else {
            return 0;
        }
    }

    public double calcularConta() {
        return consumo * obterValorKwh();
    }

    public void mostrarValor() {
        double valorKwh = obterValorKwh();

        if (valorKwh == 0) {
            System.out.println("Tipo de cliente inválido.");
        } else {
            System.out.println("Valor da conta de luz: R$ " + calcularConta());
        }
    }
}