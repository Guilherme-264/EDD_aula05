package exercicio3;

public class OrdenaAlunos {
    //ordenando alunos pela nota
    public void ordenaNota(Aluno[] alunos){
        int n = alunos.length;
        for (int i = 1; i < n; i++) {
            Aluno chave = alunos[i];
            int j = i-1;
            while(j >= 0 && alunos[j].calcularMedia() > chave.calcularMedia() ){
                alunos[j + 1] = alunos[j];
                j--;
            }
            alunos[j+1] = chave;

        }
    }

    //ordenando alunos por ordem alfabetica
    public void ordemAlfabetica(Aluno[] alunos, int posicaoVetor){
        int n;
        if (alunos[0].calcularMedia() >= 7){
            n = posicaoVetor;
        }else{
            n = posicaoVetor;
        }

        for (int i = 1; i < n; i++) {
            Aluno chave = alunos[i];
            int j = i-1;
            while(j >= 0 && alunos[j].getNome().compareTo(chave.getNome()) > 0){
                alunos[j + 1] = alunos[j];
                j--;
            }
            alunos[j+1] = chave;

        }
    }
}
