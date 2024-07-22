package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] nomes = new String[3];

            for (int i = 0; i < nomes.length; i++) {
                System.out.printf("Informe o %dº nome: ", i + 1);
                nomes[i] = scan.nextLine().trim();

                while (nomes[i].isEmpty()) {
                    System.out.printf("Nome inválido. Informe o %dº nome novamente: ", i + 1);
                    nomes[i] = scan.nextLine().trim();
                }
            }

            System.out.println("Os nomes informados foram: ");

            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    }
}
