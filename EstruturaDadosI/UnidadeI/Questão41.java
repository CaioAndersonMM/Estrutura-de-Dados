package UnidadeI;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Questão41 {
    public static void main(String[] args) {

        System.out.println("---------------ArrayList-------------");
        List<String> listNomes = new ArrayList<>();

        listNomes.add("caio");
        listNomes.add("maria");

        System.out.println("Primeiro elemento: " + listNomes.get(0));

        listNomes.remove(0);

        System.out.println("Depois de remover: " + listNomes.get(0));

        listNomes.set(0, ""); //Mudei

        //Uma List é muito eficiente para acesso direto aos elementos, mas pode ser menos eficiente para operações de inserção e remoção no meio dela. Aumenta 50% do seu tamanho quando a lista está cheia. O ArrayList permite que elementos sejam acessados diretamente pelos métodos get() e set(), e adicionados através de add() e remove(). Os elementos em um ArrayList são armazenados em ordem sequencial, mantendo a ordem de inserção dos elementos. Se um elemento for incluido no meio, os outros serão empurrados para a frente.

        System.out.println("---------------Vector-------------");
        List<String> vector = new Vector<>();

        vector.add("jorge");
        vector.add("bruno");

        System.out.println("Primeiro elemento: " + vector.get(0));

        for (String element : vector) {
            System.out.println(element);
        }

        //É sincronizado, é mais lento porque é sincronizado (capacidade de controlar o acesso concorrente a dados compartilhados para evitar conflitos e inconsistências em ambientes multi-threaded). O Vector aumenta o dobro quando está cheio.
    
        System.out.println("---------------LinkedList-------------");
        List<String> linkedList = new LinkedList<>();

        // Adicionando elementos
        linkedList.add("caio");
        linkedList.add("anderson");
        linkedList.add("martins");

        System.out.println("Primeiro elemento: " + linkedList.get(0));

        linkedList.set(0, "Caio");

        System.out.println(linkedList);

        //Cada elemento na lista possui referências tanto para o próximo quanto para o elemento anterior na sequência. Eficiente para operações de inserção e remoção em comparação com ArrayList para operações no meio da lista. Porém, o acesso direto aos elementos é menos eficiente porque não há indexação direta para acessar elementos. A busca precisa percorrer a lista do início até o elemento desejado.


        System.out.println("------------HashSet------------");
        Set<String> setString = new HashSet<>();
        setString.add("caio");
        setString.add("caio");
        //setString.add("igual");
        setString.add("diferente");
        setString.add("igual");

        System.out.println(setString);

        Set<Integer> setInt = new HashSet<>();
        setInt.add(3);
        setInt.add(4);
        setInt.add(1);
        setInt.add(2);
        setInt.add(4);
        System.out.println(setInt);

        //Elementos não são ordenados. Não é possível usar o SET e o GET. A vantagem é que não permite duplicados!

        System.out.println("------------LinkedHashSet------------");

        Set<String> linkedSetString = new LinkedHashSet<>();
        linkedSetString.add("caio");
        linkedSetString.add("caio");
        linkedSetString.add("diferente");
        linkedSetString.add("igual");
        linkedSetString.add("diferente");

        System.out.println(linkedSetString);

        Set<Integer> linkedSetInt = new LinkedHashSet<>();
        linkedSetInt.add(3);
        linkedSetInt.add(4);
        linkedSetInt.add(1);
        linkedSetInt.add(2);
        linkedSetInt.add(4);

        System.out.println(linkedSetInt);

        //Uma lista encadeada apontando para uma tabela HashSet. Mantém a ordem de inserção dos elementos, Além de uma tabela de dispersão (HashSet) para proporcionar um acesso eficiente.

        System.out.println("------------TreeSet------------");

        Set<String> arvore = new TreeSet<>();

        arvore.add("Maçã");
        arvore.add("Banana");
        arvore.add("Caju");
        arvore.add("Manga");

        System.out.println(arvore); // Está utilizando a ordem alfabetica, por ser String

        arvore.remove("Caju");


        System.out.println(arvore); 


        //Busca binária! Elementos únicos - ordem crescente ou de acordo com o especificado, para manter a ordem exige dos elementos um Comparable. É útil em situações onde se precisa iterar sobre os elementos do conjunto em ordem ordenada. 

        System.out.println("------------PriorityQueue------------");

        Queue<Integer> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.offer(90);
        filaPrioridade.offer(30);
        filaPrioridade.offer(20);
        filaPrioridade.offer(50);
        filaPrioridade.offer(40);

        Integer itg = filaPrioridade.peek(); //consulta inicio
		System.out.println("inicio: " + itg);

        filaPrioridade.poll();

        System.out.println(filaPrioridade);


        while (!filaPrioridade.isEmpty()) { //Enquanto a fila não estiver vazia
            filaPrioridade.poll(); //remova um elemento
        }

        System.out.println(filaPrioridade);

        //Uma FILA, mas os elementos com maior prioridade são removidos primeiro. Isso significa que a ordem de remoção não é baseada na ordem de inserção, mas sim na prioridade atribuída a cada elemento.
        //A iteração dos elementos nao condiz com a ordem com que serão removidos. Apesar de estarem desordenados internamente, no momento da remoção será respeitado a ordenação natural (nessa caso do menor para o maior).
        //Poderia usar add - mas offer() retorna um valor booleano indicando se a operação de adição foi bem-sucedida, o método add() não retorna nada. Então, se a operação de adição falhar (por exemplo, devido à fila estar cheia), uma exceção será lançada. Remove e Poll também entram nessa lógica.

        System.out.println("------------LinkedListQueue------------");

        Queue<Integer> linkedListQueue = new LinkedList<Integer>();
		
        linkedListQueue.add(90);
        linkedListQueue.add(30);
        linkedListQueue.add(40);

        System.out.println(linkedListQueue);

        itg = linkedListQueue.peek(); //consulta inicio
		System.out.println("inicio: " + itg);

        linkedListQueue.poll(); linkedListQueue.poll(); 
        System.out.println(linkedListQueue);
        
        //Conserva a ordem de insercao. -FIFO- primeiro a entrar é o primeiro a sair.

        System.out.println("------------DequeLinkedList------------");
        Deque<String> linkedListDeque = new LinkedList<String>(); 

        linkedListDeque.add("primeiro"); 
        linkedListDeque.addLast("segundo");
        
        linkedListDeque.addFirst("terceiro");
        linkedListDeque.addFirst("quarto"); 	
        linkedListDeque.addLast("quinto"); 	

        System.out.println(linkedListDeque);

        //Uma fila onde é possível adicionar e remover elementos tanto no início quanto no final da fila. Existe o removeFirst, removeLast
        
        System.out.println("------------MAP: HashMap------------");
        HashMap<String, Integer> contadorLetras = new HashMap<>();

        // Adicionando elementos ao HashMap
        contadorLetras.put("C", 10);
        contadorLetras.put("A", 25);
        contadorLetras.put("B", 5);


        System.out.println("Qtd de letra C: " + contadorLetras.get("C"));

        System.out.println(contadorLetras);

        contadorLetras.remove("B");

        // "MAPEIA" chave e valores - usa uma tabela de dispersão (hash table). Permite que você insira, remova e obtenha elementos rapidamente

        System.out.println("------------LinkedHashMap------------");

        Map<String, Integer> mapaIdades = new LinkedHashMap<>();

        mapaIdades.put("Pedro", 19);
        mapaIdades.put("Bruno", 35);
        mapaIdades.put("Caio", 20);

        System.out.println(mapaIdades);

        mapaIdades.remove("Bruno");

        System.out.println(mapaIdades);


        //Mantém ordem de inserção. Armazena chaves-valores como o HashMap, pois herdam da mesma interface. Mas ao contrário de HashMap, ao iterar sobre um LinkedHashMap, os elementos são retornados na ordem em que foram inseridos.

        System.out.println("------------TreeMap------------");

        Map<String, Integer> mapaQtdPessoas = new TreeMap<>();

        mapaQtdPessoas.put("Josenildo", 30);
        mapaQtdPessoas.put("Ivanildo", 25);
        mapaQtdPessoas.put("Micarla", 5);
        mapaQtdPessoas.put("Ana", 100);

        //Nesse caso está por ordem da String que é a chave, ou seja, alfabética

        System.out.println(mapaQtdPessoas);

        //TreeMap Critério de Ordenação da CHAVE. Mantém a ordem dos elementos com base na ordem das chaves ou um comparador fornecido pelo usuário. São armazenados em uma estrutura de árvore balanceada.

    }
}
