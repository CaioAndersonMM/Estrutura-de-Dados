package UnidadeI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Questão40Melhorada {
        public static void main(String[] args) {
    
        try {
            criptografar("mensagem.txt");
            descriptografar("mensagemcriptografada.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void criptografar(String caminho) throws IOException{
        BufferedReader inputStream = new BufferedReader(new FileReader(caminho));

        StringBuffer sbResult = new StringBuffer();
        String linha = inputStream.readLine();

        while (linha != null) {
            sbResult.append(linha + "\n");
            linha = inputStream.readLine();
        }

        inputStream.close();

        sbResult = codificador(sbResult);
        System.out.println(sbResult);

        BufferedWriter escrever = new BufferedWriter(new FileWriter("mensagemcriptografada.txt"));
        escrever.write(sbResult.toString());
        escrever.close();
    }

    public static void descriptografar(String caminho) throws IOException{
        BufferedReader inputStream = new BufferedReader(new FileReader(caminho));

        StringBuffer sbResult = new StringBuffer();
        String linha = inputStream.readLine();

        while (linha != null) {
            sbResult.append(linha + "\n");
            linha = inputStream.readLine();
        }

        sbResult = codificador(sbResult);
        System.out.println(sbResult);
        inputStream.close();

        BufferedWriter escrever = new BufferedWriter(new FileWriter("mensagemdescriptografada.txt"));
        //escrever.append(sbResult);
        escrever.write(sbResult.toString());
        escrever.close();
    }

    public static StringBuffer codificador(StringBuffer sbResult){

        Map<Character, Character> mapeamento = new HashMap<>();
        mapeamento.put('Z', 'P');
        mapeamento.put('P', 'Z');
        mapeamento.put('O', 'E');
        mapeamento.put('E', 'O');
        mapeamento.put('N', 'L');
        mapeamento.put('L', 'N');
        mapeamento.put('I', 'A');
        mapeamento.put('A', 'I');
        mapeamento.put('T', 'R');
        mapeamento.put('R', 'T');

        for (int i = 0; i < sbResult.length(); i++) {
            char letra = Character.toUpperCase(sbResult.charAt(i));

            if (mapeamento.containsKey(letra)) {
                char letranova = mapeamento.get(letra);
                sbResult.setCharAt(i, Character.isUpperCase(sbResult.charAt(i)) ? letranova : Character.toLowerCase(letranova));
            }
        }

        return sbResult;
    }
}
