import java.util.Scanner;

public class App{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Insira a categoria do aluno (bolsista/não bolsista): ");
        String categoria = sc.nextLine();
        Alunos aluno = new Alunos(nome, categoria);

        int cont = 1;
        System.out.printf("Insira a nota na disciplina %d: ", cont);
        double nota = sc.nextDouble();
        aluno.adicionarNotas(nota);

        char resposta;
        do {
            System.out.print("Deseja adicionar outra nota? (S/N) ");
            resposta = sc.next().charAt(0);
            if (resposta == 'S'){
                cont++;
                System.out.printf("Insira a nota na disciplina %d: ", cont);
                nota = sc.nextDouble();
                aluno.adicionarNotas(nota);
            }

        }while (resposta == 'S' );

        System.out.println("############# Relatorio Final #############\n" +
                "Aluno: " + aluno.getNome() + "\n" +
                "Coeficiente de Rendimento: "+ aluno.mediaAluno() + "\n" +
                "Situação Final: " + aluno.situcaoAluno());


        sc.close();
    }
}