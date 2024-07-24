package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double valorTotal;

            System.out.println("Informe o valor do carro:");
            valorTotal = scan.nextDouble();

            for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
                double valorParcela = valorTotal / parcela;
                if (valorParcela < 1000) {
                    continue;
                }
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
        }
    }
}
