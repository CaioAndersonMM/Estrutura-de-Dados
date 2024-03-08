package UnidadeI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverTexto {
    public static void main(String[] args) {
        String caminho = "teste.txt";
        String conteudo = "Caio é muito estudioso, ele vai passar em ED I \nCaio passará em ED I";
        String caminho2 = "teste2.txt";
        String conteudo2 = "A1;A2;" + "\n" + "B1;B2;";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write(conteudo);
            writer.close();

            BufferedWriter writer2 = new BufferedWriter(new FileWriter(caminho2));
            writer2.write(conteudo2);
            writer2.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(caminho))){
            String line = "";
            String str = "";
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                str+= line + "\n";
                line = reader.readLine();
            }  

            //System.out.println(str);
        } catch (IOException e) {
            System.out.println("Erro de Leitura");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // DEIXANDO OS CAMPOS A1;A2; \n B1;B2; SEPARADOS: [A1] [A2] [B1] [B2]
        try(BufferedReader reader = new BufferedReader(new FileReader(caminho2))){
            String line = "";
            String resultado = ""; 
            line = reader.readLine();
            while (line != null) {
                String partes[] = line.split(";");
                for (String parte : partes) {
                    resultado += "[" + parte + "]" + " "; 
                }
                //System.out.println(line);
                line = reader.readLine();
            } 

            System.out.println(resultado);
        } catch (IOException e) {
            System.out.println("Erro de Leitura");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
