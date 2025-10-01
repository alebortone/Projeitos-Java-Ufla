import java.util.ArrayList;

public class Biblioteca {

    String nome;
    private ArrayList<Livros> livro;

    public Biblioteca(String nome){
        this.nome = nome;
        livro = new ArrayList<>();

    }

    public void adicionarLivro(Livros aux){

        livro.add(aux);

    }

    public Livros buscaLivro(String titulo){

        for (Livros e: livro){
            if(e.getNome().equals(titulo)){
                return e;

            }

        }
            return null;
    }

}
