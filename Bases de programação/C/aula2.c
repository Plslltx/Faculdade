#include <stdio.h>
#include <stdlib.h>

int main()
{
    char nome[50];
    int idade;
    float salario;


   printf("Digite o seu nome: ");
   scanf("%s", nome);

   printf("Digite a sua idade: ");
   scanf("%d", &idade);

   printf("Digite o seu salario: ");
   scanf("%f", &salario);

   printf("\nNome do candango: %s\n", nome);
   printf("\nIdade: %d\n", idade);
   printf( "\nSalario: %2f\n", salario); 

}