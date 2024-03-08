package UnidadeI;
import java.util.Scanner;

public class Questão17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        int n = sc.nextInt();
        System.out.print("Digite o numero final: ");
        int m = sc.nextInt();

        sc.close();


        int cont = n;

        // While
        while (cont <= m) {
            if (cont % 2 != 0)
                System.out.print(" " + cont);
            cont++; 
        }

        cont = n;
        System.out.println();

        // do while
        do {
            if (cont % 2 != 0)
                System.out.print(" " + cont);
            cont++;
        } while (cont <= m);

        System.out.println();

        // for
        for (cont = n; cont <= m; cont++) {
            if (cont % 2 != 0)
                System.out.print(" " + cont);
     
        }

    }
}
