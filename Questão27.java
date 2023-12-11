import java.util.Scanner;

public class Questão27 {
    public static int[] inversor(int[] vetor){
        int [] vetorinvertido = new int[vetor.length];

        for (int i = 1; i <= vetor.length; i++) {
            vetorinvertido[i-1] = vetor[vetor.length-i];
        }

        return vetorinvertido;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o inteiro do vetor na posição "+i);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Chamando função de inverter...");

        int[] invertido = inversor(vetor);

        //imprime vetor invertido

        for (int i = 0; i < invertido.length; i++) {
            System.out.println("Número do inteiro na posição "+i+" do vetor invertido: "+invertido[i]);
        }
        sc.close();
    }
}
