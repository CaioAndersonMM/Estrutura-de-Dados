import java.util.Scanner;

public class Questão30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();
        String fraseinversa = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            fraseinversa += frase.charAt(i);
        }

        System.out.println("Frase Invertida: " + fraseinversa);

        sc.close();
    }
}
