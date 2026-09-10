package Aula_260819;
import java.util.Scanner;
public class If_MaiorNum {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float n1,n2,maior;
        
        System.out.print("Primeiro número: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Segundo número: ");
        n2 = entrada.nextFloat();
        
        if (n1>n2){
            maior = n1;
        }else{
            maior = n2;
        }
        System.out.println("Maior número: "+maior);  
    } 
}
