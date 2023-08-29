package br.edu.fescfafic.poo.Main;
import br.edu.fescfafic.poo.Model.Casa;


public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua Augusto dos anjos", 15, 5,4,2,2,1,3,1 );

        System.out.println("Quantidade de banheiros: " + casa.banheiros);
        System.out.println("Quantidade de cozinha: " + casa.cozinha);
        System.out.println("Quantidade de endereco: " + casa.endereco);
        System.out.println("Quantidade de quartos: " + casa.quartos);
        System.out.println("Quantidade de garagem: " + casa.garagem);
        System.out.println("Quantidade de salas: " + casa.salas);
        System.out.println("Quantidade de areadelazer: " + casa.areadelazer);
        System.out.println("Quantidade de comodos: " + casa.comodos);
        System.out.println("Quantidade de Academia: " + casa.academia);
    }
}