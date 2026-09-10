
package _03_Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch_v1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        try{
            String nome;
            float n1, n2, media;

            System.out.print("Nome do aluno: ");
            nome = entrada.nextLine();

            System.out.print("Primeira nota: ");
            n1 = entrada.nextFloat();

            System.out.print("Segunda nota: ");
            n2=entrada.nextFloat();

            media = (n1+n2)/2;
            System.out.printf("%s ficou com a média %.2f%n",nome, media);
        
        }catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite números para notas do aluno.");
        }  
    }
}
