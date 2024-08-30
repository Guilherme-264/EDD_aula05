package exercicio3;

public class SepararEstudantes {
    public Aluno[] aprovados;
    public Aluno[] reprovados;
    public int posicaoAprovado;
    public int posicaoReprovado;

    //construtor
    public SepararEstudantes(int numeroAlunos) {
        aprovados = new Aluno[numeroAlunos];
        reprovados = new Aluno[numeroAlunos];

    }

    //separando alunos entre aprovados e reprovados
    public void situacaoAluno(Aluno[] alunos) {
        double media;
        posicaoAprovado = 0;
        posicaoReprovado = 0;

        for (int i = 0; i < alunos.length; i++) {
            media = alunos[i].calcularMedia();
            if (media >= 7) {
                aprovados[posicaoAprovado] = alunos[i];
                posicaoAprovado++;
            } else {
                reprovados[posicaoReprovado] = alunos[i];
                posicaoReprovado++;
            }
        }
    }

    //metodo get para alunos aprovados
    public Aluno[] getAprovados() {
        return aprovados;
    }

    //metodo get para alunos reprovados
    public Aluno[] getReprovados() {
        return reprovados;
    }

}
