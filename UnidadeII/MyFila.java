package UnidadeII;

public class MyFila<T> implements MyFilaInterface<T>{
    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    public MyFila(int capacidade) {
        this.elementos = (T[]) new Object[tamanho];
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.inicio = -1;
        this.fim = -1;
    }

    public void adicionar(T elemento){
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            this.inicio = 0;
            this.fim = 0;
        } else{
            this.fim = (this.fim + 1) % capacidade;
        }
        elementos[this.fim] = elemento;
        tamanho++;
    }

    public T remover() {
       if (isEmpty()) {
            return null; //throw new MyException("Fila Vazia");
       } else{
            T elemento = elementos[this.inicio];

            if (inicio == fim) { //remove unico elemento da fila
               inicio = -1;
               fim = -1;
            } else{
                inicio = (inicio + 1) % capacidade; // Incrementa o índice de início com base na capacidade
            }

            tamanho--;
            return elemento;
       }
    }

    public boolean isEmpty() {
        if (this.inicio == -1) {
            return true;
        } return false;
    }

    public boolean isFull() {
        if (this.tamanho == this.capacidade) {
            return true;
        } return false;
    }

    public int size() {
        return this.tamanho;
    }

    public T peek() {
        if (!isEmpty()) {
            return (T) elementos[inicio];
        } return null;
    }

    public T get(int indice) {
        if (isEmpty() || indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da fila");
        }
        int indiceReal = (inicio + indice) % capacidade;
        return elementos[indiceReal];
    }
}
