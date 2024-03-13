package UnidadeII;

import java.util.List;

public interface MyListDuplaInterface<T> extends List<T>{
    void addFirst(T value);
    void addLast(T value);

    T peekFirst();
    T peekLast();

    T removeFirst();
    T removeLast();

    //Metodos Completos

    boolean addAfter(T dado, T crit);
    T search(T crit);
        
	void show();			// opcional
	void showReverse();		// opcional
}
