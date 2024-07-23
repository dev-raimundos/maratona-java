package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimenssionais02 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int array[] = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase: arrayInt) {
            for (int num: arrayBase) {
                System.out.println(num);

            }
        }
    }
}
