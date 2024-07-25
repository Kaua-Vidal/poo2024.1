package dcx.ufpb.br.poo.amigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Amigo> amigos = new ArrayList<>();





    public void cadastraAmigo(String nomeAmigo, String emailAmigo){
        Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
        amigos.add(novoAmigo);
    }

    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException {
        for(Amigo a:amigos){
            if (emailAmigo.equals(a.getEmail())){
                return a;
            }
        }
        throw new AmigoInexistenteException("Amigo não existe");
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima, int id){
        MensagemParaTodos m = new MensagemParaTodos(texto, emailRemetente, ehAnonima, id);
        System.out.println(m.getTextoCompletoAExibir());
    }
    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima, int id){
        MensagemParaAlguem m = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima, id);
        System.out.println(m.getTextoCompletoAExibir());
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> todasMensagensAnonimas = new ArrayList<>();


        for (Mensagem a:mensagens){
            if (a.ehAnonima()){
                todasMensagensAnonimas.add(a);
            }
        }
        return todasMensagensAnonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        List<Mensagem> todasMensagens = new ArrayList<>();
        for (Mensagem a:mensagens){
            todasMensagens.add(a);
        }
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
        return amigoSorteado.getNome();
    }
}
