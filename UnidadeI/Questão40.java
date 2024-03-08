package UnidadeI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Questão40 {
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
        for (int i = 0; i < sbResult.length(); i++) {
            boolean maiusculo = false;

            if (Character.isUpperCase(sbResult.charAt(i))) {
                maiusculo = true;
            }

            char letra = Character.toLowerCase(sbResult.charAt(i));

            switch (letra) {
                case 'z':
                    //ISSO SUBSTITUI O IF E ELSE
                    sbResult.setCharAt(i, Character.isUpperCase(sbResult.charAt(i)) ? 'P' : 'p');
                    break;
                case 'p':
                    sbResult.setCharAt(i, maiusculo ? 'Z' : 'z');
                break;
                case 'e':
                    sbResult.setCharAt(i, Character.isUpperCase(sbResult.charAt(i)) ? 'O' : 'o');
                    break;
                case 'o':
                    sbResult.setCharAt(i, maiusculo ? 'E' : 'e');
                    break;
                case 'n':
                    if (maiusculo) {
                        sbResult.setCharAt(i, 'L');
                    } else {
                        sbResult.setCharAt(i, 'l');
                    }
                    break;
                case 'l':
                    sbResult.setCharAt(i, maiusculo ? 'N' : 'n');
                    break;

                case 'i':
                    if (maiusculo) {
                        sbResult.setCharAt(i, 'A');
                    } else {
                        sbResult.setCharAt(i, 'a');
                    }
                    break;
                case 'a':
                    sbResult.setCharAt(i, maiusculo ? 'I' : 'i');
                    break;
                case 't':
                    if (maiusculo) {
                        sbResult.setCharAt(i, 'R');
                    } else {
                        sbResult.setCharAt(i, 'r');
                    }
                    break;
                case 'r':
                    sbResult.setCharAt(i, maiusculo ? 'T' : 't');
                    break;
                default:
                    break;
            }
        }

        return sbResult;
    }
}
