//Nessa versão, usaremos a biblioteca Scanner
package Aula_260820;
import java.util.Scanner;
public class Soma2Nrs_v2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1,n2,soma;
        System.out.print("Primeiro Nº: ");
        n1 = entrada.nextInt();
        
        System.out.print("Segundo Nº: ");
        n2 = entrada.nextInt();
        soma = n1+n2;
        System.out.println("Soma: "+soma);
    }
    
}
