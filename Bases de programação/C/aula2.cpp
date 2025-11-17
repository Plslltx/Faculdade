#include <iostream>
using namespace std;
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    char nome[50];
    int idade;
    float salario;


   cout << "Digite o seu nome: ";
   cin >> nome;

   cout << "Digite a sua idade: ";
   cin >> idade;

   cout << "Digite o seu salario: ";
   cin >> salario;

   cout << "\nNome do candango:" << nome;
   cout << "\nIdade: " << idade;
   cout << "\nSalario: " << salario; 

}