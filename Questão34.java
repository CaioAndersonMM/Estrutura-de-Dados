import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questão34 {
    public static void main(String[] args) {

        // Posso usar novamente meu hashmap, porém, ao invés de caractere usando string
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase a ser contada: ");
        String frase = sc.nextLine();

        Map<String, Integer> contadorFrases = new HashMap<>();

        String[] palavras = frase.split("\\s+");
        // Isso separa minha frase por espaços, as palavras estarão em cada indice do vetor

        for (String palavra : palavras) {
            // System.out.println(palavra);
            contadorFrases.put(palavra, contadorFrases.getOrDefault(palavra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : contadorFrases.entrySet()) {
            String linha = entry.getKey() + " = " + entry.getValue();
            System.out.println(linha);
        }
        sc.close();
    }
}
