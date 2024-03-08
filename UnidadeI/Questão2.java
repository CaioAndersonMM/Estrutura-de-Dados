package UnidadeI;
import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int idade = sc.nextInt();
    float altura = sc.nextFloat(); 
    char primeiraLetraNome = sc.next().charAt(0);
    String nomeCompleto = sc.nextLine();

    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura + " metros");
    System.out.println("Primeira letra do nome: " + primeiraLetraNome);
    System.out.println("Nome completo: " + nomeCompleto);
    sc.close();
    }
}
