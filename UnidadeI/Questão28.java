package UnidadeI;
import java.util.Scanner;

public class Questão28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o inteiro do vetor na posição "+i);
            vetor[i] = sc.nextInt();
        }

        int maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(i == 0){
                menor = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println("Maior é: "+maior);
        System.out.println("Menor é: "+menor);

        
        sc.close();
    }
}
