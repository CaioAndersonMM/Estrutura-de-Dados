import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raio: ");
        float raio = sc.nextFloat();
        if (raio <= 0) {
            System.out.println("Erro! O raio deve ser um número positivo");
        } else {
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo é: " + area);
        }
        sc.close();
    }
}
