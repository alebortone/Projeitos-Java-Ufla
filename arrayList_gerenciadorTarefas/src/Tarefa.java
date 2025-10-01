public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa (String descricao){

        this.descricao = descricao;
        concluida =false;

    }

    public void marcarConclusao(){
        concluida = true;

    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public String conclusao(){

        String palavra;
        if (!concluida){
            palavra = "[ ]";
        }else {
            palavra = "[x]";
        }
        return palavra;
    }

}
