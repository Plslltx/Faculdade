package Aula_260903._02_Condicional;
import java.util.Scanner;
public class Lixo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia;
        String nomeDia;
        System.out.print("Digite um número referente ao dia da semana:");
        dia=entrada.nextInt();
        if (dia==1)
            nomeDia="Domingo";
        else if (dia==2)
            nomeDia="Segunda-feira";
        else if (dia==3)
            nomeDia="Terça-feira";
        else if (dia==4)
            nomeDia="Quarta-feira";
        else if (dia==5)
            nomeDia="Quinta-feira";
        else if (dia==6)
            nomeDia="Sexta-feira";        
        else if (dia==7)
            nomeDia="Sábado";
        else
            nomeDia="Entrada inválida!";
        
        System.out.printf("Dia da Semana: %s%n",nomeDia);
    }
}