import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {

    private String [] tipoCafe;
    private double[] precoCafe;
    private String[] tipoComplemento;
    private double[] precoComplemento;
    private Cafe pedido;

    public Menu(){

        tipoCafe = new String[] {"Americano", "Expresso", "Sem cafeina"};
        precoCafe = new double[] {7.50, 4.30, 10.00};
        tipoComplemento = new String[] {"Leite", "Chocolate", "Canela"};
        precoComplemento = new double[] {5.00, 8.00, 2.00};

    }

    public void menuCafe (){

         System.out.print("### Tipos de café ###\n" +
                " 1. Americano\n" +
                " 2. Expresso\n" +
                " 3. Sem cafeína \n"+
                " Escolha o numero das opções: ");


    }

    public void menuOpcoes(){

        System.out.print("## Opções ##\n" +
                " 1. Adicionar complemento\n" +
                " 2. Remover complemento\n" +
                " 3.Gerar nota fiscal\n"+
                " 4. Sair\n" +
                " Escolha o numero das opções: ");


    }

    public void menuComplemento(){

        System.out.print("# Complementos #\n" +
                " 1. Leite\n" +
                " 2. Chocolate\n" +
                " 3. Canela\n"+
                " Escolha o numero das opções: ");


    }

    public void imprimirNota(){
        double total = calcularPreco();
         System.out.print("############# Nota fiscal #############\n" +
                " Café: " + pedido.getTipo() + "\n" +
                " Preço do café: R$" + total + "\n" );

        if (pedido.quantComplementos() > 0) {
            System.out.println("\nComplementos:");
            for (int i = 0; i < pedido.quantComplementos(); i++) {
                int cod = pedido.getComplemento(i);
                System.out.printf(" %s - R$ %.2f\n", tipoComplemento[cod - 1], precoComplemento[cod - 1]);
                total += precoComplemento[cod - 1];
            }
        }

        System.out.printf("Total - R$ %.2f\n", total);
        System.out.println("###########################################\n");
    }

    public double calcularPreco(){
        double preco = 0;

            if(pedido.getTipo().equals("Americano")){
                preco = precoCafe[0];
            } else if(pedido.getTipo().equals("Expresso")){
                preco = precoCafe[1];
            }else{
                preco = precoCafe[2];
            }
        return preco;

    }



    public void executar(){
        Scanner sc = new Scanner(System.in);
        int n;

        menuCafe();
        n = sc.nextInt();
        String opcao = tipoCafe[n-1];
        pedido = new Cafe(opcao);

        do{
            menuOpcoes();
            n = sc.nextInt();
            int y;
            switch (n) {
                case 1:
                    menuComplemento();
                    y = sc.nextInt();
                    pedido.inserirComplemento(y);
                    System.out.println();
                    break;
                case 2:
                    menuComplemento();
                    y = sc.nextInt();
                    pedido.removeComplemento(y);
                    System.out.println();
                    break;

                case 3:
                    imprimirNota();
                    System.out.println();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção não encontrada");
            }
        }while(n!=4);

        }
}







