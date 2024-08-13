package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Para começermos, informe o seu nome");
        String name = scan.nextLine();

        System.out.println("Agora informe a sua idade");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("Você ainda é um menor de idade");
        }
        else if (age >= 18 && age <= 50) {
            System.out.println("Você já está adulto");
        }
        else if (age > 50) {
            System.out.println("Você já está idoso");
        }
        else {
            System.out.println("ERROR");
        }
        System.out.println(name +", você tem "+ age +" anos.");
    }
}
