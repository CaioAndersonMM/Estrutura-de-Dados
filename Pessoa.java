import java.io.Serializable;

public class Pessoa implements Serializable{
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
