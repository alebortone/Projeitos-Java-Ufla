import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario x;

        System.out.println("Quantos funcionarios você deseja cadastrar?");
        int n = sc.nextInt();
        for( int i = 0; i<n; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String nome = sc.nextLine();
            double salario = sc.nextDouble();

            x = new Funcionario(id, nome, salario);
            funcionarios.add(x);
        }



    sc.close();
    }
}