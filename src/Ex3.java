import java.io.InputStream;
import java.util.Scanner;

public class Ex3 {

    public static class Exercicio3 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);


            System.out.println("Responda as seguintes perguntas sobre o crime com (S/N):");

            String resposta1 = geraMenu("Telefonou para a vítima?",entrada);

            String resposta2 = geraMenu("Esteve no local do crime?",entrada);

            String resposta3 = geraMenu("Mora perto da vítima?",entrada);

            String resposta4 = geraMenu("Devia para a vítima?",entrada);

            String resposta5 = geraMenu("Já trabalhou com a vítima?",entrada);

            int quantidadeDeSim = 0;
            int quantidadeDeNao = 0;

            if(resposta1.equalsIgnoreCase("s")){
                quantidadeDeSim++;
            }
            if(resposta2.equalsIgnoreCase("s")){
                quantidadeDeSim++;
            }
            if(resposta3.equalsIgnoreCase("s"))
            {
                quantidadeDeSim++;
            }
            if(resposta4.equalsIgnoreCase("s")){
                quantidadeDeSim++;
            }
            if(resposta5.equalsIgnoreCase("s")){
                quantidadeDeSim++;
            }
            if (resposta1.equalsIgnoreCase("n")){
                quantidadeDeNao++;
            }
            if (resposta2.equalsIgnoreCase("n")){
                quantidadeDeNao++;
            }
            if (resposta3.equalsIgnoreCase("n")){
                quantidadeDeNao++;
            }
            if (resposta4.equalsIgnoreCase("n")){
                quantidadeDeNao++;
            }
            if (resposta5.equalsIgnoreCase("n")){
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


    private static String geraMenu(String mensagem, Scanner entrada){
        System.out.println(mensagem);
        return entrada.nextLine();
    }
}


