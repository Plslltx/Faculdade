#include <stdio.h>

int main() {
  float a,b ,c, s;
  
  printf("Digite o valor 1 ");
  scanf("%f",&a);
  printf("Digite o valor 2 ");
  scanf("%f",&b);
  printf("Digite o valor 3 ");
  scanf("%f",&c);
  
  s = a + b + c;
  
  printf("%f",s);
  
  return 0;
}