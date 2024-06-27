package dcx.ufpb.br.poo.vinteequatro.maio;

public class ProdutoJaExisteException extends Exception {
    public ProdutoJaExisteException(){
        super();
    }


    public ProdutoJaExisteException(String msg){
        super(msg);
    }
}
