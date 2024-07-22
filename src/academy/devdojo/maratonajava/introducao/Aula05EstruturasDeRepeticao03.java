package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Programa que pede um número ao usuário e imprime as próximas 25 posições.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        for (int i = 0; i < 25; i++) {
            System.out.println(valorInicial + i);
        }

        scanner.close();
    }
}
