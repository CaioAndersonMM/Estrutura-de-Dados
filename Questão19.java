import java.util.Scanner;

public class Questão19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i+" x "+n+" = "+(i*n));
        }
        sc.close();
    }
}
