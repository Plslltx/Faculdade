#include<stdio.h>

#include<locale.h>

//Declaração de variáveis globais

char nome[50];

int anoNasc, idade, anoAtual;
 
//Módulo para escrever a idade

int escreveIdade(){

	printf("%s nasceu em %d. Portanto possui %d anos de idade.",nome,anoNasc, idade);	

}
 
//Módulo Principal

int main(){ 

	anoAtual = 2025;

	printf("Nome: ");

	scanf("%s",nome);

	printf("Ano de nascimento: ");

	scanf("%d",&anoNasc);

	idade = anoAtual - anoNasc;

	escreveIdade(); //chama o módulo para escrever a idade

}