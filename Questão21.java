import java.util.Scanner;

public class Questão21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para ver se ele é primo: ");
        float n = sc.nextFloat();

        boolean primo = true;

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("É divisível por " + i);
                if (i != n && i != 1) {
                    primo = false;
                }
            }
        }
        if (primo) {
            System.out.println("Ele é um número primo!");
        } else {
            System.out.println("Logo, ele não é primo!");
        }

        sc.close();
    }
}
