import math

op = str(input("\n você quer calcular [1]Triangulo, [2]Circulo, [3]Losango, [4]Retangulo ou [5]Trapezio?  "))
 
if op == '1':
     print("\nVocê escolheu triangulo")
     a = int(input("Digite a altura: "))
     b = int(input("digite a base: "))
     def triangulo(b, a):
         return (b * a) / 2
     print(f"\n{triangulo(b, a)}")

elif op == '2':
        print("\nVocê escolheu circulo")
        r = int(input("Digite o raio: "))
        def circulo(r):
            return math.pi * (r ** 2)
        print(f"\n{circulo(r)}")

elif op == '3':
        print("\nVocê escolheu losango")
        D = int(input("Digite a Diagonal maior: "))
        d = int(input("Digite a Diagonal menor: "))
        def losango(D, d):
            return (D * d) / 2
        print(f"\n{losango(D, d)}")
        
elif op == '4':
        print("\nVocê escolheu retangulo")
        b = int(input("Digite a base: "))
        a = int(input("Digite a altura: "))
        def retangulo(b, a):
            return b * a
        print(f"\n{retangulo(b, a)}")

elif op == '5':
        print("\nVocê escolheu trapezio")
        B = int(input("Digite a base maior: "))
        b = int(input("Digite a base menor: "))
        a = int(input("Digite a altura: "))
        def trapezio(B, b, a):
            return ((B + b) * a) / 2
        print(f"\n{trapezio(B, b, a)}")