package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte dia = 0;

        System.out.println("Informe o número referente ao dia da semana");
        dia = scan.nextByte();

        switch(dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida, apenas números entre 1 e 7");
        }
    }
}
