package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Hilux";
        carro1.modelo = "SM-P619";
        carro1.ano = 2014;

        System.out.println("1º Carro:");
        System.out.println(carro1.nome +" do modelo: "+ carro1.modelo +", ano de: "+ carro1.ano);
        System.out.println("-------------------------------------------------------");

        carro2.nome = "Corolla";
        carro2.modelo = "PS-J891";
        carro2.ano = 2017;

        System.out.println("2º Carro:");
        System.out.println(carro2.nome +" do modelo: "+ carro2.modelo +", ano de: "+ carro2.ano);
    }
}
