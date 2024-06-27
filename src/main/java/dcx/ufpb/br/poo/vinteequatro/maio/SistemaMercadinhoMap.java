package dcx.ufpb.br.poo.vinteequatro.maio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class SistemaMercadinhoMap implements SistemaMercadinho{
    private final Map<String, Produto> produtos;
    public SistemaMercadinhoMap() {
        this.produtos = new HashMap<>();
    }
    @Override
    public void cadastrarProduto(Produto p) throws ProdutoJaExisteException {
        if (this.produtos.containsKey(p.getCodigo())) {
            throw new ProdutoJaExisteException("Já existe produto com o código "+p.getCodigo());
        } else {
            this.produtos.put(p.getCodigo(), p);
        }
    }

    @Override
    public List<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        List<Produto> lista = new LinkedList<>();
        for (Produto p: this.produtos.values()){
            if (p.ehDaCategoria(categoria)){
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public int contaProdutosQueCustamMaisDe(double preco) {
        int cont = 0;
        for (Produto p: this.produtos.values()){
            if (p.getValorUnitario()>preco){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public double pesquisaPrecoDoProduto(String codigo) throws ProdutoNaoExisteException {
        if (this.produtos.containsKey(codigo)){
            Produto p = this.produtos.get(codigo);
            return p.getValorUnitario();
        } else {
            throw new ProdutoNaoExisteException("Não existe produto com o código"+codigo);
        }


    }

    //Demais métodos da classe considerando que implementa a interface e que lança em seus
    //métodos mesma exceções dos métodos da interface.


}
