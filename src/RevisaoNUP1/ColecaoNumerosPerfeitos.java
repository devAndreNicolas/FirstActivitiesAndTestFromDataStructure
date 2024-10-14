package RevisaoNUP1;

//NONA QUESTAO

public class ColecaoNumerosPerfeitos {

    public static boolean numeroPerfeito(int numero){
    //numeros maiores ou iguais a 1 não são perfeitos.
        if (numero <= 1){
            return false;
        }
    //a variavel soma inicializa com 1 ja que o numero 1 é sempre divisor.
        int soma = 1;
    //Começa a partir do 2. Nenhum número maior que "numero"/2 pode ser um divisor de "numero". Por exemplo, os divisores de 6 são 1,2,3. Não é necessário buscar acima da metade de 6 outros numeros que sejam divisores (4 e 5).
        for (int i = 2; i <= numero / 2; i++){
            //Aqui ocorrre justamente a verificação de i ser divisor de numero. Se for, é adicionado a soma.
            if (numero % i == 0){
                soma += i;
            }
        }
        //Retorna verdadeiro se a soma for igual ao numero. Exemplo, no laço foram encontrados os numeros 1,2 e 3 como divisores de 6. A soma desses numeros é igual a variavel "numero", então retorna true.
        return soma == numero;
    }

    public static void imprimirNumerosPefeitos(int[] numeros){

        System.out.println("Números perfeitos no vetor: ");
    //int é o tipo, numero é a variavel que representa os elementos percorridos na iteração, numeros é o array de inteiros que está sendo percorrido.
        for (int numero : numeros){
    //se der true na função numeroPerfeito tendo o parametro preenchido pelo numero presente no vetor numeros, ele vai printar o numero.
            if (numeroPerfeito(numero)){

                System.out.println(numero);
            }
        }
    }

    public static void main(String[] args){

        int numeros[] = {1,2,3,4,5,6,7,8,9,10};

        imprimirNumerosPefeitos(numeros);
    }
}
