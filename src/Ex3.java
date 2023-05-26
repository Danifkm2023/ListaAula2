import java.io.InputStream;
import java.util.Scanner;

public class Ex3 {
    static int quantidadeDeSim = 0;
    static int quantidadeDeNao = 0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Responda as seguintes perguntas sobre o crime com (S/N):");

        String resposta1 = geraMenu("Telefonou para a vítima?", entrada);

        String resposta2 = geraMenu("Esteve no local do crime?", entrada);

        String resposta3 = geraMenu("Mora perto da vítima?", entrada);

        String resposta4 = geraMenu("Devia para a vítima?", entrada);

        String resposta5 = geraMenu("Já trabalhou com a vítima?", entrada);


        verificarResposta(resposta1);
        verificarResposta(resposta2);
        verificarResposta(resposta3);
        verificarResposta(resposta4);
        verificarResposta(resposta5);

        System.out.println("Essa é a quantidade de não:" + quantidadeDeNao);
        System.out.println("Essa é a quantidade de sim: " + quantidadeDeSim);

        if (quantidadeDeSim == 2) {
            System.out.println("Ele(a) é Suspeito(a)");
        } else if (quantidadeDeSim >= 3 && quantidadeDeNao <= 4) {
            System.out.println("Ele(a) é Cúmplice");
        } else if (quantidadeDeSim == 5) {
            System.out.println("Ele(a) é o(a) Assasino(a)");
            {
                if (quantidadeDeNao >= 5) {
                    System.out.println("Ele é inocente");
                }

            }
        }


    }


    private static String geraMenu(String mensagem, Scanner entrada) {
        System.out.println(mensagem);
        return entrada.nextLine();

    }

    public static void verificarResposta(String resposta) {
        if (resposta.equalsIgnoreCase("s")) {
            quantidadeDeSim++;

        } else if(resposta.equalsIgnoreCase("n")){
            quantidadeDeNao++;
        }
    }

}