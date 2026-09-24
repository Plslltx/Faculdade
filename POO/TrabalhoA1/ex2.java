package TrabalhoPOO;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorIntervalo verificador = new VerificadorIntervalo();

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        verificador.verificar(numero);

        scanner.close();
    }
}

class VerificadorIntervalo {
    public void verificar(int numero) {
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número " + numero + " está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número " + numero + " não está no intervalo entre 100 e 200.");
        }
    }
}
