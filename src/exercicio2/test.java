package exercicio2;

public class test {
    public static void main(String[] args) {
        //criando funcionarios
        Funcionario func = new Funcionario("Guilherme", 1958.43);
        Funcionario func2 = new Funcionario("Rubão PP", 3100.00);
        Funcionario func3 = new Funcionario("Anderson", 1600.50);
        Funcionario func4 = new Funcionario("Leonor", 4162.00);
        Funcionario func5 = new Funcionario("Alcemar", 8780.20);

        //adicionando funcionarios ao vetor
        Funcionario[] funcionarios={func, func2, func3, func4, func5};
        buubleFuncionario b1 = new buubleFuncionario();

        //ordenando funcionarios por ordem alfabetica
        b1.ordemAlfabetica(funcionarios);

        //printando funcionarios
        System.out.println("funcionarios em ordem alfabetica");
        System.out.println();
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i]);
        }
        System.out.println();

        //ordenando funcionarios por salario crescente
        b1.salarioCrecsente(funcionarios);

        //printando funcionarios
        System.out.println("funcionarios com o salario crescente");
        System.out.println();
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i]);
        }
        System.out.println();

        //ordenando funcionarios por salario decrescente
        b1.salarioDecrescente(funcionarios);

        //printando funcionarios
        System.out.println("funcionarios com o salario decrescente");
        System.out.println();
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i]);
        }
    }
}
