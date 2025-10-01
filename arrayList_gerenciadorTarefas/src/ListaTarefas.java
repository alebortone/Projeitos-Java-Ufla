import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas;

    public ListaTarefas(){

        tarefas = new ArrayList<Tarefa>();

    }

    public void adicionarTarefas(String objetivos) {
        Tarefa nova = new Tarefa(objetivos);  // cria a tarefa
        tarefas.add(nova);                   // adiciona na lista
    }

    public void listarTarefas(){
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            System.out.println((i + 1) + " - " + t.conclusao() + " " + t.getDescricao() + "\n");
        }
    }

    public void concluirTarefas (int indice){

        tarefas.get(indice).marcarConclusao();

    }

    public void removerConcluidas(){

        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa t = iterator.next();
            if (t.isConcluida()) {
                iterator.remove(); // remover com segurança
            }
        }


    }
}
