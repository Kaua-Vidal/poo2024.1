package dcx.ufpb.br.poo.conta;

public class Conta {

    private double saldo;

    public Conta (double saldo){
        this.saldo = saldo;
    }

    public Conta(){
        this(0.0);
    }

    public double getSaldo(){
        return this.saldo;

    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double creditar(double valor){
        if (valor<=0){
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
        this.saldo = valor + this.saldo;
        return this.saldo;
    }

    public double debitar(double valor){
        if (valor<=0){
            throw new IllegalArgumentException("O valor a ser acrescentado não pode ser menor que 0");
        }
        this.saldo -= valor;
        return this.saldo;
    }
}
