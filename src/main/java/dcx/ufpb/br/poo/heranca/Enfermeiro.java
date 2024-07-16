package dcx.ufpb.br.poo.heranca;

public class Enfermeiro extends Pessoa {
    private int horaTrabalho;
    private String setor;
    private String numeroCadastro;

    public Enfermeiro(int horaTrabalho, String setor, String numeroCadastro, String nome, int idade){
        super(nome, idade);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }

    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Hora de trabalho: "+this.horaTrabalho);
        System.out.println("Setor: "+this.setor);
        System.out.println("Numero de Cadastro: "+this.numeroCadastro);
    }
}
