package UnidadeI;
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Questão33 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a palavra a ser contada: ");
            String palavra = sc.nextLine();

            Map<Character, Integer> contadorLetras = new HashMap<>();

            for (char letra : palavra.toCharArray()) {
                if (Character.isLetter(letra)) {
                   contadorLetras.put(letra, contadorLetras.getOrDefault(letra, 0) + 1);
                   //System.out.println(contadorLetras.get(letra));
                }
            }

            System.out.println("Resultado:");
            for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            sc.close();
        }
    }
