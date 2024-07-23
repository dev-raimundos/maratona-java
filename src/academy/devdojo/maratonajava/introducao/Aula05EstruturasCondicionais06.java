package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            byte dia;

            System.out.println("Informe o número referente ao dia da semana");
            dia = scan.nextByte();

            switch(dia) {
                case 1, 7 -> System.out.println("Final de semana");
                case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
                default -> System.out.println("Opção inválida, apenas números entre 1 e 7");
            }
        }
    }
}
