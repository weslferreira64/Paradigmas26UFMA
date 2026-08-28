#include <stdio.h>

int main() {
    
    char nomeCliente[30];
    int idadeCliente;
    float saldoCliente;
    float precoProd;
    int quantProd;
    
    printf("Digite seu nome:\n");
    scanf("%s", nomeCliente);
    printf("Digite sua idade:\n");
    scanf("%d", &idadeCliente);
    printf("Digite seu saldo:\n");
    scanf("%f", &saldoCliente);
    printf("Digite o preço do produto:\n");
    scanf("%f", &precoProd);
    printf("Digite a quantidade do produto:\n");
    scanf("%d", &quantProd);
    
    float precoCompra = precoProd * quantProd;
    
    if(idadeCliente > 18){
        if(precoCompra <= saldoCliente){
            printf("Cliente: %s\n Compra aprovada: você possui saldo e idade!\n", nomeCliente);
        }
        else{
            printf("Cliente: %s\n Compra negada: você possui idade mas não possui saldo!\n", nomeCliente);
        }
    }else{
        if(precoCompra <= saldoCliente){
            printf("Cliente: %s\n Compra negada: você não possui saldo e não possui idade!\n", nomeCliente);
        }
        else{
            printf("Cliente: %s\n Compra negada: você possui saldo mas não possui idade!\n", nomeCliente);
        }
    }
}

