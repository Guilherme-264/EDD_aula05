package exercicio2;

public class buubleFuncionario {

    public void ordemAlfabetica(Funcionario [] funcionarios){
        int n = funcionarios.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -i -1; j++) {
                if (funcionarios[j].getNome().compareTo(funcionarios[j+1].getNome())> 0){
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j+1];
                    funcionarios[j + 1] = aux;
                }
            }
        }
    }

    public void salarioCrecsente(Funcionario[] funcionarios){
    int n = funcionarios.length;
        for (int i = 1; i < n; i++) {
            int posicaoMenasAlta = i-1;
            for (int j = i-1; j < n; j++) {
                if (funcionarios[posicaoMenasAlta].getSalario() > funcionarios[j].getSalario()){
                    posicaoMenasAlta = j;
                }
            }
            Funcionario aux = funcionarios[i-1];
            funcionarios[i-1] = funcionarios[posicaoMenasAlta];
            funcionarios[posicaoMenasAlta] = aux;

        }
    }

    public void salarioDecrescente(Funcionario[] funcionarios){
        int n = funcionarios.length;
        for (int i = 1; i < n; i++) {
            int posicaoMenasAlta = i-1;
            for (int j = i-1; j < n; j++) {
                if (funcionarios[posicaoMenasAlta].getSalario() < funcionarios[j].getSalario()){
                    posicaoMenasAlta = j;
                }
            }
            Funcionario aux = funcionarios[i-1];
            funcionarios[i-1] = funcionarios[posicaoMenasAlta];
            funcionarios[posicaoMenasAlta] = aux;

        }
    }
}
