import javax.tools.JavaFileObject;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

    /*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto
(conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a 11% do
Salário Bruto, mas não é descontado (é a empresa que deposita).

O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
trabalhadas no mês.
Desconto do IR:
    Salário Bruto até 900 (inclusive) - isento
    Salário Bruto até 1500 (inclusive) - desconto de 5%
    Salário Bruto até 2500 (inclusive) - desconto de 10%
    Salário Bruto acima de 2500 - desconto de 20%
    Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

     */

    static class Exercicio1 {
        public static void main(String[] args){


            Scanner entrada = new Scanner(System.in);
            DecimalFormat formatador = new DecimalFormat("#,##0.00");
            DecimalFormat formatadorPorcent = new DecimalFormat("0");


            System.out.println("[----- Folha de pagamento -----]");
            System.out.println("Digite quanto você ganha por hora trabalhada: ");
            double ganhoHora = entrada.nextDouble();
            System.out.println("Digite quantas horas você trabalhou este mês: ");
            double horasTrabalhada = entrada.nextDouble();

            double salarioBruto = ganhoHora * horasTrabalhada;
            System.out.println("Salário Bruto: (" + formatadorPorcent.format(ganhoHora) + " * "
                    + formatadorPorcent.format(horasTrabalhada) + ")" + "            :" + " R$ "
                    + formatador.format(salarioBruto));

            double salarioMenosIR = 0;

            if (salarioBruto >= 900 && salarioBruto < 1500){
                salarioMenosIR = (salarioBruto * 5) / 100;
                double porcentagemIR = 5;
                System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                        + "                        :"
                        + " R$ " + formatador.format(salarioMenosIR));
            } else if (salarioBruto >= 1500 && salarioBruto < 2500) {
                salarioMenosIR = (salarioBruto * 10) / 100;
                double porcentagemIR = 10;
                System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                        + "                        :"
                        + " R$ " + formatador.format(salarioMenosIR));
            } else if (salarioBruto >= 2500) {
                salarioMenosIR = (salarioBruto * 20) / 100;
                double porcentagemIR = 20;
                System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                        + "                        :"
                        + " R$ " + formatador.format(salarioMenosIR));
            } else {
                System.out.println("Sem desconto de IR" + formatador.format(salarioMenosIR));
            }


            double salarioMenosInss = (salarioBruto * 10) / 100;
            System.out.println("(-)  INSS (10%)" + "                     :"
                    + " R$ " + formatador.format(salarioMenosInss));

            double salarioMenosFgts = (salarioBruto * 11) / 100;
            System.out.println("FGTS (11%)" + "                          :"
                    + " R$ " + formatador.format(salarioMenosFgts));

            double totalDeDescontos = salarioMenosInss + salarioMenosIR;
            System.out.println("Total de descontos" + "                  :"                 + " R$ "
                    + formatador.format(totalDeDescontos));

            double salarioLiquido = salarioBruto - salarioMenosInss - salarioMenosIR;
            System.out.println("Salário Liquido" + "                     :"                 + " R$ "
                    + formatador.format(salarioLiquido));
        }

    }










     }





