package UnidadeII;

public class MyStackList<T> implements MyStackListInterface<T>{    
    MyLinkedList<T> list;

    public MyStackList(){
       this.list = new MyLinkedList<T>();
    }

    @Override
    public void push(T obj) throws MyException {
        list.addFirst(obj);
    }

    @Override
    public T pop() throws MyException {
        return list.removeFirst();
    }

    @Override
    public T peek() throws MyException {
        return list.peekFirst();
    }

    @Override
    public boolean isEmpty() {
       return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }


}
