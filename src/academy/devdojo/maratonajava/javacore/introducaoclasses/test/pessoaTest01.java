package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class pessoaTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Raimundos Marques";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.printf("O nome do estudante é: %s \n", estudante.nome);
        System.out.printf("A idade do estudante é: %d \n", estudante.idade);
        System.out.printf("O sexo do estudante é: %c \n", estudante.sexo);
    }
}
