package dcx.ufpb.br.poo.amigoSecreto;

public class MensagemParaTodos extends Mensagem{
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima, int id){
        super(texto, emailRemetente, anonima, id);
    }

    public String getTextoCompletoAExibir(){
        if (ehAnonima()){
            return "Mensagem para Todos. Texto: "+getTexto();
        }
        return "Mensagem anonima";
    }
}
