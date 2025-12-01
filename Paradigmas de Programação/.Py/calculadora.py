import operator

operadores = { 

   '+': operator.add,
   '-': operator.sub,
   '*': operator.mul,
   '/': operator.truediv,

}

respar = float(input('Digite um número: '))


while True:

    op = input('[+] somar \n [-] subtrair \n [*] multiplicar \n [/] dividir \n [=] finalizar \n Digite: ')

    if op == "=":
        print(f'Resultado final: {respar}')
        break

    if op not in operadores:
        print('Operador inválido. Tente novamente.')
        continue


    n = float(input('Digite o próximo número: '))
    respar = operadores[op](respar, n)
    print(f'Resultado parcial: {respar}')





    # Trabalho feito por: Pedro Lucas, Raí e Iago.
    # Calculadora simples que realiza operações básicas como soma, subtração, multiplicação e divisão.
    # Explicação do código: Operadores - essa variavel define os calculos que a calculadora pode fazer. 
    # O while true faz com que o programa continue rodando em loop até o usuario decidir parar o codigo.
    # O if op == "=" serve para finalizar o programa quando o usuario digitar o sinal de igual.
    # O Respar significa resultado parcial, ou seja, o resultado que vai sendo atualizado a cada operação feita pelo usuario.


#   PPPPP   L
#   P    P  L
#   P    P  L
#   PPPPP   L
#   P       L
#   P       LLLLL
