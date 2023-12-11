import java.util.Scanner;

public class Questão13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas 3 notas: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        float nota = (n1+n2+n3)/3;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota < 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }

        

        sc.close();
    }
}
