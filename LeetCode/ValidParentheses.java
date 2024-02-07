package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        HashMap<Character, Character> letras = new HashMap<>();

        letras.put('(', ')');
        letras.put('[', ']');
        letras.put('{', '}');

        HashMap<Character, Character> fechaduras = new HashMap<>();

        fechaduras.put(')', '(');
        fechaduras.put(']', '[');
        fechaduras.put('}', '{');

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (letras.containsKey(s.charAt(i))) { //Se for uma abertura o primeiro elemento
                System.out.println(s.charAt(i));
                pilha.add(s.charAt(i));
                System.out.println(pilha);
            } else{ //É fechadura

                if (pilha.isEmpty()) {
                    return false;
                }

                System.out.println("é fechadura");
                System.out.println(s.charAt(i));

                //fechadura não pode ser diferente do tipo anterior
                if (fechaduras.get(s.charAt(i)) != pilha.peek()) {
                    System.out.println("DIFERENTE");
                    return false;
                
                }
                
                if (pilha.contains(fechaduras.get(s.charAt(i)))) {
                    pilha.pop();
                }
            
                System.out.println(pilha);
            }
        }

        if (pilha.isEmpty()) return true;
        else return false;

    }

    public static void main(String[] args) {
        isValid("()");
    }
}
