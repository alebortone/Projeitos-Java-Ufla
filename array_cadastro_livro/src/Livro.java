public class Livro {

    private String nome;
    private String autor;
    private int npaginas;
    private int publicacao;


    public Livro (String nome, String autor, int npaginas, int publicacao){

        this.nome = nome;
        this.autor = autor;
        this.npaginas = npaginas;
        this.publicacao = publicacao;

    }

    public void setNome(String nome){

        this.nome = nome ;

    }

    public void setAutor(String autor){

        this.autor = autor;

    }

    public void setNpaginas(int npaginas){

        this.npaginas = npaginas;

    }

    public void setPublicacao(int publicacao){

        this.publicacao = publicacao;

    }



    public String toString(){

        return "Nome: " + nome +
                " do autor " + autor +
                " com " + npaginas + " paginas " +
                "publicado em " + publicacao + String.format("%n");


    }



}
