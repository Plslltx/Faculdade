package _01_Sequencial;

import java.util.Scanner;

public class String_Upper_Lower {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;  //Observe que o tipo String inicia com letra maiúscula.
        System.out.print("Seu nome: ");
        nome = entrada.nextLine(); //Observe que, para String, usa-se nextLine()
        
        System.out.printf("Seu nome: %s%n",nome);
        System.out.printf("Seu nome em caixa alta: %s%n", nome.toUpperCase());
        System.out.printf("Seu nome em caixca baixa: %s\n", nome.toLowerCase());
    }
}
