public class Aluno {

    private String alunos;
    private double nota1, nota2;
    public static int nAprovados;

    public Aluno() {

        alunos = "sem nome";

    }

    public Aluno(String alunos, double nota1, double nota2) {

        this.alunos = alunos;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public double calcularMedia() {

        return (nota1 + nota2) / 2;

    }

    public String getAlunos() {
        return alunos;
    }

    public String situacao() {

        String situacao;

        if (calcularMedia() > 60) {
            situacao = "Aprovado";

        } else {
            situacao = "Reprovado";
        }

        return situacao;
    }

    public void aprovados() {

        if (situacao().equals("Aprovado"))
            nAprovados++;



    }
}