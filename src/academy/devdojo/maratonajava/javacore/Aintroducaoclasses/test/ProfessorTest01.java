package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor Professor = new Professor();
        Professor.nome = "Alexandre Dias";
        Professor.idade = 29;
        Professor.sexo = 'M';

        System.out.println("Nome: "+Professor.nome + "\nIdade: " + Professor.idade + "\nSexo: " + Professor.sexo);
    }
}
