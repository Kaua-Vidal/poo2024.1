package dcx.ufpb.br.poo.heranca;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+ this.idade);
    }
}
