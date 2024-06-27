package dcx.ufpb.br.poo.vinteequatro.maio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SistemaMercadinhoMapTest {
    @Test
    public void testaCadastro() {
        SistemaMercadinhoMap sistema = new SistemaMercadinhoMap();
        try {
            sistema.cadastrarProduto(new Produto("001", "Cenoura", 3.00,
                    CategoriaProduto.HORTIFRUTI));
            //TODO: Colocar aqui código a implementar
            sistema.cadastrarProduto(new Produto("002", "Tomate", 10,CategoriaProduto.HORTIFRUTI));
            int quant = sistema.contaProdutosQueCustamMaisDe(2.00);
                assertEquals(2, quant);
        } catch(ProdutoJaExisteException e) {
            fail("Não deveria lançar exceção");
        }

    }
}

