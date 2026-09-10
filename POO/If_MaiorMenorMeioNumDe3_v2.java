package Aula_260819;
import java.util.Scanner;
public class If_MaiorMenorMeioNumDe3_v2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,maior=0,menor=0,meio;
        
        System.out.print("Primeiro número: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Segundo número: ");
        n2 = entrada.nextFloat();
        
        System.out.print("Terceiro número: ");
        n3 = entrada.nextFloat();
        
        if (n1>n2 && n1>n3){
            maior = n1;
            if (n2<n3)
                menor=n2;
            else
                menor=n3;
        }
        else{ 
            if (n2>n1 && n2>n3){
                maior = n2;
                if(n1<n3)
                    menor = n1;
                else
                    menor = n3;
            }
            else{ 
                maior = n3;
                if (n1<n2)
                    menor=n1;
                else
                    menor=n2;
            }
        }
        meio = (n1+n2+n3) - (maior + menor);
        System.out.println("Maior número: "+maior); 
        System.out.println("Menor número: "+menor);
        System.out.println("Número do Meio: "+meio);
    }
}
