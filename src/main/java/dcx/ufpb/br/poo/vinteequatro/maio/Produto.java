package dcx.ufpb.br.poo.vinteequatro.maio;

import java.util.Objects;

public class Produto {
    private String codigo;
    private String nome;
    private double valorUnitario;
    private CategoriaProduto categoria;

    public Produto (String codigo, String nome, double valorUnitario, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto(String codigo) {
        this(codigo,"",0.0, CategoriaProduto.HORTIFRUTI);
    }

    public boolean ehDaCategoria(CategoriaProduto categoria) {
        return (this.categoria==categoria);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", categoria=" + categoria +
                '}';
    }
    //Demais métodos da classe aqui
}

