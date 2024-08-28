package UnidadeII;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int qtdCidades = 0;
        System.out.println("Quantas cidades existem? ");
        Scanner sc = new Scanner(System.in);
        qtdCidades = sc.nextInt();
        int[][] matrizDistancia = new int[qtdCidades][qtdCidades];        
        
        for (int i = 0; i < qtdCidades; i++) {
            for (int j = 0; j < qtdCidades; j++) {
                if (i != j) {
                    System.out.println("Qual é a distância da cidade " + (i) + " para a cidade " + (j) + "?");
                    matrizDistancia[i][j] = sc.nextInt();
                } else {
                    matrizDistancia[i][j] = 0; // A distância de uma cidade para ela mesma é 0
                }
            }
        }

        System.out.println("Matriz de distâncias:");
        for (int i = 0; i < qtdCidades; i++) {
            for (int j = 0; j < qtdCidades; j++) {
                System.out.print(matrizDistancia[i][j] + " ");
            }
            System.out.println();
        }

        int[] vetorResultado = new int[qtdCidades];

        System.out.println("Qual a cidade inicial? ");
        int cidadeInicial = sc.nextInt();

        for (int i = 0; i < qtdCidades; i++) {
            if(i == cidadeInicial){
                vetorResultado[i] = 0;
            } else{
                vetorResultado[i] = -1;
            }
        }

        MyFilaInterface<Integer> fila = new MyFila(qtdCidades);
        fila.adicionar(cidadeInicial);


        while (!fila.isEmpty()) {
            try {
                int cidadeAtual = fila.remover();
                
                for (int i = 0; i < qtdCidades; i++) {
                    int distancia = matrizDistancia[cidadeAtual][i]; //i é cidade visitada
                    if (distancia > 0 && vetorResultado[i] == -1) {
                        vetorResultado[i] =  vetorResultado[cidadeAtual] + distancia;
                        fila.adicionar(i);
                    }
                }
            } catch (MyException e) {
                e.printStackTrace();
            }
        }

        int cont = 0;

        for (int i : vetorResultado) {
            System.out.println("Distancia da cidade " + cidadeInicial + " para a cidade: " + cont + " = " + i);
            cont++;
        }

    }
}
