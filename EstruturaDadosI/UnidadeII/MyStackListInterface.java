package UnidadeII;

public interface MyStackListInterface<T> {
    void push(T obj) throws MyException;
    T pop() throws MyException;
    T peek() throws MyException;
    boolean isEmpty();
    boolean isFull();
}
