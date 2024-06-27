package dcx.ufpb.br.poo.vinteequatro.maio;

public class ProdutoNaoExisteException extends Exception {

    public ProdutoNaoExisteException(String msg){
        super(msg);
    }


    public ProdutoNaoExisteException(){
        this("Produto não existe!");
    }
}
