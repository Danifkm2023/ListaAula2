import java.io.InputStream;
import java.util.Scanner;

public class Ex3 {

    public static class Exercicio3 {
        private static String InputStream;

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Responda as seguintes perguntas sobre o crime com (S/N):");
            System.out.println("Telefonou para a vítima?");
            String resposta1 = entrada.nextLine();
            System.out.println("Esteve no local do crime?");
            String resposta2 = entrada.nextLine();
            System.out.println("Mora perto da vítima?");
            String resposta3 = entrada.nextLine();
            System.out.println("Devia para a vítima?");
            String resposta4 = entrada.nextLine();
            System.out.println("Já trabalhou com a vítima?");
            String resposta5 = entrada.nextLine();

            int quantidadeDeSim = 0;
            int quantidadeDeNao = 0;

            if(resposta1.equalsIgnoreCase(InputStream));{
                quantidadeDeSim++;
            }
            if(resposta2.equalsIgnoreCase(InputStream));{
                quantidadeDeSim++;
            }
            if(resposta3.equalsIgnoreCase(InputStream));{
                quantidadeDeSim++;
            }
            if(resposta4.equalsIgnoreCase(InputStream));{
                quantidadeDeSim++;
            }
            if(resposta5.equalsIgnoreCase(InputStream));{
                quantidadeDeSim++;
            }
            if (resposta1.equalsIgnoreCase(InputStream));{
                quantidadeDeNao++;
            }
            if (resposta2.equalsIgnoreCase(InputStream));{
                quantidadeDeNao++;
            }
            if (resposta3.equalsIgnoreCase(InputStream));{
                quantidadeDeNao++;
            }
            if (resposta4.equalsIgnoreCase(InputStream));{
                quantidadeDeNao++;
            }
            if (resposta5.equalsIgnoreCase(InputStream));{
                quantidadeDeNao++;
            }
            System.out.println("Essa é a quantidade de não:" +quantidadeDeNao);
            System.out.println("Essa é a quantidade de sim: " + quantidadeDeSim);

            if(quantidadeDeSim == 2 ){
                System.out.println("Ele(a) é Suspeito(a)");
            } else if (quantidadeDeSim >= 3 && quantidadeDeNao <= 4) {
                System.out.println("Ele(a) é Cúmplice");
            } else if (quantidadeDeSim == 5) {
                System.out.println("Ele(a) é o(a) Assasino(a)");{
            if (quantidadeDeNao >= 5){
                System.out.println("Ele é inocente");
            }

                }
            }



                }
            }
        }


