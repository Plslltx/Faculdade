#include <stdio.h>
#include <math.h>

float areaTriangulo(float base, float altura){
    return (base * altura) / 2;
}

float areaCirculo(float raio){
    return M_PI * pow(raio, 2);
}

float areaLosango(float diagonalMaior, float diagonalMenor){
    return (diagonalMaior * diagonalMenor) / 2;
}

float areaRetangulo(float base, float altura){
    return base * altura;
}

float areaTrapezio(float baseMaior, float baseMenor, float altura){
    return ((baseMaior + baseMenor) * altura) / 2;
}


int main() {
    int op;
    float base, altura, raio, diagonalMaior, diagonalMenor, baseMaior, baseMenor;

    printf("você quer calcular [1]Triangulo, [2]Circulo, [3]Losango, [4]Retangulo ou [5]Trapezio?  ");
    scanf("%d", &op);

    if (op == 1){
        printf("Digite a base do triangulo: ");
        scanf("%f", &base);
        printf("Digite a altura do triangulo: ");
        scanf("%f", &altura);
        printf("Area do triangulo: %.2f\n", areaTriangulo(base, altura));
    } 
    
    else if (op == 2){
        printf("Digite o raio do circulo: ");
        scanf("%f", &raio);
        printf("Area do circulo: %.2f\n", areaCirculo(raio));
    } 
    
    else if (op == 3){
        printf("Digite a diagonal maior do losango: ");
        scanf("%f", &diagonalMaior);
        printf("Digite a diagonal menor do losango: ");
        scanf("%f", &diagonalMenor);
        printf("Area do losango: %.2f\n", areaLosango(diagonalMaior, diagonalMenor));
    } 
    
    else if (op == 4){
        printf("Digite a base do retangulo: ");
        scanf("%f", &base);
        printf("Digite a altura do retangulo: ");
        scanf("%f", &altura);
        printf("Area do retangulo: %.2f\n", areaRetangulo(base, altura));
    } 
    
    else if (op == 5){
        printf("Digite a base maior do trapezio: ");
        scanf("%f", &baseMaior);
        printf("Digite a base menor do trapezio: ");
        scanf("%f", &baseMenor);
        printf("Digite a altura do trapezio: ");
        scanf("%f", &altura);
        printf("Area do trapezio: %.2f\n", areaTrapezio(baseMaior, baseMenor, altura));
    } 
    
    else {
        printf("Opcao invalida.\n");
    }    
}