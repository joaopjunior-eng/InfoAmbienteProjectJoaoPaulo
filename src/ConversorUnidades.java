public class ConversorUnidades {

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheint = (celsius * 9.0/5.0)+32.0;

        System.out.println(celsius + " °C equivalem a " + fahrenheint + " °F");

        double quilometros = 100.0;
        double milhas = 0.621371;
        double conversorMilhas = quilometros * milhas;

        System.out.println(quilometros + " km equivalem a " + conversorMilhas + " milhas");


        int temperaturaReferencia = 80;

        if (fahrenheint > temperaturaReferencia) {
            System.out.println("O resultado calculado é maior que a temperaturaReferencia.");
        }   else if (fahrenheint < temperaturaReferencia) {
            System.out.println("O resultado calculado é menor que a  temperaturaReferencia.");
        } else {
            System.out.println("O resultado calculado é igual a temperaturaReferencia.");
        }

    }
}
