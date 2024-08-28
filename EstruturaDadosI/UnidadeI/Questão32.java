package UnidadeI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questão32 {
    private static String FILE_NAME = "pessoas.bin";

    public static void main(String args[]){

        List<Pessoa> pessoas = carregarDoArquivo();
        exibirPessoas(pessoas);

        System.out.println("Quantas pessoas deseja criar?");
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe os dados para a pessoa " + (i + 1));
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso: ");
            float peso = sc.nextFloat();
            System.out.print("Altura: ");
            float altura = sc.nextFloat();
            float imc = peso / (altura * altura);

            Pessoa pessoa = new Pessoa(cpf, nome, sexo, idade, peso, altura, imc);
            pessoas.add(pessoa);
        }

        salvarEmArquivo(pessoas);
        exibirPessoas(pessoas);
        sc.close();

    }

    private static void salvarEmArquivo(List<Pessoa> pessoas) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(pessoas);
            System.out.println("Dados salvos em " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     private static List<Pessoa> carregarDoArquivo() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Pessoa>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os dados do arquivo binário: " + e.getMessage());
        }
        return new ArrayList<>(); // retorna ArrayList Vazio
    }

    private static void exibirPessoas(List<Pessoa> pessoas) {
        if (pessoas != null) {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }
}
