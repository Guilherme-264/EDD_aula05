public class Main {
    public static void main(String[] args) {
        Ordenacao ordenar = new Ordenacao();

        int[] vetor = {87, 42, 11, 45,42,71};

        System.out.println("ordenação buuble");
        ordenar.buubleSort(vetor);
        ordenar.imprimirVetor(vetor);

        System.out.println("ordenação buuble decrescente");
        ordenar.buubleSortDec(vetor);
        ordenar.imprimirVetor(vetor);

        System.out.println("ordenação select");
        ordenar.selectSort(vetor);
        ordenar.imprimirVetor(vetor);

        System.out.println("ordenação select decrescente");
        ordenar.selectSortDec(vetor);
        ordenar.imprimirVetor(vetor);

        System.out.println("ordenação insertion");
        ordenar.insertionSort(vetor);
        ordenar.imprimirVetor(vetor);

        System.out.println("ordenação select drecrescente");
        ordenar.insertionSortDec(vetor);
        ordenar.imprimirVetor(vetor);
        

    }
}