package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte day;

        System.out.println("Digite o dia respectivo ao dia da semana: ");
        day = scan.nextByte();

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado-feira");
                break;
            default:
                System.out.println("Número inválido, somente de 1 até 7");
        }
    }
}
