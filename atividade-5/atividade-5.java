public class AvaliaTurma {
    int quantAlunos;
    int numSala;
    float mediaNotas;
    String professora;
    float frequencia;
    boolean  alunosAssiduos;
    
    boolean AvaliaFrequenciaTurma(){
        return frequencia >= 75;
    }    
    
    boolean AvaliaMediaTurma(self){
        return mediaNotas >=7;
    }
    
    boolean AvaliaLotacaoTurma(int lotacaoMax){
        return quantAlunos <= lotacaoMax;
    }    
    
    boolean AvaliaMediaComGeral(float mediaGeral){
        return mediaNotas >= mediaGeral;
    }
}
