package exercicio3;

public class Aluno {
    private String nome;
    private  double nota1;
    private double nota2;

    //construtor
    public Aluno(String aluno, double nota1,double nota2){
        this.nome = aluno;
        this.nota1 = nota1;
        this.nota2 =  nota2;
    }

    //metodo get para nota 2
    public double getNota2() {
        return nota2;
    }

    //metodo get para nota 1
    public double getNota1() {
        return nota1;
    }

    //metodo get para nome do aluno
    public String getNome() {
        return nome;
    }

    //calculando a média do aluno
    public double calcularMedia(){
        double media = (nota1 + nota2) / 2;
        return media;
    }


    public String toString(){
        return " Nome: " + getNome() + '\n' +
                " Média: " + calcularMedia();

    }
}
