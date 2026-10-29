import java.util.Scanner;
public class ClassificadorPedido {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int peso;
        int qtdLimite = 0;
        int qtdPadrao = 0;
        int pqtdLeve = 0;

        int pesoLimite = 100;
        int pesoPadrao = 70;
        int pesoLeve = 50;
        System.out.println("Digite o peso desejado(ou -1 para sair): ");
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
                pqtdLeve++;
            }

            System.out.println("Digite o próximo peso (ou -1 para sair): ");
            peso = in.nextInt();

        }
        System.out.println("A quantidade de pesos ACIMA do peso foi de : " + qtdLimite);
        System.out.println("A quantidade de pesos PADRAO foi  de : " + qtdPadrao);
        System.out.println("A quantidade de pesos LEVES  foi de : " +pqtdLeve );
        in.close();
    }
}
