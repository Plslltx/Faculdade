package Aula_260903._02_Condicional;
import java.util.Scanner;
public class Lixo2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia;
        String nomeDia;
        System.out.print("Digite um número referente ao dia da semana:");
        dia=entrada.nextInt();
        nomeDia="-";
        switch (dia){ 
            case 1:
                nomeDia+="Domingo";
                break;
            case 2:
                nomeDia+="Segunda-feira";
                break;
            case 3:
                nomeDia+="Terça-feira";
                break;
            case 4:
                nomeDia+="Quarta-feira";
                break;
            case 5:
                nomeDia+="Quinta-feira";
                break;
            case 6:
                nomeDia+="Sexta-feira";        
                break;
            case 7:
                nomeDia+="Sábado";
                break;
            default:
                nomeDia+="Entrada inválida!";
                break;
        }
        
        System.out.printf("Dia da Semana: %s%n",nomeDia);
    }
}