package ArvoreRubroNegra;

public class No {
    int chave;
    int cor;
    No pai;
    No esq;
    No dir;

    No(int chave, int i, No pai, No esq, No dir) {
        this.chave = chave;
        this.cor = i;
        this.pai = pai;
        this.esq = esq;
        this.dir = dir;
    }
}
