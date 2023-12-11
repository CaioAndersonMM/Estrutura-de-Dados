import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua altura: ");
        float altura = sc.nextFloat();
        System.out.println("Seu peso: ");
        float peso = sc.nextFloat();
       
        if(peso == 0 || altura == 0){
            System.out.println("ALERTA: Divisão por 0!");
        } else{
            System.out.println("IMC: "+(peso/(altura*altura)));
        }
        sc.close();
    }
}
