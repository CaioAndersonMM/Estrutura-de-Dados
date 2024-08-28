package UnidadeI;
import java.util.Scanner;

public class Questão14 {

    public static double calculoDelta(double a, double b, double c){
        return Math.pow(b, 2) - (4 * a *c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o coeficiente 'a': ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente 'b': ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente 'c': ");
        double c = sc.nextDouble();

        double delta = calculoDelta(a, b, c);
        double resultado = 0;

        if(delta > 0){
            resultado = (- b + Math.sqrt(delta))/(2*a);
            double resultado2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Raiz 1: "+resultado);
            System.out.println("Raiz 2: "+resultado2);
        }
        
        else if (delta == 0){
            resultado = (- b + Math.sqrt(delta))/(2*a);
            System.out.println("Raiz: " +resultado);

        }
        else{
            System.out.println("Não existe raiz real");
        }
        sc.close();
    }
}
