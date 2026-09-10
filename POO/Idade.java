package Aula_260819;
import java.util.Scanner;
public class Idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int anoAtual, anoNasc, idade;
        
        System.out.print("Ano atual: ");
        anoAtual = sc.nextInt();
        
        System.out.print("Ano de nascimento: ");
        anoNasc=sc.nextInt();
        
        idade = anoAtual - anoNasc;
        System.out.println("Idade do(a) Candango(a): " + idade);
    }
}
