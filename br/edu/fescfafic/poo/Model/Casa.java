package br.edu.fescfafic.poo.Model;

public class Casa {
    public String endereco;
    public int banheiros;
    public int areadelazer;
    public int cozinha;
    public int quartos;
    public int comodos;
    public int salas;
    public int garagem;
    public int academia;
    
    public Casa (String endereco, int comodos, int quartos, int banheiros, int salas, int cozinha, int academia, int garagem, int areadelazer) {
        this.banheiros = banheiros;
        this.cozinha = cozinha;
        this.endereco = endereco;
        this.quartos = quartos;
        this.garagem = garagem;
        this.salas = salas;
        this.areadelazer = areadelazer;
        this.comodos = comodos;
        this.academia = academia;
    }
}