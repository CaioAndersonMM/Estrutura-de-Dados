package UnidadeII;

public class MyStack<T> implements MyStackInterface<T> {
    private int topo;
    private int size;
    private T[] vetor;

    public MyStack(int size) {
        this.topo = -1;
        this.size = size;
        this.vetor = (T[]) new Object[size];
    }

    @Override
    public void push(T object) {
        if (!isFull()) { // Não está cheio
            setTopo(topo + 1);
            this.vetor[topo] = object;
        } else
            throw new UnsupportedOperationException("PILHA CHEIA");
    }

    @Override
    public T pop() throws MyException {
        if (!isEmpty()) {
            T obj = this.vetor[topo];
            setTopo(topo - 1);
            return obj;
        } else
            throw new MyException("PILHA VAZIA");
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return this.vetor[getTopo()];
        } else
            return null; //Pilha vazia
    }

    @Override
    public boolean isEmpty() {
        if (getTopo() == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (getTopo() >= getSize()) {
            return true;
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

}