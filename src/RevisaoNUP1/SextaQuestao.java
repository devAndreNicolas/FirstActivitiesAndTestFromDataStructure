package RevisaoNUP1;

public class SextaQuestao {

    public static class Litros{

        int quantidade;
        String tipoDeCombustivel;
        double valor;

        public double alcool(){
            double descontoPorLitro, desconto;
            if (tipoDeCombustivel.equals("Alcool")){

                if (quantidade <= 20){
                    descontoPorLitro = 0.03 * quantidade;
                    desconto = descontoPorLitro * quantidade;
                    valor = valor - desconto;
                    return valor;
                } else {
                    descontoPorLitro = 0.05 * quantidade;
                    desconto = descontoPorLitro * quantidade;
                    valor = valor - desconto;
                    return valor;
                }

            }
            return 0;
        }

        public double gasolina(){
            double descontoPorLitro, desconto;
            if (tipoDeCombustivel.equals("Gasolina")){

                if (quantidade <= 20){
                    descontoPorLitro = 0.04 * quantidade;
                    desconto = descontoPorLitro * quantidade;
                    valor = valor - desconto;
                    return valor;
                } else {
                    descontoPorLitro = 0.06 * quantidade;
                    desconto = descontoPorLitro * quantidade;
                    valor = valor - desconto;
                    return valor;
                }

            }
            return 0;
        }

        public void exibirInformacoes(){
            System.out.println("Quantidade: " + quantidade + "L");
            System.out.println("Capital: " + valor + "R$");
            System.out.println("Tipo de Combustivel: " + tipoDeCombustivel);
            System.out.println("Valor total a pagar com desconto (Alcool): " + alcool() + "R$");
            System.out.println("Valor total a pagar com desconto (Gasolina): " + gasolina() + "R$");
        }

    }

    public static void main(String[] args) {
        Litros litros = new Litros();
        litros.valor = 200;
        litros.quantidade = 50;
        litros.tipoDeCombustivel = "Alcool";
        litros.exibirInformacoes();
    }


}
