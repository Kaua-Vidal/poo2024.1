package dcx.ufpb.br.poo.amigoSecreto;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;
    private int id;

    public Mensagem (String texto, String emailRemetente, boolean anonima, int id){
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
        this.id = id;
    }

    public String getTextoCompletoAExibir(){
        if (!anonima){
            return "Mensagem para "+this.emailRemetente+". Texto: "+this.texto;
        }
        return "Mensagem anonima";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }
    public boolean ehAnonima(){
        if (anonima){
            return true;
        }
        return false;
    }
}
