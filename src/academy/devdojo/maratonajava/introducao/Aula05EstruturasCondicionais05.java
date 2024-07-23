package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            byte day;

            System.out.println("Digite o dia respectivo ao dia da semana: ");
            day = scan.nextByte();

            switch (day) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda-feira");
                case 3 -> System.out.println("Terça-feira");
                case 4 -> System.out.println("Quarta-feira");
                case 5 -> System.out.println("Quinta-feira");
                case 6 -> System.out.println("Sexta-feira");
                case 7 -> System.out.println("Sábado-feira");
                default -> System.out.println("Número inválido, somente de 1 até 7");
            }
        }
    }
}
