public class Livros {

    private String nome;
    private String autor;
    private int ano;

    public Livros (String nome, String autor, int ano){

        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void getDadosLivros(){

        System.out.println ("Título: " + nome + "\n" +
        "Autor: " + autor + "\n" +
        "Ano: " + ano);

    }


}
