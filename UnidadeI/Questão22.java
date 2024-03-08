package UnidadeI;
import java.util.Scanner;

public class Questão22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        int inicial = sc.nextInt();

        System.out.println("Digite o número final: ");
        int finale = sc.nextInt();

       for (int i = inicial+1; i <= finale; i++) {
            inicial += i;
       }
       System.out.println("Resultado: "+inicial);

        sc.close();
    }
}
