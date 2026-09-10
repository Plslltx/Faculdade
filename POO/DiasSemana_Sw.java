package _02_Condicional;

//package Pacote1;
import java.util.Scanner;
public class DiasSemana_Sw {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        String nome_dia;
        
        System.out.print("Informe o número referente ao dia da semana (de 1 à 7): ");
        dia = entrada.nextInt();
        
        switch(dia) {
            case 1:
                nome_dia = "Domingo";
                break;
            case 2:
                nome_dia = "Segunda-feira";
                break;
            case 3:
                nome_dia = "Terça-feira";
                break;
            case 4:
                nome_dia = "Quarta-feira";
                break;
            case 5:
                nome_dia = "Quinta-feira";
                break;
            case 6:
                nome_dia = "Sexta-feira";
                break;
            case 7:
                nome_dia = "Sábado";
                break;
            default:
                nome_dia = "";
                break;
        }
        if (nome_dia == ""){
            System.out.println("Valor inválido. Digite um número entre 1 e 7!");
        } else {
            System.out.println("Dia da sermana: " + nome_dia);
        }
    }
}
