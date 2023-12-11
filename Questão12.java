import java.util.Scanner;

public class Questão12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = sc.nextFloat();
        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if(nota < 5){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Recuperação");
        }
        sc.close();
    }
}
