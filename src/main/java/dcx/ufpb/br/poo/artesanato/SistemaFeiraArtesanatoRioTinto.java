package dcx.ufpb.br.poo.artesanato;

import java.util.*;

public class SistemaFeiraArtesanatoRioTinto implements SistemaFeiraArtesanato{

    private Map<String, ItemDeArtesanato> itensDeArtesanato;

    public SistemaFeiraArtesanatoRioTinto(){
        this.itensDeArtesanato = new HashMap<>();
    }

    /**
     * Cadastra um novo item no sistema
     *
     * @param item o item a ser adicionado
     * @return true se o item foi cadastrado ou false caso ele ja exista no sistema.
     */
    @Override
    public boolean cadastraItem(ItemDeArtesanato item) {
        if (itensDeArtesanato.containsKey((item.getCodigo()))){
            return false;
        }
        this.itensDeArtesanato.put(item.getCodigo(), item);
        return true;
    }

    /**
     * Pesquisa todos os itens cujo o nome começa com o nome passado como parâmetro
     *
     * @param nome o nome a pesquisar
     * @return Uma lista contendo os itens cujo o nome começa com o parâmetro passado.
     */
    @Override
    public List<ItemDeArtesanato> pesquisarItensPeloNome(String nome) {
        List<ItemDeArtesanato> nomesItens = new LinkedList<>();
        for (ItemDeArtesanato i : itensDeArtesanato.values()){
            if (i.getNome().equals(nome)){
                nomesItens.add(i);
            }
        }
        Collections.sort(nomesItens);
        return nomesItens;
    }

    /**
     * Pesquisa todos os itens cujo o nome começa com o nome passado como parâmetro
     *
     * @param preco o valor dos itens a pesquisar
     * @return Uma lista contando os itens cujo o nome começa com o parâmetro passado.
     */
    @Override
    public List<ItemDeArtesanato> pesquisarItensAbaixoDoPreco(double preco) {
        List<ItemDeArtesanato> itensAbaixoDoPreco = new LinkedList<>();
        for (ItemDeArtesanato item : this.itensDeArtesanato.values()){
            if (item.getPreco() <= preco){
                itensAbaixoDoPreco.add(item);
            }
        }
        Collections.sort(itensAbaixoDoPreco);
        return itensAbaixoDoPreco;
    }

    /**
     * Pesquisa o item cujo código é passado como parâmetro
     *
     * @param codigo O codigo do item a pesquisar
     * @return o item encontrado
     * @throws ItemInexistenteException se não for encontrado o item pelo codigo passado
     */
    @Override
    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException {
        ItemDeArtesanato item = this.itensDeArtesanato.get(codigo);
        if (item == null){
            throw new ItemInexistenteException("Não existe item com o código "+codigo);
        } else {
            return item;
        }
    }
}
