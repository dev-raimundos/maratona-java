package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double valorTotal;

            System.out.println("Informe o valor do carro");
            valorTotal = scan.nextDouble();

            // Calcula o número máximo de parcelas
            int maxParcelas = (int) (valorTotal / 1000);

            // Loop apenas até o número máximo de parcelas
            for(int parcela = 1; parcela <= maxParcelas; parcela++) {
                double valorParcela = valorTotal / parcela;
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
        }
    }
}
