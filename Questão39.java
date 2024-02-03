import java.util.ArrayList;
import java.util.List;

public class Questão39 <T> {

    private List<T> lista;

    public Questão39(){
        this.lista = new ArrayList<>();
    }

    public void create(T objeto){
        lista.add(objeto);
    }

    public T read(int index){
        return lista.get(index);
    }

    public void update(int index, T objeto){
        lista.set(index, objeto);
    }

    public void delete(int index){
        lista.remove(index);
    }

    public List<T> listar(){
        return lista;
    }

    public static void main(String[] args) {
        Questão39<Object> listagenerica = new Questão39<>();

        Produto produto = new Produto("Mouse Gamer", 90);
        String caio = "Uma String qualquer";
        Integer numero = 21112002;
        Pessoa pessoa = new Pessoa("094928342", "Caio Anderson", "Macho", 19, 70.0f, 1.70f, 27.0f);

        listagenerica.create(produto);
        listagenerica.create(caio);
        listagenerica.create(numero);
        listagenerica.create(pessoa);

        for (Object object : listagenerica.listar()) {
            System.out.println(object + "\n");
        }
        //System.out.println(listagenerica.listar());

        System.out.println("-----------------");
        System.out.println(listagenerica.read(0)+" - Objeto obtido no get");

        listagenerica.update(1, pessoa);
        //System.out.println(listagenerica.read(1));

        listagenerica.delete(3);

        System.out.println("-----------------");
        for (Object object : listagenerica.listar()) {
            System.out.println(object + "\n");
        }
    }
}
