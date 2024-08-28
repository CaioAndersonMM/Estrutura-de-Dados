package UnidadeI;
import java.util.Scanner;

public class Questão20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o investimento inicial: ");
        float investimentoinicial = sc.nextFloat();
        System.out.println("Informe o investimento mensal: ");
        float investimentomensal = sc.nextFloat();
        System.out.println("Quantidade de meses: ");
        int qtdMeses = sc.nextInt();
        //System.out.println("Saldo acumulado: ");
        //float saldoacumulado = sc.nextFloat();
        float saldoacumulado;
        System.out.println("Taxa de Juros Mensal: ");
        float taxajurosmensal = sc.nextFloat();
        //System.out.println("Rendimento Mensal: ");
        //float rendimentomensal = sc.nextFloat();
        float rendimentomensal;
        
        saldoacumulado = investimentoinicial;

        for (int mes = 1; mes <= qtdMeses; mes++) {
            saldoacumulado += investimentomensal;
            rendimentomensal = saldoacumulado * taxajurosmensal;
            saldoacumulado += rendimentomensal;

            System.out.printf("Mês %d: Saldo acumulado = %.2f, Rendimento mensal = %.2f%n", mes, saldoacumulado, rendimentomensal);
        }



        sc.close();
    }
}
