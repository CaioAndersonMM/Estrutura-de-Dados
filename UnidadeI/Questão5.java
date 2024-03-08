package UnidadeI;
import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextInt();
        float n2 = sc.nextInt();
        float n3 = sc.nextInt();

        System.out.println("Média Aritimética: " + ((n1 + n2 + n3)/3));

        sc.close();
    }
}
