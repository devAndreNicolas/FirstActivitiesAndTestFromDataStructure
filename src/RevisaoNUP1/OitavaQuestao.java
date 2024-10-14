package RevisaoNUP1;

public class OitavaQuestao {
    public static void main(String[] args) {
        double notas[] = {8.2, 8.9, 5.0, 4.7, 6.5, 7.0, 9.0, 3.2};
        double somaNotas = 0;
        double menorNota = notas[0];
        double maiorNota = notas[0];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {

            somaNotas = somaNotas + notas[i];
            media = somaNotas / notas.length;

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        System.out.printf("Média de notas da turma: %.2f\n", media);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
        }
    }
