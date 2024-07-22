package academy.devdojo.maratonajava.introducao;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class Aula08ArraysMultidimenssionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        // For tradicional:
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("For - " + dias[i][j]);
            }
        }
        System.out.println("--------------------------------------");

        // Foreach:
        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println("Foreach - " + num);
            }
        }
    }
}
