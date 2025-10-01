import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos livros deseja cadastrar? ");
        int n = sc.nextInt();

        Livro[] livros = new Livro[n];

        for ( int i = 0; i< n; i++){



            sc.nextLine();
            System.out.println("Livro " + (i + 1));
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Numero de Paginas: ");
            int paginas = sc.nextInt();

            System.out.print("Ano publicado: ");
            int ano = sc.nextInt();

            System.out.println();
            livros[i] = new Livro(name, autor, paginas, ano);
        }

        for (int i = 0;  i <n; i++){

            System.out.println(livros[i]);


        }





    }
}