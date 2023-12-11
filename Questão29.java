import java.util.Scanner;

public class Questão29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o inteiro do vetor na posição "+i);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Trocando a posição do último com o primeiro");

        for (int i = vetor.length-1; i > 0; i--) {
            int temp = vetor[i];
            vetor[i] = vetor[i-1];
            vetor[i-1] = temp;
        }

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Número do inteiro na posição "+i+" do vetor: "+vetor[i]);
        }
        
        sc.close();
    }
}
