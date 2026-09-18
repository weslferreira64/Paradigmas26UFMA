def notas():
    quantNotas = int(input("Digite a quantidade de notas:\n"))
    notas = []
    if quantNotas != 0:
   	 for i in range(quantNotas):
            nota = float(input(f"Digite a °{i+1} nota: "))
            notas.append(nota)
    else:
        print("Opção Inválida!")
        return notas()
    return quantNotas, notas
    
    
def media(quantNotas, notas):
    soma = 0
    for i in range(quantNotas):
        soma += notas[i]
    media = soma/quantNotas
    return media
    
    
def classifica(media):
    if media >= 9.5:
        return "A"
    elif media >= 8:
        return "B"
    elif media >= 7: 
        return "C"
    elif media >= 6:
        return "D"
    else:
        return "E"
        
        
def aproveita(classific):
      if classific != "E" and classific != "D":
          return "Aproveitamento para Doutorado garantido!"
      else: 
          return"Aproveitamento para Doutorado negado!"
          
          
# Aqui começa a execução do programa
cont = 1
contDisc = 0
disciplinas = []
classificacoes  = []
aproveitamento = []

while cont != 2:
	cont = int(input(("Digite 1 para inserir disciplina ou 2 para continuar:\n")))
	
	if cont == 1:
		disciplina = input("Digite o nome da disciplina:\n")
		disciplinas.append(disciplina)
		quantidadNotas, notass = notas()
		mediaDisc = media(quantidadNotas, notass)
		classific = classifica(mediaDisc)
		classificacoes.append(classific)
		aproveitam = aproveita(classific)
		aproveitamento.append(aproveitam)
		contDisc += 1
		
if contDisc != 0:
	for i in range(contDisc):
		print(f"Disciplina: {disciplinas[i]}\nClassificação: {classificacoes[i]}\nAproveitamento: {aproveitamento[i]}\n")
else:
	print("Você não inseriu disciplinas!")
