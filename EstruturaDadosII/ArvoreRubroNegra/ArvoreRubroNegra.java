package ArvoreRubroNegra;

public class ArvoreRubroNegra {

    No raiz;

    public ArvoreRubroNegra(No arv) {
        this.raiz = arv;
    }

    public ArvoreRubroNegra() {
        this.raiz = null;
    }

    public void inserir(int k) {
        No novo = new No(k, 1, null, null, null);
        No paiAtual = null;
        No atual = raiz;

        // buscar posição para inserir nó
        while (atual != null) {
            paiAtual = atual;

            if (novo.chave < atual.chave)
                atual = atual.esq;
            else
                atual = atual.dir;
        }

        novo.pai = paiAtual;

        if (paiAtual == null)
            raiz = novo;
        else if (novo.chave < paiAtual.chave)
            paiAtual.esq = novo;
        else
            paiAtual.dir = novo;

        if (novo.pai == null) {
            novo.cor = 0; // novo é raiz então deve ser preto
            return;
        }

        if (novo.pai.pai == null) {
            return;
        }
        corrigirInsercao(novo);
    }

    private void corrigirInsercao(No v) {
        No tio;
        No avo = v.pai.pai;
        while (v.pai.cor == 1) {
            if (v.pai == avo.dir) { // pai está na direita do avô
                tio = avo.esq;
                if (tio.cor == 1) { // tio vermelho
                    tio.cor = 0; // tio fica preto
                    v.pai.cor = 0; // pai fica preto
                    avo.cor = 1; // avô fica vermelho
                } else { // se tio for preto
                    if (v == v.pai.esq) { // se v for filho a esquerda
                        v = v.pai;
                        rotacaoDireita(v);
                    }
                    v.pai.cor = 0; // pai muda pra preto
                    avo.cor = 1; // avo muda pra vermelho
                    rotacaoEsquerda(avo);

                }
            } else { // pai é filho a esquerda
                tio = avo.dir;
                if (tio.cor == 1) { // tio vermelho
                    tio.cor = 0; // tio fica preto
                    v.pai.cor = 0; // pai fica preto
                    avo.cor = 1; // avô fica vermelho
                } else { // se tio for preto
                    if (v == v.pai.dir) { // se v for filho a direita
                        v = v.pai;
                        rotacaoEsquerda(v);
                    }
                    v.pai.cor = 0; // pai muda pra preto
                    avo.cor = 1; // avo muda pra vermelho
                    rotacaoDireita(avo);
                }
            }

            if (v == raiz)
                break;
        }

        raiz.cor = 0;

    }

    private void rotacaoEsquerda(No avo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotacaoEsquerda'");
    }

    private void rotacaoDireita(No v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotacaoDireita'");
    }

}
