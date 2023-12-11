import java.util.Scanner;

public class Questão25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o inteiro do vetor na posição "+i);
            vetor[i] = sc.nextInt();
        }

        //imprime vetor

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Número do inteiro na posição "+i+" do vetor: "+vetor[i]);
        }
        sc.close();
    }
}
