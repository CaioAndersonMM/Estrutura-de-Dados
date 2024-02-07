package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numeros = new HashMap<>();

        int resultado = 0;

        for (int i = 0; i < nums.length; i++) {
            numeros.put(nums[i], numeros.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            if (entry.getValue() == 1) {
                resultado = entry.getKey();
            }
        }

        System.out.println(resultado);
        return resultado;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 3 };
        singleNumber(nums);
    }
}
