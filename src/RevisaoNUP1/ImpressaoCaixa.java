package RevisaoNUP1;

//Professor Marcos, eu tenho muita dificuldade em estruturas de repetição e passei um tempo pesado tentando resolver essa questão, então eu fiz comentários para revisar depois quando eu tiver dúvida.
//Se o senhor não permite comentários, peço que deixe esses passarem despercebidos e me avise, para que eu nn envie mais com comentários.

public class ImpressaoCaixa {

//SETIMA QUESTAO

    public static void main(String[] args) {

        int valor = 160;
        //Essa variavel vai impedir o "erro" de que no final, a variavel "valor" esteja zerada devido as repetições e não mostre o valor de saque, que aqui está 160.
        int resto = valor;
        int notas[] = {100,50, 20, 10, 5, 2};
        int quantidadeNotas[] = new int[notas.length];

        if (valor<50 && valor>600){
            System.out.println("Valor inválido. O valor deve estar entre R$ 50,00 e R$ 600,00.");
            return;
        }

        for (int i = 0; i < notas.length; i++) {
            //Verifica se o valor é maior (ou igual) que 100, 50, 20, 10, 5 ou 2
            if (resto >= notas[i]) {
            //Verifica quantas notas tem (de 1 a 6 que é o limite da quantidadeNotas) de por exemplo 100 em 160. Resultado: 1 nota.
                quantidadeNotas[i] = resto/notas[i];
            //Mas o cálculo dará uma sobra, e aqui essa sobra será o valor na próxima repetição. Por exemplo, o resto de 160/100 é 60, então 60 será armazenado em valor na próxima repetição, e assim por diante até o limite estabelecido no for.
                resto = resto % notas[i];
            }
        }

        for (int i = 0; i < notas.length; i++) {
            //Condição para o "print". Se houver mais que uma 1 nota verificada no laço anterior, ele seguirá os comandos.
            if (quantidadeNotas[i] > 0){
                //Aqui é justamente o print. Ele vai mostrar a quantidade de notas de 100, 50, 20, 10, 5 e 2 presentes no saque.
                System.out.println( "Saque de " + valor + "---> " + quantidadeNotas[i] + " nota(s) de R$ " + notas[i]);
            }

        }
    }
}
