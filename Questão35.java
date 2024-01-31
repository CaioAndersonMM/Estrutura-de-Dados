import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questão35 {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase a ser contada: ");
        String frase = sc.nextLine();

        Map<String, Integer> contadorFrases = new HashMap<>();

        String[] palavras = frase.split("\\s+");

        for (String palavra : palavras) {
            contadorFrases.put(palavra, contadorFrases.getOrDefault(palavra, 0)+1);
        }

        System.out.println("Resultado será salvo em .csv");
        String diretorioAtual = System.getProperty("user.dir");
        String caminhoArquivo = diretorioAtual + "/palavras.csv";

        System.out.println(caminhoArquivo);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))){
            writer.write("Palavra;Contagem\n"); //CABEÇALHO .CSV
            for (Map.Entry<String, Integer> entry : contadorFrases.entrySet()) {
                //MUDEI O '=' PARA ';' para se adequar a .csv
                String linha = entry.getKey() + ";" + entry.getValue() + "\n"; 
                //System.out.println(linha);
                writer.write(linha);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        try {
            //Reader leitor = new FileReader(caminhoArquivo);
            Scanner scanner = new Scanner(new File(caminhoArquivo));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                String[] valores = linha.split(";");

                for (String valor : valores) {
                    System.out.print(valor + "| ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
      

        sc.close();
    }
}
