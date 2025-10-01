import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Biblioteca doce = new Biblioteca("doce");

        doce.add(new Livros("HQ", "Stan Lee", 1945));

    }
}