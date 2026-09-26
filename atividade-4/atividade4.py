def realizar_saque (valor_saldo):
	   saque = float(input("\nDigite o valor do saque: "))
	   if saque <= valor_saldo:
	   	   valor_saldo - saque	
	   	   print(f"\nSaque de R$ {saque} reais efetuado!\n")
	   	   return valor_saldo - saque
	   else:
	   	   print("\nSaldo insuficiente!\n")
	   	   return realizar_saque(valor_saldo)
		
	
def imprime_saldo (valor_saldo):
    print(f"\nSeu saldo atual é de R$ {valor_saldo} reais!\n")
	
	
def realizar_deposito (saldo):
	   deposito = float(input("\nDigite o valor do depósito: "))
	   print(f"\nDepósito de R$ {deposito} realizado!\n")
	   return saldo + deposito;
	
	
def menu_caixa (saldo):
	   cont = True
	   while cont == True:
	   	   opcao = int(input(("\nCAIXA ELETRÔNICO\n\n 1. Consultar saldo\n 2. Depositar\n 3. Sacar \n 4. Encerrar\n\n Escolha uma opção: ")))
	   	   if opcao == 1:
	   	       imprime_saldo(saldo)
	   	   elif opcao == 2:
	   	       saldo = realizar_deposito(saldo)
	   	   elif opcao == 3:
	   	       saldo = realizar_saque(saldo)
	   	   elif opcao == 4:
	   	       print("\nSessão Encerrada!\n")
	   	       cont = False
	   	   else:
	   	       print("\nOpção Inválida!\n")
            
            
# Aqui começa a execucao do codigo

saldo_base = 800.00
menu_caixa(saldo_base)
