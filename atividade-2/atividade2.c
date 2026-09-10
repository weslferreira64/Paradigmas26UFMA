#include <stdio.h>
#include <stdbool.h>

int main() {
    
    bool cont = true;
    int opcao;
    float saldo = 800.00;
    float deposito = 0;
    float saque = 0;
    
    while (cont == true){
        
        printf("\nCAIXA ELETRÔNICO\n\n 1. Consultar saldo\n 2. Depositar\n 3. Sacar \n 4. Encerrar\n\n Escolha uma opção:\n");
        scanf("%d", &opcao);
        if(opcao == 1){
            printf("\nSeu saldo é: R$ %.2f\n", saldo);
        }
        
        else if(opcao == 2){
            printf("\nDigite o valor do depósito:\n");
            scanf("%f", &deposito);
            printf("\nDepósito de R$ %.2f realizado!\n", deposito);
            saldo = saldo + deposito;
            deposito = 0;
        }
        
        else if(opcao == 3){
            printf("\nDigite o valor do saque:\n");
            scanf("%f", &saque);
            
            if(saque <= saldo){
                saldo = saldo - saque;
                printf("\nSaque de R$ %.2f efetuado !\nSeu saldo atual é de R$ %.2f!\n", saque, saldo); 
                saque = 0;
            }
            
            else{
                printf("\nSaldo indisponível!\n");
            }
        }
        
        else if(opcao == 4){
            printf("\nSessão Encerrada!\n");
            cont = false;
        }
        
        else{
            printf("\nOpção Inválida!\n");
        }
    }
}
