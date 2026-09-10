Pseudocódigo:

comeco do programa

cont é igual a verdadeiro
opção é igual a 0
saldo é igual a 800
deposito igual a 0
saque é igual a 0

enquanto cont igual verdadeiro faça

	imprima menu
	receba opção

	se opção igual a 1 faça
		imprima saldo

	senão se opção igual a 2 faça
		imprima "valor do deposito:"
		receba deposito
		saldo igual a saldo mais deposito
        depósito igual a 0

	senão se opção igual a 3 faça
		imprima "valor do saque"
		receba saque
		
		se saque menor ou igual a saldo
            imprima “saque realizado”
			saldo igual a saldo menos saque
            saldo igual a 0
			
        se não faça 
            imprima “saldo insuficiente”

	senão se opção igual a 4 faça
		imprima encerramento
		cont igual a falso

	senão
		imprima opção invalida

fim do programa
