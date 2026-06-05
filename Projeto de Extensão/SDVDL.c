#include <stdio.h>
#include <string.h>

struct Venda {
    char nome_cliente[50];
    char nome_produto[50];
    float preco;
    int quantidade;
    float valor_total;
};

int main() {
    struct Venda nova_venda;

    float faturamento_total = 0.0;
    int total_produtos_vendidos = 0;

    int opcao;
    int contador_cancelamentos = 0;
    char confirmar;

    do {
        printf("\n---------------------------------");
        printf("\n   SISTEMA DE VENDAS DA LOJA     ");
        printf("\n---------------------------------");
        printf("\n1 - Registrar Nova Venda");
        printf("\n2 - Exibir Relatorio Geral");
        printf("\n0 - Sair do Sistema");
        printf("\n---------------------------------");
        printf("\nEscolha uma opcao: ");
        
        if (scanf("%d", &opcao) != 1) {
            while (getchar() != '\n');
            opcao = -1;
            continue;
        }

        switch (opcao) {
            case 1:
                printf("\nDigite o nome do cliente: ");
                scanf(" %[^\n]s", nova_venda.nome_cliente);

                printf("Digite o nome do produto: ");
                scanf(" %[^\n]s", nova_venda.nome_produto);

                printf("Digite o preco unitario: R$ ");
                scanf("%f", &nova_venda.preco);

                printf("Digite a quantidade: ");
                scanf("%d", &nova_venda.quantidade);

                nova_venda.valor_total = nova_venda.preco * nova_venda.quantidade;

                printf("\n--- RESUMO DO PEDIDO ---\n");
                printf("Cliente: %s\n", nova_venda.nome_cliente);
                printf("Produto: %s\n", nova_venda.nome_produto);
                printf("Quantidade: %d\n", nova_venda.quantidade);
                printf("Valor Total: R$ %.2f\n", nova_venda.valor_total);
                printf("------------------------\n");

                printf("Confirmar venda? (S para Sim / C para Cancelar): ");
                scanf(" %c", &confirmar); 

                if (confirmar == 'S' || confirmar == 's') {
                    printf("\nVenda realizada com sucesso!\n");
                    
                    faturamento_total = faturamento_total + nova_venda.valor_total;
                    total_produtos_vendidos = total_produtos_vendidos + nova_venda.quantidade;
                    
                    contador_cancelamentos = 0;
                } 
                else if (confirmar == 'C' || confirmar == 'c') {
                    contador_cancelamentos = contador_cancelamentos + 1;
                    printf("\nVenda cancelada pelo operador!\n");
                    printf("Cancelamentos seguidos: %d\n", contador_cancelamentos);

                    if (contador_cancelamentos == 2) {
                        printf("\n[ALERTA] Dois cancelamentos seguidos detectados!\n");
                        printf("Taxa de R$ 20.00 adicionada automaticamente ao caixa.\n");
                        
                        faturamento_total = faturamento_total + 20.00;
                        contador_cancelamentos = 0;
                    }
                }
                break;

            case 2:
                printf("\n---------------------------------");
                printf("\n       RELATORIO DA LOJA        ");
                printf("\n---------------------------------");
                printf("\nTotal de Produtos Vendidos: %d", total_produtos_vendidos);
                printf("\nFaturamento Total Acumulado: R$ %.2f", faturamento_total);
                printf("\n---------------------------------\n");
                break;

            case 0:
                printf("\nSaindo do sistema... Ate logo!\n");
                break;

            default:
                printf("\nOpcao invalida! Escolha um numero do menu.\n");
                break;
        }

    } while (opcao != 0);

    return 0;
}