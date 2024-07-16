package dcx.ufpb.br.poo.ex2;

import java.util.Objects;

public class Carro {

    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }

    public Carro(){
        this("", "");
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return "Um "+modelo + "de marca: "+marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o;
        return Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(modelo);
    }

    public void acelerar(){
        System.out.println(marca + " "+modelo+ " acelerando!!");
    }
}
