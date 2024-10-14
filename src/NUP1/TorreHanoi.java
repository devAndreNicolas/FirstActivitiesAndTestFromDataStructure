package NUP1;

public class TorreHanoi {

    public static void resolverTorreDeHanoi(int n, char inicio, char alvo, char suporte) {

        if (n == 1) {
            System.out.println("Mova o disco 1 de " + inicio + " para " + alvo);
            return;
        }

        resolverTorreDeHanoi(n - 1, inicio, suporte, alvo);
        System.out.println("Mova o disco " + n + " de " + inicio + " para " + alvo);
        resolverTorreDeHanoi(n - 1, suporte, alvo, inicio);
    }

    public static void main(String[] args) {
        int numeroDeDiscos = 3;
        resolverTorreDeHanoi(numeroDeDiscos, 'A', 'C', 'B');
    }
}