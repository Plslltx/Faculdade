
package TrabalhoPOO;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorNumero verificador = new VerificadorNumero();

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        verificador.verificar(numero);

        scanner.close();
    }
}

class VerificadorNumero {
    public void verificar(int numero) {
        if (numero > 10) {
            System.out.println("O número " + numero + " é maior que 10.");
        }
    }
}
