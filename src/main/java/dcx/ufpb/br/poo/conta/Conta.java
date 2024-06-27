package dcx.ufpb.br.poo.conta;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public double creditar(double valor){
        if (valor<0){
            throw new IllegalArgumentException("O valor a creditar não pode ser negativo. Valor recebido: "+valor);
        }
        this.saldo += valor;
        return this.saldo;
    }
    public double debitar(double valor){
        this.saldo-=valor;
        return this.saldo;
    }
}
