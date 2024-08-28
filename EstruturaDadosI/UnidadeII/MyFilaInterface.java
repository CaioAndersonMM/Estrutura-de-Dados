package UnidadeII;

public interface MyFilaInterface<T> {
      void adicionar(T elemento);
      T remover() throws MyException;
      boolean isEmpty();
      boolean isFull();
      int size();
      T peek();
      T get(int indice);
}