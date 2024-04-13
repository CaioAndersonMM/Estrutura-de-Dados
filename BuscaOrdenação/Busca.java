package BuscaOrdenação;

public class Busca {

    /**
     * 1. Percorrer a coleção de modo sequencial
     * 2. Comparar a chave com o valor de cada elemento
     * 3. Se coincidir, retornar a posição do elemento (índice ou ponteiro)
     * 4. Se nada coincidir, retornar nulo (-1 ou null)
     * 
     * @param chave
     * @return
     */
    public int buscaLinear(int chave, int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            if (chave == vetor[i]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 1. Comparar a chave com o elemento do meio, no espaço de busca.
     * 2. Se menor, reduzir o espaço de busca para a metade inferior,
     * 3. Se maior, reduzir o espaço de busca para a metade superior,
     * 4. Se igual, busca bem-sucedida.
     * 
     * @param chave
     * @return
     */
    public int buscaBinaria(int chave, int vetor[]) {
        int ini = 0;
        int fim = vetor.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;

            if (chave < vetor[meio]) { // chave está antes do meio
                fim = meio - 1;
            } else if (chave == vetor[meio]) { // chave é o elemento do meio
                return meio;
            } else if (chave > vetor[meio]) { // chave está depois do meio
                ini = meio + 1;
            }
        }

        return -1;

    }
}
