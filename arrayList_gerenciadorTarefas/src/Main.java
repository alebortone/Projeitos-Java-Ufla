import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaTarefas listadetarefas = new ListaTarefas();

        menu();
        int resposta = sc.nextInt();
        do {
            sc.nextLine();
            switch (resposta) {

                case 1:
                    System.out.print("\nInsira a descrição da tarefa: ");
                    listadetarefas.adicionarTarefas(sc.nextLine());
                    break;

                case 2:
                    listadetarefas.listarTarefas();
                    break;
                case 3:
                    System.out.print("\nQual tarefa você deseja concluir? (indice) ");
                    listadetarefas.concluirTarefas(sc.nextInt());
                    break;
                case 4:
                    listadetarefas.removerConcluidas();
                    System.out.println("Tarefas removidas");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nNumero invalido, por favor digite novamente!");
            }
            if(resposta !=0){
                menu();
                resposta = sc.nextInt();
            }

        }while(resposta !=0);

        sc.close();
    }

    public static void menu(){

        System.out.print("1 - Adicionar tarefa\n" +
                "2 - Listar tarefas\n" +
                "3 - Concluir tarefa\n" +
                "4 - Remover tarefas concluídas\n" +
                "0 - Sair\n" +
                "Escolha uma das oções: ");
    }

}