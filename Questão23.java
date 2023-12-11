import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para ver o fatorial: ");
        int fatorial = sc.nextInt();
        for (int i = fatorial; i >= 2; i--) {
            fatorial *= (i - 1);
        }
        System.out.println("Resultado: " + fatorial);

        sc.close();
    }
}
