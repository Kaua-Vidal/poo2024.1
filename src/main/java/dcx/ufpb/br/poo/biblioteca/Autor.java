package dcx.ufpb.br.poo.biblioteca;

import java.util.Objects;

public class Autor implements Comparable<Autor> {

    private String nome;
    private String dataNascimento;
    private String codigo;

    public Autor (String nome, String dataNascimento, String codigo){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.codigo = codigo;
    }

    public Autor(String codigo){
        this("", "", codigo);
    }

    public Autor (){
        this("","", "");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNome(){
        return this.nome;
    }

    public String getDataNascimento(){
        return this.dataNascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    @Override   //sobrescrevendo uma outra classe
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
        return 0;
    }
}

