package RevisaoNUP1;

public class QuartaQuestao {

    public static class simularCalculoFolhaPagamento{
        double salarioBruto;

        public double calcularInss(){
            return salarioBruto * 0.10;
        }

        public double calcularIr(){
         return salarioBruto * 0.05;
        }

        public double calcularFgts(){
            return salarioBruto * 0.11;
        }

        public double calcularSalarioLiquido(){
            double totalDescontos = calcularIr() + calcularInss() + calcularFgts();
            return salarioBruto - totalDescontos;
        }

        public void exibirInformacoes(){
            System.out.println("Salario Bruto: " + salarioBruto);
            System.out.printf("IR: " + "%.2f%n", calcularIr());
            System.out.printf("Inss: " + "%.2f%n", calcularInss());
            System.out.printf("Fgts: " + "%.2f%n", calcularFgts());
            System.out.printf("Salario Liquido: " + "%.2f%n", calcularSalarioLiquido());
        }
    }

    public static void main(String[] args) {
        simularCalculoFolhaPagamento calculoFolhaPagamento = new simularCalculoFolhaPagamento();
        calculoFolhaPagamento.salarioBruto = 5000;
        calculoFolhaPagamento.exibirInformacoes();
    }
}