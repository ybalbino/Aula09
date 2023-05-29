import java.util.Scanner;

public class Atividade2 {

    /*
    * Variaveis:
    * Alcool
    * Gasolina
    * Desconto
    *
    * Condições
    * Desconto Alcool ate 20L = 3%
    * Desconto Alcool acima 20L = 5%
    * Desconto Gasolina ate 20L = 4%
    * Desconoto Gasolina acima 20L = 5%
    *
    * Constantes
    * Preço Alcool L 1,90
    * Preço Gasolina L 2,50
    *
    * Açoes
    * Mostrar legenda para usuario
    * Pedir usuario a quantidade de Litros
    * calcular e imprimir o valor a ser pago
    * preço em Litros
    * Valor total
    *
    * */

   public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

       /*Constantes*/
       final double precoLitroGasolina = 2.50;
       final double precoLitroAlcool = 1.90;
       final int faixaDesconto = 20;


       /*Variaveis*/
       String tipoAbastecimento;
       double abastecimento;
       double total;
       double totalDesconto;

       /*Açoes*/

       System.out.println("Digite o tipo de abastecimento: ");
       System.out.println("Digite A-álcool, G-gasolina (somente letra da inicial maiuscula): ");

       tipoAbastecimento = entrada.next();

       if (tipoAbastecimento.equals("A")) {
           // Calculando Alcool
           System.out.println("Digite a quantidade de alcool em Litros: ");
           abastecimento = entrada.nextDouble();

           if (abastecimento <= faixaDesconto) {
               // Desconto de 3%
               total = abastecimento * precoLitroAlcool;
               totalDesconto = total /100 * 3;
               System.out.printf("Total: R$ %.2f \n", total);

               System.out.println("Faixa de Desconto 3%");
               System.out.printf("Desconto: R$ %.2f\n", totalDesconto);

               System.out.printf("Total a pagar: R$ %.2f \n", total - totalDesconto);

           } else {
               // Desconto de 5%
               total = abastecimento * precoLitroAlcool;
               totalDesconto = total /100 * 5;
               System.out.printf("Total: R$ %.2f \n", total);

               System.out.println("Faixa de Desconto 5%");
               System.out.printf("Desconto: R$ %.2f \n", totalDesconto);

               System.out.printf("Total a pagar: R$ %.2f \n", total - totalDesconto);
           }
       } else if (tipoAbastecimento.equals("G") ) {
           // Calculando Gasolina
           System.out.println("Digite a quantidade de gasolina Litros: ");
           abastecimento = entrada.nextDouble();

           if (abastecimento <= faixaDesconto) {
                // Desconto de 4%
               total = abastecimento * precoLitroGasolina;
               totalDesconto = total /100 * 4;
               System.out.printf("Total: R$ %.2f \n", total);
               System.out.println("Faixa de Desconto 4%");

               System.out.printf("Desconto: R$ %.2f \n", totalDesconto);

               System.out.printf("Total a pagar: R$ %.2f \n", total - totalDesconto);
           } else {
               // Desconto de 6%
               total = abastecimento * precoLitroGasolina;
               totalDesconto = total /100 * 6;
               System.out.printf("Total: R$ %.2f \n", total);
               System.out.println("Faixa de Desconto 6%");

               System.out.printf("Desconto: R$ %.2f \n", totalDesconto);

               System.out.printf("Total a pagar: R$ %.2f \n", total - totalDesconto);

           }
       } else {
           // tipo de abastecimento errado
           System.out.println("Tipo de Abastecimento Invalido, começe novamente.");
       }


   }
}
