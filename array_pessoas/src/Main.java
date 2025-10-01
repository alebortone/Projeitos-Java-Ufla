import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você deseja cadastrar? ");
        int n = sc.nextInt();
        Pessoas[] pessoa = new Pessoas[n];
        for ( int i = 0; i < n; i++){
            System.out.println("Insira os dados da " + (i+1) +"° pessoa (nome, idade e tamanho)");
            sc.nextLine();
            String nome =sc.nextLine();
            int idade = sc.nextInt();
            double tamanho = sc.nextDouble();
            pessoa[i] = new Pessoas(nome, idade, tamanho);
        }

        double mediaAltura =0;
        for (int i =0; i<n; i++){
            mediaAltura += pessoa[i].getTamanho();
        }

        System.out.printf("A media de altura de todas as pessoas é: %.2f%n", mediaAltura/n );


        int cont =0;
        for (int i =0; i<n; i++){

            if(pessoa[i].getIdade() <16){
                cont++;
            }
        }

        double porcent = (double)(cont*100.0)/n;

        System.out.printf("A porcentagem de pessoas menores de 16 anos foi de: %.2f%n", porcent);
        System.out.println("As pessoas que tem menos de 16 anos são:");

        for (int i =0; i<n; i++){

            if(pessoa[i].getIdade() <16){
            System.out.println(pessoa[i].getNome());
            }
        }

        sc.close();
    }
}