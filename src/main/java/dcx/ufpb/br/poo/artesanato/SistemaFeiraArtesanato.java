package dcx.ufpb.br.poo.artesanato;

import java.util.List;

/**
 * Sistema para gerenciar itens de artesanato
 */

public interface SistemaFeiraArtesanato {

    /**
     * Cadastra um novo item no sistema
     * @param item o item a ser adicionado
     * @return true se o item foi cadastrado ou false caso ele ja exista no sistema.
     */
    public boolean cadastraItem (ItemDeArtesanato item);

    /**
     * Pesquisa todos os itens cujo o nome começa com o nome passado como parâmetro
     * @param nome o nome a pesquisar
     * @return Uma lista contendo os itens cujo o nome começa com o parâmetro passado.
     */

    public List<ItemDeArtesanato> pesquisarItensPeloNome(String nome);

    /**
     * Pesquisa todos os itens cujo o nome começa com o nome passado como parâmetro
     * @param preco o valor dos itens a pesquisar
     * @return Uma lista contando os itens cujo o nome começa com o parâmetro passado.
     */

    public List<ItemDeArtesanato> pesquisarItensAbaixoDoPreco(double preco);

    /**
     *  Pesquisa o item cujo código é passado como parâmetro
     * @param codigo O codigo do item a pesquisar
     * @return o item encontrado
     * @throws ItemInexistenteException se não for encontrado o item pelo codigo passado
     */

    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException;

}
