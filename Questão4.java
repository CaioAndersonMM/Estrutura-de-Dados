import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Média Aritimética: " + ((n1 + n2 + n3)/3));

        sc.close();
    }
}
