import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        /*
        * Variaveis
        * Classificação (0 - 5)
        *
        * Constantes
        * As perguntas
        *
        * Ações
        *
        * Fazer as perguntas
        * Classificar (a quantidade de resposta sim e não)
        * Imprimir resultado (supeito, cumplice, ...)
        *
        *
        * Classificação:
        * 0 - Inocente
        * 1 - Inocente
        * 2 - Suspeito
        * 3 - Cumplice
        * 4 - Cumplice
        * 5 - Culpado
        * */

        Scanner entrada = new Scanner(System.in);

        int classificacao = 0;

        System.out.println("Vamos resolver esse caso! ");
        System.out.println("-----------------------------------------------");

        System.out.println("Digite 1 para SIM, e 2 para NAO");

        System.out.println("Telefonou para a vítima?");
        int resposta1 = entrada.nextInt();
        if (resposta1 == 1) {
            classificacao = classificacao + 1;
        }
        System.out.println("Esteve no local do crime?");
        int resposta2 = entrada.nextInt();
        if (resposta2 == 1) {
            classificacao = classificacao + 1;
        }
        System.out.println("Mora perto da vítima?");
        int resposta3 = entrada.nextInt();
        if (resposta3 == 1) {
            classificacao = classificacao + 1;
        }
        System.out.println("Devia para a vítima?");
        int resposta4 = entrada.nextInt();
        if (resposta4 == 1) {
            classificacao = classificacao + 1;
        }
        System.out.println("Já trabalhou com a vítima?");
        int resposta5 = entrada.nextInt();
        if (resposta5 == 1) {
            classificacao = classificacao + 1;
        }


        switch (classificacao){

            case 0:
                System.out.println("Entrevistado é inocente.");
                break;

            case  1:
                System.out.println("Entrevistado é inocente.");
                break;

            case 2:
                System.out.println("Entrevistado é suspeito.");
                break;

            case 3:
                System.out.println("Entrevistado é cumplice.");
                break;

            case 4:
                System.out.println("Entrevistado é cumplice.");
                break;

            case 5:
                System.out.println("Entrevistado é assassino.");
                break;

            default:
                System.out.println("não classificado");

        }

    }
}
