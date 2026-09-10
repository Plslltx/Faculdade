package Aula_260819;
import java.util.Scanner;
public class If_MaiorMenorIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int anoAtual, anoNasc, idade;
        
        System.out.print("Ano atual: ");
        anoAtual = sc.nextInt();
        
        System.out.print("Ano de nascimento: ");
        anoNasc=sc.nextInt();
        
        idade = anoAtual - anoNasc;
        System.out.println("Idade do(a) Candango(a): " + idade);
        
        if (idade>18)
            System.out.println("É de maior idade");
        else
            System.out.println("É de menor idade");
    }
}
