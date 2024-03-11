package UnidadeII;

public class Main {
    public static void main(String[] args) throws MyException {
        MyStackListInterface<Integer> pilha = new MyStackList<Integer>();

        pilha.push(1);
        pilha.push(2);
        System.out.println(pilha.peek());
        pilha.pop();
        System.out.println(pilha.peek());
    }
}
