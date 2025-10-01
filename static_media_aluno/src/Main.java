import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos =new Aluno[5];

        for (int i=0;i<5;i++){

            String nome = sc.next();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        double[] medias = new double[5];
        for (int i=0;i<5;i++){

            medias[i] = alunos[i].calcularMedia();
            alunos[i].aprovados();
            System.out.println(alunos[i].getAlunos() + " |Media: " + medias[i] +  " " + alunos[i].situacao());

        }

        System.out.println("\nNumeros de alunos aprovados: " + Aluno.nAprovados);


        double maior = medias[0];
        String melhor = alunos[0].getAlunos();
        for (int i = 0; i<5;i++){

            if(maior < medias[i])
                maior = medias[i];

            if (maior == alunos[i].calcularMedia() )
                melhor = alunos[i].getAlunos();

        }

        System.out.println("O aluno com a maior média foi: " + melhor + " (" + maior + ")");
    }
}


