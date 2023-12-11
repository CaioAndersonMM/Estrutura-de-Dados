import java.util.Scanner;

public class Questão26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz (Linhas): ");
        int linhas = sc.nextInt();
        System.out.println("Digite o tamanho da matriz (Colunas): ");
        int colunas = sc.nextInt();

        int[][] matriz = new int [linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o número da linha "+i+" coluna "+j);
                matriz[i][j] = sc.nextInt();
            }
        }

        //imprime matriz

       for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Linha "+i+" Coluna "+j+": "+ matriz[i][j]);
            }
        }
        sc.close();
    }
}
