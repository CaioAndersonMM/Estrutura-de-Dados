import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EscreverBin {
    public static void main(String[] args) {
        Produto novoproduto = new Produto("Teclado", 100);

        try {
            ObjectInputStream bInputStream = new ObjectInputStream(new FileInputStream("produto.bin"));
            Object objeto = bInputStream.readObject();

            System.out.println(objeto);
        }
        catch (Exception e) {
            e.printStackTrace();
        }  


        try {
            ObjectOutputStream bObjectOutputStream = new ObjectOutputStream(new FileOutputStream("produto.bin"));

            bObjectOutputStream.writeObject(novoproduto);

        } catch (Exception e) {
            // TODO: handle exception
        }
        
        


    }
}
