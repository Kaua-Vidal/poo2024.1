package dcx.ufpb.br.poo.ex3;

import java.util.Objects;

public class Autor implements Comparable<Autor> {
    private String nome;
    private String codigo;
    private String dataNascimento;

    public Autor (String nome, String codigo, String dataNascimeto){
        this.nome = nome;
        this.codigo = codigo;
        this.dataNascimento = dataNascimeto;
    }

    public Autor (){
        this("","","");
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String toString() {
        return "Autor: " + getNome()
                + " / Código: " + getCodigo()
                + " / Data de nascimento: " + getDataNascimento();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;
        return Objects.equals(codigo, autor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public int compareTo(Autor o) {
        if(this.nome == o.nome || this.codigo == o.codigo){
            return 0;
        } else if (this.nome == o.nome && this.codigo != o.codigo){
            return -1;
        } else {
            return 1;
        }
    }


}
