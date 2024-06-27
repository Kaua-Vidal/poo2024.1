package dcx.ufpb.br.poo.vinteequatro.maio;

import java.util.List;
public interface SistemaMercadinho {
    public void cadastrarProduto(Produto p) throws ProdutoJaExisteException;
    public List<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria);
    public int contaProdutosQueCustamMaisDe(double preco);
    public double pesquisaPrecoDoProduto(String codigo) throws ProdutoNaoExisteException;
}
