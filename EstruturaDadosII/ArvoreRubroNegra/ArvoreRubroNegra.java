package ArvoreRubroNegra;

public class ArvoreRubroNegra {

    No raiz;

    public ArvoreRubroNegra(No arv){
        this.raiz = arv;
    }

    public ArvoreRubroNegra(){
        this.raiz = null;
    }

    public void inserir(int k){
        No novo = new No(k, 1, null, null, null);
        No paiAtual = null;
        No atual = raiz;

        //buscar posição para inserir nó
        while (atual != null) {
            paiAtual = atual;

            if (novo.chave < atual.chave) {
                atual = atual.esq;
            }
        }

    }
    
}
