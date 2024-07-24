package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] idade = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("informe os valores a serem armazenados no array");
                idade[i] = scan.nextInt();
            }
            System.out.println("Os valores informados foram: ");

            for (int i = 0; i < 3; i++) {
                System.out.println(idade[i]);
            }
        }
    }
}
