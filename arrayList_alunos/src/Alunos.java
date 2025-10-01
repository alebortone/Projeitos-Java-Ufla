import java.util.ArrayList;
import java.util.Iterator;

public class Alunos {

    private String nome;
    private String categoria;
    private ArrayList<Double> notas;

    public Alunos(String nome, String categoria){

        this.nome = nome;
        this.categoria = categoria;
        notas = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public double getNotas(int x) {
        return notas.get(x-1);
    }

    public Double mediaAluno(){

        Double media=  0.0;
        Iterator<Double> it = notas.iterator();
        while(it.hasNext()){
            media += it.next();

        }

        return media/notas.size();

    }

    public String situcaoAluno (){
        
        if(categoria.equals("bolsista")){
            if (mediaAluno()>=75) {
                return "regular";
            }
        }else {
            if (mediaAluno() >= 70) {
                return "regular";
            }
        }
        return "Desligado";

    }

    public void adicionarNotas(double nota){

        notas.add(nota);

    }

}
