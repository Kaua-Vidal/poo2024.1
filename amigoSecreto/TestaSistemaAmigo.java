package dcx.ufpb.br.poo.amigoSecreto;

import java.util.List;

public class TestaSistemaAmigo {
    public static void main(String[] args){
        SistemaAmigo amigo = new SistemaAmigo();

        //3a
        amigo.cadastraAmigo("Jose","jose@email.com");
        amigo.cadastraAmigo("Maria","maria@email.com");

        try{
            //3b
            amigo.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
            amigo.configuraAmigoSecretoDe("maria@email.com", "jose@email.com");

            //3c
            amigo.enviarMensagemParaAlguem("oi José", "maria@email.com","jose@email.com",true, 1);

            //4d
            amigo.enviarMensagemParaTodos("oi povo", "maria@email.com", true, 1);

            //4e
            List<Mensagem> mensagensAnonimas = amigo.pesquisaMensagensAnonimas();
            for (Mensagem m:mensagensAnonimas){
                System.out.println(m.getTextoCompletoAExibir());
            }

            //4f
            String emailAmigoSecretoDeJose = amigo.pesquisaAmigoSecretoDe("jose@email.com");
            if(emailAmigoSecretoDeJose.equals("maria@email.com")){
                System.out.println("Ok!");
            }
        }catch (AmigoInexistenteException e){
            System.out.println("Exceção estranha foi lançada");
        } catch (AmigoNaoSorteadoException e){
            System.out.println("Exceçao estranha foi lançada");
        }
    }
}
