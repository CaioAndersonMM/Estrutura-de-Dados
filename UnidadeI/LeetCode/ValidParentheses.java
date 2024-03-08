package UnidadeI.LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        HashMap<Character, Character> fechaduras = new HashMap<>();

        fechaduras.put(')', '(');
        fechaduras.put(']', '[');
        fechaduras.put('}', '{');

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (fechaduras.containsValue(s.charAt(i))) { //Se for uma abertura o primeiro elemento (contrario de fechadura)
                pilha.add(s.charAt(i));
            } else{ //É fechadura
                if (pilha.isEmpty() || pilha.peek() != fechaduras.get(s.charAt(i))) { //Vazio ou o último elemento da pilha é diferente do contrário do elemento atual
                    return false;
                }
            
                if (pilha.contains(fechaduras.get(s.charAt(i)))) {
                    pilha.pop();
                }
            }
        }

        if (pilha.isEmpty()) return true;
        else return false;

    }

    public static void main(String[] args) {
        isValid("()");
    }
}
