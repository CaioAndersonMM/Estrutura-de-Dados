package UnidadeI;
import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificador = true;
        String senhacorreta = "caio";
        String senha = "";
        while (verificador == true) {
            System.out.println("Informe a senha: ");
            senha = sc.nextLine();

            if (senha.equals(senhacorreta)) {
                System.out.println("Senha correta");
                verificador = false;
            } else {
                System.out.println("Senha incorreta");
            }
        }

        verificador = true;
        System.out.print("Agora com do while ");

        do {
            System.out.println("Informe a senha: ");
            senha = sc.nextLine();
            if (senha.equals(senhacorreta)) {
                System.out.println("Senha correta");
                verificador = false;
            } else {
                System.out.println("Senha incorreta");
            }
        } while (verificador == true);

        sc.close();
    }
}
