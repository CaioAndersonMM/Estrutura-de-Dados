package UnidadeII;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListDupla<T> implements MyListDuplaInterface<T> {

    public class Node {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node tail;
    private Node head;
    private int capacity, size;

    public MyListDupla(int tamanho) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = tamanho;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {

        Node inicial = this.head;

        for (int i = 0; i < this.size; i++) {
            if (inicial.data.equals(o)) {
                return true;
            }
            inicial = inicial.next;
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(T e) {
        Node p = new Node(e);
        if (isEmpty()) {
            head = p;
            tail = p;
        } else {
            tail.next = p;
            tail = p;
        }

        size++;
        return true;

        // Sempre irá adicionar, por isso sempre true - a não ser que seja limitado pela
        // this.capacity
    }

    @Override
    public boolean remove(Object o) {
        Node inicial = head;

        for (int i = 0; i < this.size; i++) {
            if (inicial.data.equals(o)) {
                break;
            }
            inicial = inicial.next;
        }

        if (inicial.data != null) {

            if (this.size == 1) { // Se for unico elemento na list
                head = null;
                tail = null;
                size--;
                return true;
            }

            Node anterior = inicial.prev;
            Node posterior = inicial.next;
            anterior.next = posterior;
            posterior.prev = anterior;
            inicial.prev = null;
            inicial.next = null;
            size--;
            return true;
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (isEmpty()) {
            return null;
        }
        Node inicial = head;

        for (int i = 0; i < index; i++) {
            inicial = inicial.next;
        }

        return inicial.data;

    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node inicial = head;

        for (int i = 0; i < index; i++) {
            inicial = inicial.next;
        }

        Node alterado = inicial;
        inicial.data = element;

        return alterado.data;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node novo = new Node(element);
            Node inicial = head;

            for (int i = 0; i < index - 1; i++) { // Percorre um antes da posição desejada!
                inicial = inicial.next;
            }
            Node posterior = inicial.next;
            novo.next = posterior;
            novo.prev = inicial;

            posterior.prev = novo;
            inicial.next = novo;

            size++;
        }
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node inicial = head;

        for (int i = 0; i < index; i++) {
            inicial = inicial.next;
        }

        Node removido = inicial;

        if (removido.next != null) {
            Node posterior = removido.next;
            posterior.prev = removido.prev;
            removido.next = null;
        }

        removido.prev = null;
        size--;

        return removido.data;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node inicial = head;

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
        int index = size - 1;
        Node fim = tail;

        while (fim != null) {
            if (fim.data.equals(o)) {
                return index;
            }
            fim = fim.prev;
            index--;
        }

        return -1;
    }

    @Override
    public void addFirst(T value) {
        Node p = new Node(value);

        if (isEmpty()) {
            head = p;
            tail = p;
            return;
        }

        p.next = head;
        head.prev = p;
        head = p;

        size++;
    }

    @Override
    public void addLast(T value) {
        Node p = new Node(value);

        if (isEmpty()) {
            head = p;
            tail = p;
            return;
        }

        tail.next = p;
        p.prev = tail;
        tail = p;

        size++;
    }

    @Override
    public T peekFirst() {
        return head.data;
    }

    @Override
    public T peekLast() {
        return tail.data;

    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }

        if (size == 1) {
            // Se houver apenas um elemento na lista
            head = null;
            tail = null;
            return null;
        }

        head = head.next;
        head.prev.next = null; // o anterior a nova cabeça terá o proximo anulado
        head.prev = null;

        size--;
        return head.data;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (size == 1) {
            // Se houver apenas um elemento na lista
            head = null;
            tail = null;
            return null;
        }

        Node removido = tail;
        tail = tail.prev;
        tail.next = null;
        removido.prev = null; // desconecto a ligação do ultimo com a minha lista

        size--;
        return removido.data;
    }

    @Override
    public boolean addAfter(T dado, T crit) {
        if (isEmpty()) {
            return false;
        }

        Node inicial = head;

        for (int i = 0; i < size; i++) {
            if (inicial.data.equals(crit))
                break;
            inicial = inicial.next;
        }

        if (inicial == null) {
            return false;
        }
        Node novo = new Node(dado);

        novo.prev = inicial;
        novo.next = inicial.next;
        if (inicial.next != null) {
            inicial.next.prev = novo;
        }

        inicial.next = novo;

        if (inicial == tail) { //Se o encontrado for o final, o final será o adicionado agora
            tail = novo;
        }

        size++; 
        return true;
    }

    @Override
    public T search(T crit) {
        Node inicial = head;

        while (inicial != null) {
            if (inicial.data.equals(crit)) {
                return inicial.data;
            }
            inicial = inicial.next;
        }

        return null;
    }

    @Override
    public void show() {
        Node inicial = head;

        System.out.print("Lista (cabeça para cauda): ");
        while (inicial != null) {
            System.out.print(inicial.data + " ");
            inicial = inicial.next;
        }
        System.out.println();
    }

    @Override
    public void showReverse() {
        Node inicial = tail;

        System.out.print("Lista (cauda para cabeça): ");
        while (inicial != null) {
            System.out.print(inicial.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}
