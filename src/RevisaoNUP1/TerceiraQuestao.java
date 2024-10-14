package RevisaoNUP1;

public class TerceiraQuestao {
    public static class Aluno {
        double notaUm, notaDois;
        public double calcularMedia (){
            return (notaUm+notaDois)/2;
        }
        public String situacoes(){
            double media = calcularMedia();
            if (media >= 7){
                return "Aprovado";
            }
            else if (media >= 5 && media < 7){
                return "Recuperação";
            }
            else {
                return "Reprovado";
            }
        }
        public void exibirInformacoes(){
            System.out.println("Nota 1: " + notaUm);
            System.out.println("Nota 2: " + notaDois);
            System.out.println("Media: " + calcularMedia());
            System.out.println("Situação: " + situacoes());
        }
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.notaUm = 6.0;
        aluno.notaDois = 7.0;
        aluno.exibirInformacoes();
    }
}