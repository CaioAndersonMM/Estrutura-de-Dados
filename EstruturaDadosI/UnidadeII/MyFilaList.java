package UnidadeII;

public class MyFilaList<T> implements MyFilaInterface<T>{
    MyLinkedList<T> list;

    public MyFilaList(){
       this.list = new MyLinkedList<T>();
    }

    @Override
    public void adicionar(T elemento) {
        list.addLast(elemento);
    }

    @Override
    public T remover() throws MyException {
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return isEmpty();
    }

    @Override
    public boolean isFull() {
        return isFull();
    }

    @Override
    public int size() {
       return list.size();
    }

    @Override
    public T peek() {
        return list.peekFirst();
    }

    @Override
    public T get(int indice) {
        return list.get(indice);
    }
    
}
