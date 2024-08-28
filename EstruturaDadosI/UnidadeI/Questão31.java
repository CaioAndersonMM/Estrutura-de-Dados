package UnidadeI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questão31 {
    public static class Pessoa {
        private String cpf, nome, sexo;
        private int idade;
        private float peso, altura, imc;

        public Pessoa(String cpf, String nome, String sexo, int idade, float peso, float altura, float imc) {
            this.cpf = cpf;
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
            this.imc = imc;
        }

        public String toString() {
            return "CPF ='" + cpf + '\'' +
                    ", Nome ='" + nome + '\'' +
                    ", Sexo ='" + sexo + '\'' +
                    ", Idade =" + idade +
                    ", Peso =" + peso +
                    ", Altura =" + altura +
                    ", IMC =" + imc;
        }

    }

    public static void main(String[] args) {
        System.out.println("Quantas pessoas deseja criar?");
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe os dados para a pessoa " + (i + 1));
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Nome: ");
            sc.nextLine(); //Limpar buffer
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

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Informações da pessoa " + (i + 1) + ": " + pessoas.get(i));
        }
        sc.close();
    }
}
