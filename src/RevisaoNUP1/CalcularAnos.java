package RevisaoNUP1;
//DECIMA QUESTAO

public class CalcularAnos {

    double taxaA = 0.03, taxaB = 0.015;

    public double calcularAnos(double populacaoA, double populacaoB) {
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA = populacaoA + (populacaoA * taxaA);
            populacaoB = populacaoB + (populacaoB * taxaB);
            anos = anos + 1;
        }
        return anos;
    }

    public static void main(String[] args){
        CalcularAnos calc = new CalcularAnos();
        System.out.println("Com base na taxa de crescimento de ambas populações, a população A demoraria " + calc.calcularAnos(80000, 200000) + " anos " + "para alcançar a população B.");
    }

}
