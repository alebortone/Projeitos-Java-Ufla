import java.util.ArrayList;
import java.util.Iterator;

public class Cafe {

     private static String tipo;
     private  ArrayList<Integer> complemento;

    public Cafe(String tipo){

        this.tipo = tipo;
        complemento = new ArrayList<Integer>();

    }

    public static String getTipo() {
        return tipo;
    }

    public void inserirComplemento(int codigo){

        complemento.add(codigo);

    }

    public void removeComplemento (int codigo){

        Iterator<Integer> it = complemento.iterator();
        while (it.hasNext()) {
            int e = it.next();
            if (e == codigo) {
                it.remove(); // forma correta de remover durante a iteração

            }
        }
    }

    public int quantComplementos(){

        return complemento.size();

    }

    public int getComplemento(int x){

        return complemento.get(x);

    }



}
