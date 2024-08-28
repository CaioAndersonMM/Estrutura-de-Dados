package UnidadeI;
import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float refri = 1.5f;
        float fatia = 3f;
        float taxa = 0.10f;

        System.out.println("Quantidade de refrigerante: ");
        int qtdrefri = sc.nextInt();
        System.out.println("Quantidade de Fatias: ");
        int qtdfatias = sc.nextInt();
        System.out.println("Quantidade de Pessoas na Mesa: ");
        int qtdpessoas = sc.nextInt();

        float valortotal = (qtdrefri*refri)+(qtdfatias*fatia);
        System.out.println("Valor Total: "+ valortotal);
        System.out.println("Valor Total com taxa: "+ (valortotal + (valortotal*taxa)));
        System.out.println("Rateio por pessoa: " +((valortotal*taxa)/qtdpessoas));

        sc.close();
    }
}
