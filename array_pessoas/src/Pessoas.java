public class Pessoas {

    private String nome;
    private int idade;
    private double tamanho;

    public Pessoas(String nome, int idade, double tamanho){

        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getTamanho() {
        return tamanho;
    }
}
