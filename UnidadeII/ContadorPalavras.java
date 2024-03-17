package UnidadeII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ContadorPalavras {

    public static class Letras implements Serializable {
        private char simbol;
        private int quantidade;

        public Letras(char simbol){
            this.simbol = simbol;
            this.quantidade = 1;
        }

    }

    public static void main(String[] args) {
        MyLinkedListInterface<Letras> charList = new MyLinkedList<Letras>();

        try (BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\caioa\\Documents\\Projetos\\Estrutura de Dados - LISTA\\EstruturaDeDados\\UnidadeII\\texto.txt"))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;

                boolean encontrado = false;
                for (int i = 0; i < charList.size(); i++) {
                    Letras letra = charList.get(i); // indices
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
            Letras letra = charList.get(i); // indices
            System.out.println(letra.simbol + " - " + letra.quantidade);
        }

        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(
                "C:\\Users\\caioa\\Documents\\Projetos\\Estrutura de Dados - LISTA\\EstruturaDeDados\\UnidadeII\\texto.bin"))) {
            writer.writeObject(charList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\caioa\\Documents\\Projetos\\Estrutura de Dados - LISTA\\EstruturaDeDados\\UnidadeII\\textoSalvo.txt", false))) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < charList.size(); i++) {
                Letras letra = charList.get(i);
                buffer.append(letra.simbol); 
                buffer.append(": ");
                buffer.append(letra.quantidade); 
                buffer.append("\n");
            }

            writer.write(buffer.toString()); 

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
