package exercicio3;

public class teste {
    public static void main(String[] args) {
       //criando alunos
        Aluno aluno1 = new Aluno("Joaquim", 8,7.1);
        Aluno aluno2 = new Aluno("Maria", 10,10);
        Aluno aluno3 = new Aluno("Luke", 4,6);
        Aluno aluno4 = new Aluno("Rariel", 4,8.1);
        Aluno aluno5 = new Aluno("Vanessa", 9,7);
        Aluno aluno6 = new Aluno("Lorris", 8.8,9.3);
        Aluno aluno7 = new Aluno("Rasputhia", 3,4);
        Aluno aluno8 = new Aluno("Inássia", 8,7);

        //adicionando alunos ao vetor
        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8};

        OrdenaAlunos ordenar = new OrdenaAlunos();
        SepararEstudantes separar = new SepararEstudantes(alunos.length);
        separar.situacaoAluno(alunos);

        //separando alunos entre aprovados e reprovados
        Aluno[] alunosAprovados = separar.getAprovados();
        Aluno[] alunosReprovados = separar.getReprovados();

        //ordenado alunos com a media de nota crescente
        ordenar.ordenaNota(alunos);

        //ordenando as listas de alunos por ordem alfabetica
        ordenar.ordemAlfabetica(alunosAprovados, separar.posicaoAprovado);
        ordenar.ordemAlfabetica(alunosReprovados, separar.posicaoReprovado);

        //printando os valores na tela
        System.out.println("Todos os alunos ordenados por média das notas");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());
            System.out.println();
        }

        System.out.println("Alnuos aprovados em ordem alfabetica");
        for (int i = 0; i < separar.posicaoAprovado; i++) {
            System.out.println();
            System.out.println(alunosAprovados[i].toString());
        }

        System.out.println("Alnuos reprovados em ordem alfabetica");
        for (int i = 0; i < separar.posicaoReprovado; i++) {
            System.out.println();
            System.out.println(alunosReprovados[i].toString());
        }
    }
}
