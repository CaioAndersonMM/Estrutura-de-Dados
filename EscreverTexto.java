import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverTexto {
    public static void main(String[] args) {
        String caminho = "teste.txt";
        String conteudo = "Caio é muito lindo, charmoso e amoroso";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write(conteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(caminho))){
            String line = "";
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }  
        } catch (IOException e) {
            System.out.println("Erro de Leitura");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
