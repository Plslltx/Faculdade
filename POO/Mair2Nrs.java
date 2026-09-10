//Nessa versão, usaremos a biblioteca Scanner
package Aula_260820;
import java.util.Scanner;
public class Mair2Nrs {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1,n2,soma,maior;
        System.out.print("Primeiro Nº: ");
        n1 = entrada.nextInt();
        
        System.out.print("Segundo Nº: ");
        n2 = entrada.nextInt();
        soma = n1+n2;
        System.out.println("Soma: "+soma);
        
        if(n1 > n2)
            maior = n1;
        else
            maior = n2;
        
        System.out.println("Maior: "+maior);
    }
}
