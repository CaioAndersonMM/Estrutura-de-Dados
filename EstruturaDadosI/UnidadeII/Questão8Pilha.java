package UnidadeII;

import java.util.Scanner;

public class Questão8Pilha {
    public static void main(String[] args) {
        String exp;

        System.out.println("Diga a expressão PÓS FIXA: ");
        Scanner sc = new Scanner(System.in);
        exp = sc.nextLine();

        MyStackListInterface<String> pilha = new MyStackList<String>();

        String[] pedacos = exp.split("\\s+"); // Dividindo a string pelos espaços em branco

        try {
            for (String pedaco : pedacos) {
                if (pedaco.equals("+") || pedaco.equals("-")) { // Se for operador
                    String ultimo = pilha.pop();
                    String penultimo = pilha.pop();

                    if (pedaco.equals("+")) {
                        int soma = Integer.parseInt(penultimo) + Integer.parseInt(ultimo);
                        //System.out.println(soma);
                        String resultado = Integer.toString(soma);
                        pilha.push(resultado);
                        //System.out.println("empílhado" + resultado);
                    } else {
                        int sub = Integer.parseInt(penultimo) - Integer.parseInt(ultimo);
                        String resultado = Integer.toString(sub);
                        pilha.push(resultado);
                    }
                } else { // É operando!
                    pilha.push(pedaco);
                }
                // System.out.println(pedaco);
            }
            System.out.println("Resultado: " + pilha.peek());

        } catch (MyException e) {
            e.printStackTrace();
        }

        sc.close();

    }
}
