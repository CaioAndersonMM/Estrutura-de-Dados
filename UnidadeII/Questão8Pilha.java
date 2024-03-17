package UnidadeII;

import java.util.Scanner;

public class Questão8Pilha {
    public static void main(String[] args) {
    String exp;

    System.out.println("Diga a expressão: ");
    Scanner sc = new Scanner(System.in);
    exp = sc.nextLine();

    MyStackListInterface<String> pilha = new MyStackList<String>(); 

    String[] pedacos = exp.split("\\s+"); // Dividindo a string pelos espaços em branco
    
    for (String pedaco : pedacos) {
        if (pedaco.equals("+") || pedaco.equals("-")) { //Se for operador
            try {
                String ultimo = pilha.pop();
                String penultimo = pilha.pop();

                if (pedaco.equals("+")) {
                    int soma =  Integer.parseInt(penultimo) + Integer.parseInt(ultimo);
                    System.out.println(soma);
                    String resultado = Integer.toString(soma);
                    pilha.push(resultado);
                    System.out.println("empílhado" + resultado);
                } else{
                    int sub =  Integer.parseInt(penultimo) - Integer.parseInt(ultimo);
                    String resultado = Integer.toString(sub);
                    pilha.push(resultado);
                }

            } catch (MyException e) {
                e.printStackTrace();
            }    
        } else{
            try {
                pilha.push(pedaco);
            } catch (MyException e) {
                e.printStackTrace();
            }
        }

        System.out.println(pedaco);
    }

    try {
        System.out.println(pilha.peek());
    } catch (MyException e) {
        e.printStackTrace();
    }

    sc.close();
    }
}
