import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        /*
        * Variaveis
        * IR
        * INSS
        * FGTS
        * salario liquido
        * salario bruto
        * valor hora
        * horas trabalhadas
        *
        * constantes
        * Faixa 1 = ate 900
        * Faixa 2 = ate 1500
        * Faixa 3 = ate 2500
        * Faixa 4 = acima 2500
        *
        * Açoes
        * Pedir p/ usuario valor da hora?
        * pedir p/ usuario horas trabalhadas?
        * Imprimir extrato        *
        * */

        final double faixa1 = 900;
        final double faixa2 = 1500;
        final double faixa3 = 2500;

        Scanner entrada = new Scanner(System.in);

        double ir;
        double inss;
        double fgts;
        double salarioLiquido;
        double salariobruto;
        double valorHora;
        double horasTrabalhadas;
        double totalDescontos;
        String porcentagemIr;

        System.out.println("Digite o valor em reais da hora trabalhada: ");
        valorHora = entrada.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();

        salariobruto = horasTrabalhadas * valorHora;
        inss = salariobruto / 100 * 10;
        fgts = salariobruto / 100 * 11;
        ir = 0;
        porcentagemIr = "Isento";

        if (salariobruto <= faixa1) {
            ir = 0;
            porcentagemIr = "Isento";
        } else if (salariobruto <= faixa2) {
            ir = salariobruto / 100 * 5;
            porcentagemIr = "5%";
        } else if (salariobruto <= faixa3) {
            ir = salariobruto / 100 * 10;
            porcentagemIr = "10%";
        } else if (salariobruto > faixa3) {
            ir = salariobruto / 100 * 20;
            porcentagemIr = "20%";
        }

        totalDescontos = inss + ir + fgts;
        salarioLiquido = salariobruto - totalDescontos;

        System.out.printf("Salario Bruto: (%.2f * %.2f)  : R$ %.2f \t \n", valorHora , horasTrabalhadas,salariobruto);
        System.out.printf("(-) IR (%s) : R$ %.2f \t \n", porcentagemIr, ir);
        System.out.printf("(-) INSS (10%%) : R$ %.2f \t \n", inss);
        System.out.printf("(-) FGTS (11%%) : R$ %.2f \t \n", fgts);
        System.out.printf("Total de Descontos: R$ %.2f \t \n", totalDescontos);
        System.out.printf("Salario Liquido: R$ %.2f \t \n", salarioLiquido);

    }
}
