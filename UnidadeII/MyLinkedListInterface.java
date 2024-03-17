package UnidadeII;

import java.util.List;

public interface MyLinkedListInterface<T> extends List<T>{
    void addFirst(T value);
    void addLast(T value);

    T peekFirst();
    T peekLast();

    T removeFirst();
    T removeLast();

    void show();
    void showReverse();
}
