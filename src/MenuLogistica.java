import java.util.Scanner;

public class MenuLogistica {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("===MENU LOGISTICA===");
            System.out.println("1 - Converter temperatura: ");
            System.out.println("2 - Converter distancia: ");
            System.out.println("3 - Classificar pedido: ");
            System.out.println("4 - Sobre");
            System.out.println("0 - Sair... ");
            System.out.println();

            System.out.print("Escolha uma opcao: ");
            opcao = in.nextInt();
            System.out.println();


            switch (opcao) {
                case 1:
                    System.out.println("Converter temperatura ");
                    System.out.println("Digite a temperatura em celsiu:  ");
                    double celsius = in.nextDouble();
                    double fahrenheint = (celsius * 9.0/5.0)+32.0;
                    System.out.println("A temperatura em FAHRENHEINT é  " + fahrenheint + "°F");
                    break;

                case 2:
                    System.out.println("Converter distancia: quilometros para milhas ");
                    System.out.println("Digite a distancia em quilometros: ");
                    double quilometros = in.nextDouble();
                    double milhas = 0.621371;
                    double conversorMilhas = quilometros * milhas;
                    System.out.println("A distancia em milhas é " + conversorMilhas + ",milhas");
                    break;

                case 3:
                    System.out.println("Classificar pedido");
                    int peso;
                    int qtdLimite = 0;
                    int qtdPadrao = 0;
                    int qtdLeve = 0;

                    int pesoLimite = 100;
                    int pesoPadrao = 70;
                    int pesoLeve = 50;
                    System.out.println("Digite o peso desejado (ou -1 para sair): ");
                    peso = in.nextInt();

                    while (peso != -1) {

                        while (peso < 0 && peso != -1) {

                            System.out.println("Peso inválido, digite um peso valido e POSITIVO");
                            peso = in.nextInt();
                        }
                        if (peso == -1) {
                            break;
                        }

                        if (peso > pesoLimite) {
                            System.out.println("Urgente para peso acima do limite");
                            qtdLimite++;
                        } else if (peso >= pesoPadrao) {
                            System.out.println("padrão para peso intermediário");
                            qtdPadrao++;
                        } else {
                            System.out.println("leve  peso abaixo de um limite");
                            qtdLeve++;
                        }

                        System.out.println("Digite o próximo peso (ou -1 para sair): ");
                        peso = in.nextInt();

                    }
                    System.out.println("A quantidade de pesos ACIMA do peso foi de : " + qtdLimite);
                    System.out.println("A quantidade de pesos PADRAO foi  de : " + qtdPadrao);
                    System.out.println("A quantidade de pesos LEVES  foi de : " +qtdLeve );
                    break;

                case 4:
                    System.out.println("Sobre o sistema.");
                    String versaoJava = System.getProperty("java.version");
                    System.out.println("Versao do Java em uso: " + versaoJava);
                    System.out.println("Esse programa roda  normalmente em qualquer sistema operacional" +
                            "porque foi compilado (.class) e virou um bytecode e esse bytecode vai ser lido em qualquer maquina que tiver uma JVM que é a " +
                            "responsavel por ler ele.");
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente");
                    break;

            }

        } while (opcao != 0);
        in.close();
    }
}
