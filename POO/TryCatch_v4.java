package _03_Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch_v4 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        try {
            double n1, n2, resultado;
            System.out.print("Primeiro número: ");
            n1 = entrada.nextDouble();
            System.out.print("Segundo número: ");
            n2 = entrada.nextDouble();
            resultado = n1/n2;
            System.out.printf("O resultado da divisão é: %.2f%n", resultado); 
        
        }catch (InputMismatchException e){
            System.out.println("Entrada inválida! Digite somente números.");
            System.err.println("Exception: " + e);
        }catch (ArithmeticException e) {
            // Captura a exceção e exibe uma mensagem de erro
            System.err.println("Erro: Divisão por zero não é permitida.");
        }catch (Exception e){
            System.err.println("Erro desconhecido! Entre em contato com a equipe de desenvolvimento.");
        }finally {
            // O bloco finally sempre é executado
            System.err.println("Bloco finally executado.");
        }
    }
}