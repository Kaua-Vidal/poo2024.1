package dcx.ufpb.br.poo.amigoSecreto;

public class MensagemParaAlguem extends Mensagem{
    private String emailDestinatario;

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public MensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean anonima, int id){
        super(texto, emailRemetente, anonima, id);
        this.emailDestinatario = emailDestinatario;

    }

    public String getTextoCompletoAExibir(){
        if (ehAnonima()){
            return "Mensagem  para "+this.emailDestinatario+". Texto: "+getTexto();
        }
        return "Mensagem de: "+getEmailRemetente()+" para "+this.emailDestinatario+". Texto:  "+getTexto();
    }
}
