package UnidadeII;

public interface MyStackInterface<T> {
    void push(T object);

    T pop() throws MyException;

    T peek();

    boolean isEmpty();

    boolean isFull();
}