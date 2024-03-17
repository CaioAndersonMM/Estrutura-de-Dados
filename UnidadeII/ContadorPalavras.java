package UnidadeII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPalavras {

    public static class Letras{
        private char simbol;
        private int quantidade;

        public Letras(char simbol){
            this.simbol = simbol;
            this.quantidade = 1;
        }

    }
    public static void main(String[] args) {
        MyLinkedListInterface<Letras> charList  = new MyLinkedList<Letras>();

         try (BufferedReader reader = new BufferedReader(new FileReader(new File("texto.txt")))) {
            int charCode;
            while ((charCode = reader.read()) != -1) { 
                char character = (char) charCode;

                boolean encontrado = false;
                for (int i = 0; i < charList.size(); i++) {
                    Letras letra = charList.get(i); //indices
                    if (letra.simbol == character) {
                        letra.quantidade++;
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    Letras novaLetra = new Letras(character);
                    charList.add(novaLetra);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < charList.size(); i++) {
            Letras letra = charList.get(i); //indices
            System.out.println(letra.simbol + " - " + letra.quantidade);
        }
    }
}
