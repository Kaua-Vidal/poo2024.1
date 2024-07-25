package dcx.ufpb.br.poo.amigoSecreto;

import java.util.*;

public class SistemaAmigoMap {
    private Map<Integer, Mensagem> mensagens = new HashMap<>();
    private Map<String, Amigo> amigos = new HashMap<>();





    public void cadastraAmigo(String nomeAmigo, String emailAmigo){
        Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
        amigos.put(nomeAmigo, novoAmigo);
    }

    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException {
        for(Amigo a : amigos.values()){
            if (emailAmigo.equals(a.getEmail())){
                return a;
            }
        }
        throw new AmigoInexistenteException("Amigo não existe");
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima, int id){
        MensagemParaTodos m = new MensagemParaTodos(texto, emailRemetente, ehAnonima, id);
        mensagens.put(id, m);
        System.out.println(m.getTextoCompletoAExibir());
    }
    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima, int id){
        MensagemParaAlguem m = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima, id);
        mensagens.put(id, m);
        System.out.println(m.getTextoCompletoAExibir());
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> todasMensagensAnonimas = new ArrayList<>();


        for (Mensagem a : mensagens.values()){
            if (a.ehAnonima()){
                todasMensagensAnonimas.add(a);
            }
        }
        return todasMensagensAnonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        List<Mensagem> todasMensagens = new LinkedList<>();
        for (Mensagem a : mensagens.values()){
            todasMensagens.add(a);
        }
        System.out.println("todas as mensagens: "+ todasMensagens);
        return todasMensagens;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        Amigo pessoa = pesquisaAmigo(emailDaPessoa);
        Amigo amigoSorteado = pesquisaAmigo(emailAmigoSorteado);

        if (pessoa != null && amigoSorteado != null){
            pessoa.setEmailAmigoSorteado(emailAmigoSorteado);
            System.out.println(pessoa.getNome() + " Tem " +amigoSorteado.getNome() + " como amigo secreto.");
        } else {
            throw new AmigoInexistenteException("Esse amigo não existe.");
        }

    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        Amigo pessoa = pesquisaAmigo(emailDaPessoa);

        if(pessoa == null){
            throw new AmigoInexistenteException("Amigo inexistente");
        }

        String emailAmigoSorteado = pessoa.getEmailAmigoSorteado();
        if (emailAmigoSorteado == null){
            throw new AmigoNaoSorteadoException("Amigo sorteado inexistente");
        }

        Amigo amigoSorteado = pesquisaAmigo(emailAmigoSorteado);
        return amigoSorteado.getEmail();
    }
}
