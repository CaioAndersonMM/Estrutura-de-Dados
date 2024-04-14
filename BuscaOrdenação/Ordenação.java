package BuscaOrdenação;

public class Ordenação {

    public void bubbleSort(int vetor[]) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int menor = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = menor;
                }
            }
        }
    }

    public void selectSort(int vetor[]) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;

            // Verifico quem é menor e obtenho os indices para comparação!
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            if (i != menor) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }

        }
    }

    public void insertSort(int vetor[]) {
        for (int i = 1; i < vetor.length; i++) {
            int eleito = vetor[i];
            int j = i - 1;

            while (j >= 0 && eleito < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = eleito;
        }
    }

    public void quickSort(int vetor[], int inivet, int fimvet){
        int i = inivet;
        int j = fimvet;
        int pivo = vetor[(i+j / 2)];

        while (i < j) {

            while (vetor[i] < pivo) {
                i = i++;
            }

            while (vetor[j] > pivo) {
                j = j--;
            }

            if (i <= j) {
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                i++;
                j--;
            }
        }

        if (j > inivet){
            quickSort(vetor, inivet, j);
        }
        if (i < fimvet) {
            quickSort(vetor, i, fimvet);
        }
    }

    public void shellSort(int vetor[]){
        int h = 0;
        while (h < vetor.length) {
            h = 3 * h + 1;
        }

        while (h > 1) { //Quando H for 1 virará InsertSort
            h = h/3;

            for (int i = h; i < vetor.length; i++) {
                int eleito = vetor[i];
                int j = i - h;


                while (j>=0 && eleito < vetor[j]) {
                    vetor[j+h] = vetor[j];
                    j = j - h;
                }

                vetor[j + h] = eleito;
            }
        }
    }


    

}
