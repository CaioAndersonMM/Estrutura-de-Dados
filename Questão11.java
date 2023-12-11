import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float conta1 = 100f;
        float conta2 = 100f;

        System.out.println("Quanto quer transferir?");
        float transferencia = sc.nextFloat();

        if (conta1 > transferencia) {
            conta1 -= transferencia;
            conta2 += transferencia;
            System.out.println("Sucesso");
        } else{
            System.out.println("Saldo Insuficiente");
        }
        sc.close();
    }
}
