import java.util.Scanner;

public class Questão36 {

    public static int fatorial(int n){
        if (n == 1) {
            return n;
        }

        n = n * fatorial(n-1);

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual número deseja ver o fatorial? ");
        int n = sc.nextInt();
        System.out.println(fatorial(n));
        sc.close();
    }
}
