/*
Programa usando variáveis globais
*/
#include<stdio.h>
#include<locale.h>
#include<Windows.h>
 
//Declaração de variáveis globais
int n1, n2;  
 
//Procedimento para soma. Procedimento, porque não retorna qualquer valor
//void porque não há qualquer retorno
void somar(){
	printf("Resultado da soma: %d",n1+n2);
}
 
//Método principal. O programa começa aqui.
int main(){
	setlocale(LC_ALL,"portuguese");
	printf("Digite o primeiro número: ");
	scanf("%d",&n1);
	printf("Digite o segundo número: ");
	scanf("%d",&n2);
	somar(); //chama o procedimento SOMAR()
	return 0;
}