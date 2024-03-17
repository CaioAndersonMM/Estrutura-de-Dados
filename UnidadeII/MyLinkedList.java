package UnidadeII;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
 	class Node{
        T data;    
        Node next;
        public Node(T data) {        	
            this.data = data;    
            this.next = null;
        }    
    } 

    private Node inicio;
    private Node fim;
    private int size;
    
    // Construtor de MyLinkedListSingly
	public MyLinkedList() {
		inicio = null;
		fim = null;
		size = 0;
	}

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Node p = inicio;
        if (p == null) {
            return false;
        }
        while (p != null) {
            if (p.data.equals(o)) {
                return true;
            } else{
                p = p.next;
            }
        }
        return false;
    }

    @Override
    public boolean add(T e) {
        Node novo = new Node(e);

        if (isEmpty()) {
            inicio = novo;
            fim = novo; 
            size++;
            return true;
        }

        fim.next = novo;
        fim = novo;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty()) {
            return false;
        } else {
            if (inicio.data.equals(o)) {
                inicio = inicio.next; // Atualiza o início da lista para o próximo nó
                size--;
                return true; 
            }
            Node inicial = inicio;
            while (inicial.next != null && !inicial.next.data.equals(o)) {
                inicial = inicial.next;
            }
            
            if (inicial.next != null) {
                Node removido = inicial.next;
                inicial.next = inicial.next.next;
                removido.next = null;
                size--;
                return true;
            }
            return false; // Não encontrado
        }
    }

    @Override
    public void clear() {
       inicio = null;
       fim = null;
       size = 0;
    }

    @Override
    public T get(int index) {

        if (index < 0 || index >= size) { 
            return null;
        }

        if (isEmpty()) { 
            return null;
        } else{
            Node p = inicio;
            
            for (int i = 0; i < index; i++) {
                p = p.next;
            }

            return p.data;
        }
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index > size) { 
            return null;
        }

        Node p = inicio;

        for (int i = 0; i < index; i++) {
            p = p.next;
        }

        p.data = element;
        return p.data;

        //Deve retornar o valor antigo ou o atual?

    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) { 
            return;
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node p = inicio;

            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            //após chegar no indice anterior ao que eu queria, vou colocar o novo no proximo, então:
            Node novo = new Node(element);
            //p.next = novo;
            //novo.next = p.next.next; -> UM ERRO AQUI: Pois o valor de p.next foi perdido na linha anterior!
            novo.next = p.next;
            p.next = novo;

            if (index == size) { // Se estiver adicionando no final, atualiza a referência "fim"
                fim = novo;
            }
            size++;
        }
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) { 
            return null;
        }

        Node p = inicio;

        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }

        //após chegar no indice anterior ao que eu queria, então:
        Node removido = p.next;
        p.next = p.next.next; //o nó anterior vai referenciar o proximo do próximo, pulando o que eu queria...
        removido.next = null; //desvinculando ele da list

        if (p.next == null) { // Se o próximo nó for nulo após a remoção, atualize a referência de "fim"
            fim = p;
        }

        size--;
        return removido.data;

    }

    @Override
    public int indexOf(Object o) {
        Node inicial = inicio;
        int index = 0;
    
        while (inicial != null) {
            if (inicial.data.equals(o)) {
                return index;
            }
            inicial = inicial.next;
            index++;
        }
    
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node inicial = inicio;
        int lastIndex = -1;
        int index = 0;
    
        while (inicial != null) {
            if (inicial.data.equals(o)) {
                lastIndex = index; // Atualiza o índice da última ocorrência do objeto
            }
            inicial = inicial.next;
            index++;
        }
    
        return lastIndex;
    }

    public void show() {
        Node inicial = inicio;

        System.out.print("Lista (cabeça para cauda): ");
        while (inicial != null) {
            System.out.print(inicial.data + " ");
            inicial = inicial.next;
        }
        System.out.println();
    }

    public void showReverse() {
        Stack<T> stack = new Stack<>();
        Node inicial = inicio;

        // Empilha
        while (inicial != null) {
            stack.push(inicial.data);
            inicial = inicial.next;
        }

        // Desempilha
        System.out.print("Lista (cauda para cabeça): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    @Override
    public void addFirst(T value) {
        Node novo = new Node(value);
        novo.next = inicio;
        inicio = novo;

        if (size == 0) fim = novo;

        size++;
    }

    @Override
    public void addLast(T value) {
        Node novo = new Node(value);
        fim.next = novo;
        fim = novo;

        if (isEmpty()) {
           inicio = novo;
        }
        size++;
    }

    @Override
    public T peekFirst() {
        if (isEmpty()) return null;
        return inicio.data;
    }

    @Override
    public T peekLast() {
        if (isEmpty()) return null;
        return fim.data;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) return null;
        
        Node temp = inicio.next;
        Node removido = inicio;
        inicio.next = null;
        inicio = temp;
        //pode ser melhorado
        
        size--; 

        if (inicio == null) { // Se o início agora for null, significa que a lista só tinha um elememento.
            fim = null;
        }
        
        return removido.data;

    }

    @Override
    public T removeLast() {
        if (isEmpty()) return null;

        Node removido = fim;

        if (size == 1) { //só tem um elemento
            inicio = null;
            fim = null;
            size --;
            return removido.data;
        }

        Node inicial = inicio; //vamos percorrer do inicio ao fim

        //while (inicial.next.next != null) { //pego penultimo
        //    inicial = inicial.next;
        //}

        for (int i = 0; i < size - 2; i++) { //vai até o penultimo
            inicial = inicial.next;
        }

        // inicial é o penultimo
        inicial.next = null;
        fim = inicial;
        size--; 
        return removido.data;
    }
    
    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }
}
