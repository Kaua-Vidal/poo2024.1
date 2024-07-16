package dcx.ufpb.br.poo.heranca;

public class Principal {
    public static void main(String[] args){
        System.out.println("--Informações do paciente--\n");
        Pessoa p1 = new Paciente ("123", "SUS", "José", 25);
        p1.imprimirInfo();
        System.out.println("\n\n");

        System.out.println("--Informações do Enfermeiro--\n");
        Pessoa p2 = new Enfermeiro(5, "Enfermaria", "12345", "Seu Antônio", 39);
        p2.imprimirInfo();
    }
}
