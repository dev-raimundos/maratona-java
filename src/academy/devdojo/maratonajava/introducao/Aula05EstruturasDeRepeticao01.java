package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        int countWhile = 1;
        int countDoWhile = 1;

        // While
        while (countWhile <= 5) {
            System.out.println("While - "+ countWhile);
            countWhile++;
        }

        // Do While
        do {
            System.out.println("Do While -" + countDoWhile);
            countDoWhile++;
        } while (countDoWhile <= 5);

        // For
        for (int i=0; i<=5; i++) {
            System.out.println("For - "+ i);
        }
    }
}
