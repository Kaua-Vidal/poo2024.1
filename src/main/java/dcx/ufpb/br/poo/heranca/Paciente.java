package dcx.ufpb.br.poo.heranca;

import javax.swing.*;

public class Paciente extends Pessoa{
    private String matricula;
    private String planoDeSaude;

    public Paciente (String matricula, String planoDeSaude, String nome, int idade){
        super(nome, idade);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }

    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Plano de Saúde: "+ this.planoDeSaude);
    }
}
