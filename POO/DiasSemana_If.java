package _02_Condicional;

import java.util.Scanner;
public class DiasSemana_If {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia;
        String ndia="";
        System.out.print("Informe um número de 1 a 7 referente ao dia da semana: ");
        dia = entrada.nextInt();
        
        if (dia == 1){
            ndia="Domingo";
        } else if (dia == 2){
            ndia = "Segunda-feira";
        }else if (dia == 3){
            ndia = "Terça-feira";
        }else if (dia == 4){
            ndia = "Quarta-feira";
        }else if (dia == 5){
            ndia = "Quinta-feira";
        }else if (dia == 6){                
            ndia = "Sexta-feira";
        }else if (dia == 7){
            ndia = "Sábado";
        }
        //---------------------------------
        if (ndia == ""){
            System.out.println("Entrada inválida!");
        }else {
            System.out.println("Dia da Semana: " + ndia);
        }
    }
}
