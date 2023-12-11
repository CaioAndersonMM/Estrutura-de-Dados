import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        int n = sc.nextInt();
        System.out.print("Digite o numero final: ");
        int m = sc.nextInt();
        
        sc.close();

        int cont = n;

        //While
        while (cont <= m) {
            System.out.print(" "+cont);
            cont++;
        }

        cont = n; 
        System.out.println();

        //do while
        do {
            System.out.print(" "+cont);
            cont++;
        } while (cont <= m);
     
        System.out.println();

        //for
        for (cont = n; cont <= m; cont++) {
            System.out.print(" "+cont);
        }

    }
}
