import java.util.Scanner;

public class Questão37 {
    public static int somatorio(int de, int ate){

        if ((de - ate) == 0) {
            return ate;
        }

        //de++;

        int soma = de + somatorio(de+1, ate);
        //int soma = de + somatorio(de++, ate);
        //o código comentado acima enfrentava problema grave, pois não se pode incrementar assim uma variável dentro da função que será recursiva.

        return soma;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do número: ");
        int n = sc.nextInt();
        System.out.println("Até: ");
        int m = sc.nextInt();

        sc.close();

        int somatorio = 0;

        int aux1 = n; int aux2 = m;

        for (; n <= m; n++ ) {
            somatorio += n;
        }

        System.out.println("Resultado usando laço de repetição: "+somatorio);

        System.out.println("Resultado com recursividade: "+somatorio(aux1, aux2));


        //C) A recursividade demorou bastante tempo para que eu conseguisse implementar. Diferente da com estrutura de repetições, que foi super rápida. A Recursiva, gera uma pilha desnecessária. E além do mais, houve um problema que quase custou meu código, várias vezes, pois não se pode incrementar x++ a uma variável dentro da função que irá ter a recursivdade aplicada.
    }
}
