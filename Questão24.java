import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean sair = false;

        while (sair == false) {
            System.out.println("1 - Potenciação");
            System.out.println("2 - Raiz Quadrada");
            System.out.println("3 - Fatorial");
            System.out.println("0 - Sair");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a base: ");
                    double base = sc.nextDouble();

                    System.out.println("Digite o expoente: ");
                    int expoente = sc.nextInt();

                    double resultado = Math.pow(base, expoente);

                    System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o número para ver sua raíz quadrada: ");
                    double n = sc.nextDouble();
                    System.out.println("A raiz quadrada de " + n + " é: " + Math.sqrt(n));
                    break;
                case 3:
                    System.out.println("Digite o número para ver fatorial");
                    int fatorial = sc.nextInt();
                    for (int i = fatorial; i >= 2; i--) {
                        fatorial *= (i - 1);
                    }
                    System.out.println("Resultado do Fatorial: " + fatorial);
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
