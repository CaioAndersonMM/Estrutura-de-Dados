package UnidadeI;
import java.io.Serializable;

class Produto implements Serializable{
    private String nome;
    private float valor;

    public Produto(){

    }

    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    public String toString(){
        return "Nome = " + this.nome + ", Valor = " + this.valor;
    }

}