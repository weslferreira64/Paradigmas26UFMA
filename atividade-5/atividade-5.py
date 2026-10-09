class AvaliaTurma:
    def __init__(self, quantAlunos, numSala, mediaNotas, professora, frequencia, alunosAssiduos):
        self.quantAlunos = quantAlunos
        self.numSala = numSala
        self.mediaNotas = mediaNotas
        self.professora = professora
        self.frequencia = frequencia
        self.alunosAssiduos = alunosAssiduos
        
    def AvaliaFrequenciaTurma(self):
        return self.frequencia >= 75
            
    def AvaliaMediaTurma(self):
        return self.mediaNotas >=7
    
    def AvaliaLotacaoTurma(self, lotacaoMax):
        return self.quantAlunos <= lotacaoMax
        
    def AvaliaMediaComGeral(self, mediaGeral):
        return self.mediaNotas >= mediaGeral
        
