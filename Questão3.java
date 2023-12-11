import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Adição: " + (n1+n2));
        System.out.println("Subtração: " + (n1-n2));
        System.out.println("Multiplicação: " + (n1*n2));
        System.out.println("Quociente da divisão: " + ((double)n1/(double)n2));
        System.out.println("Resto da divisão: " + (n1%n2));

        sc.close();
    }
}
