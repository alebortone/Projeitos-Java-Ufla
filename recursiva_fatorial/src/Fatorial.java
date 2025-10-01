import java.util.Scanner;

public class Fatorial {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;

        for (int i = n; i > 0; i--){

            result *=  i;

    }
    System.out.println("Resultado com for: " + result);

    System.out.println("Resultado usando recursiva " + fatorial(n));


        sc.close();
    }
    
    // Função recursiva para calcular o fatorial
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        }
        return n * fatorial(n - 1); // Chamada recursiva
    }





}


