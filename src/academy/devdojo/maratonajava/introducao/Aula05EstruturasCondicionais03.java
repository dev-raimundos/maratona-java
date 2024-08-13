package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
// Exemplo de uso do operador ternário
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double salary;
            String mensagemDoar = "Eu vou doar 500";
            String mensagemNaoDoar = "Eu não vou doar";
            //(condição) ? verdadeiro : falso
            String resultado;

            System.out.println("Informe o seu salário em reais e sem vírgula: ");
            salary = scan.nextDouble();

            resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar; // Operador ternário.

            System.out.println(resultado);  
        }
    }
}
