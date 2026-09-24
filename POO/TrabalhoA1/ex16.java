package TrabalhoPOO;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        Nadador nadador = new Nadador(idade);
        nadador.mostrarCategoria();

        scanner.close();
    }
}

class Nadador {
    private int idade;

    public Nadador(int idade) {
        this.idade = idade;
    }

    public String classificar() {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Senior";
        } else {
            return "idade fora da faixa etária";
        }
    }

    public void mostrarCategoria() {
        System.out.println("Categoria: " + classificar());
    }
}