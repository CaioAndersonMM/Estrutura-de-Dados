package UnidadeI;

public class Questão38 {

    public static <T> void exibirObjetoGenerico(T objeto) {
        System.out.println(objeto.toString());
        //Implementar toString no objetivo - que é Produto, no exemplo
    }

    public static <E> void exibirElementosVetor(E[] vetor){
        for (Object elemento : vetor) {
            System.out.print(elemento);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("094928342", "Caio Anderson", "Macho", 19, 70.0f, 1.70f, 27.0f);

        exibirObjetoGenerico(pessoa);

        //int vetorinteiro[] = {0,1,2}; - Tem que usar Integer pois ele é inteiro
        Integer vetorinteiro[] = {0,1,2};
        String vetorstring[] = {"caio", "amor"};

        exibirElementosVetor(vetorinteiro);
        exibirElementosVetor(vetorstring);


    }
}
