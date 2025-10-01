import java.util.Scanner;

public class exerciciosAula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" "); // dessa forma eu quebrei a frase que eu escrevi e cada palavra virou um endereço no vetor

        int cont = 0, contMaior = 0;
        String palavraMaior = palavras[0];
        for (int i = 0; i < palavras.length; i++) {// como eu nao sei quantos "numeros" tem o vetor, eu uso ".length" pois ele me mostra o tamanho
            String palavra = palavras[i]; // aq foi para que a cada palavra que o vetor percorresse ela e pudesse ser analisada da forma correta
            for (int j = 0; j < palavra.length(); j++) {
                char letra = palavra.charAt(j);// pegando a variavel letra, a gnt consegue ver cada letra da palavra da vez e assim analisa-la
                if (letra == 'a'  || letra == 'e' || letra =='i' || letra =='o' ||letra =='u') {
                    cont++;
                }


            }
            if (cont > contMaior) {
                contMaior = cont;
                palavraMaior=palavra;
            }
            cont =0;
        }
        System.out.print("A palavra com mais vogais: ");
        System.out.println(palavraMaior);
        System.out.print("Numeros de vogais: ");
        System.out.println(contMaior);

    }
}