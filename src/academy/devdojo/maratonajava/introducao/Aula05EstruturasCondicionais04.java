package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double salarioAnual;
            double primeiraFaixa = 9.70 / 100;
            double segundaFaixa = 37.35 / 100;
            double terceiraFaixa = 49.50 / 100;
            double valorDoImposto;

            System.out.println("Informe o seu salário anual sem vírgulas: ");
            salarioAnual = scan.nextDouble();

            if (salarioAnual <= 34712) {
                valorDoImposto = salarioAnual * primeiraFaixa;
            } else if (salarioAnual <= 68507) {
                valorDoImposto = salarioAnual * segundaFaixa;
            } else {
                valorDoImposto = salarioAnual * terceiraFaixa;
            }
            System.out.println("Você deve pagar em impostos o total de: " + valorDoImposto);
        }
    }
}
