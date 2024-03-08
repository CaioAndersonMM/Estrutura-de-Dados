package UnidadeI;
import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
       
        if(n1 == 0 || n2 == 0){
            System.out.println("ALERTA: Divisão por 0!");
        } else{
            System.out.println("Divisão: "+(n1/n2));
        }
        sc.close();
    }
}
