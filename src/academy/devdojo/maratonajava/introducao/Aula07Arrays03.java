package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] numbers = new int[4];

            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Informe o %dº número a ser armazenado: ", i + 1);
                numbers[i] = scan.nextInt();
            }

            System.out.println("Números informados:");
            for (int i : numbers) {
                System.out.println(i);
            }
        }
    }
}
