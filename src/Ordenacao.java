public class Ordenacao {

    public void buubleSort(int [] vetor){
        int n = vetor.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -i -1; j++) {
                if (vetor[j] > vetor[j +1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public void buubleSortDec(int[]vetor){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -i -1; j++) {
                if (vetor[j] < vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1]= aux;
                }
            }
        }
    }

    public void selectSort(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i +1; j < n; j++) {
                if (vetor[j] < vetor[index]){
                    index = j;
                }
            }
            int aux = vetor[index];
            vetor[index] = vetor[i];
            vetor[i] = aux;
        }
    }

    public void selectSortDec(int[] vetor){
        int aux = vetor.length;

        for (int i = 0; i < aux; i++) {
            int maiorPosicao = i;

            for (int j = i; j < aux; j++) {
                if (vetor[maiorPosicao] < vetor[j]){
                    maiorPosicao = j;
                }
            }
            int maiorValor = vetor[maiorPosicao];
            vetor[maiorPosicao] =  vetor[i];
            vetor[i] = maiorValor;



        }
    }

    public static void insertionSort(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void insertionSortDec(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }



    public void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length ; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
