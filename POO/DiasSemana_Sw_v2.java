package _02_Condicional;

//package Pacote1;
import java.util.Scanner;
public class DiasSemana_Sw_v2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        String nome_dia;
        
        System.out.print("Informe o número referente ao dia da semana (de 1 à 7): ");
        dia = entrada.nextInt();
        
        nome_dia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "";
        };
        if (nome_dia == ""){
            System.out.println("Valor inválido. Digite um número entre 1 e 7!");
        } else {
            System.out.println("Dia da sermana: " + nome_dia);
        }
    }
}
