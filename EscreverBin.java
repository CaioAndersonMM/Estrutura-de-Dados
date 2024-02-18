import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EscreverBin {
    public static void main(String[] args) {
        Produto novoproduto = new Produto("Teclado", 100);
        List<Produto> produtos = new ArrayList<>();

        Produto novoproduto2 = new Produto("Mouse Gamer", 90);
        Produto novoproduto3 = new Produto("Monitor", 900);
        Produto novoproduto4 = new Produto("Cadeira", 1000);
        Produto novoproduto5 = new Produto("Fone", 300);

        produtos.add(novoproduto2);
        produtos.add(novoproduto3);
        produtos.add(novoproduto4);
        produtos.add(novoproduto5);

        String arquivo = "produtos.bin";

        try {
            gravador(arquivo, produtos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream bInputStream = new ObjectInputStream(new FileInputStream("produto.bin"));
            Object objeto = bInputStream.readObject();

            System.out.println(objeto);

            ObjectInputStream bInputStream2 = new ObjectInputStream(new FileInputStream("produtos.bin"));

            List<Object> objProdutos = (ArrayList<Object>) bInputStream2.readObject();
            //List<Object> objProdutos = new ArrayList<>();
            //objProdutos = (ArrayList<Object>) bInputStream2.readObject();

            System.out.println(objProdutos);

            bInputStream.close();
            bInputStream2.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }  

        try {
            ObjectOutputStream bObjectOutputStream = new ObjectOutputStream(new FileOutputStream("produto.bin"));

            bObjectOutputStream.writeObject(novoproduto);
            bObjectOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void gravador(String caminho, List<Produto> produtos) throws FileNotFoundException, IOException {

        File file = new File(caminho);
        file.delete();
        file.createNewFile();
        //Se já existia outro, limpa

        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(caminho));
        obj.writeObject(produtos);
        obj.close();

    }
}
