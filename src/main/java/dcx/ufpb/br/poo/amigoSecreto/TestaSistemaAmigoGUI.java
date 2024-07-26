package dcx.ufpb.br.poo.amigoSecreto;

import javax.swing.*;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args){

        //4a
        SistemaAmigoMap amigo = new SistemaAmigoMap();

        //4b
        int quantAmigos = Integer.parseInt(JOptionPane.showInputDialog("Quantos amigos irão brincar? "));

        //4c
        for(int k=0; quantAmigos>k; k++){
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String email = JOptionPane.showInputDialog("Digite seu email");
            amigo.cadastraAmigo(nome, email);
        }

        //4d
        for(int k=0;k<quantAmigos;k++){
            String emailAmigo = JOptionPane.showInputDialog("De quem será o amigo secreto? (apenas o e-mail)");
            String emailAmigoSorteado = JOptionPane.showInputDialog("Agora diga o email da pessoa sorteada de "+emailAmigo+": ");

            try{
                amigo.configuraAmigoSecretoDe(emailAmigo, emailAmigoSorteado);
            }catch (AmigoInexistenteException e){
                System.out.println(e.getMessage());
            }
        }

        //4e
        String remetente = JOptionPane.showInputDialog("De quem é a mensagem? ");
        String texto = JOptionPane.showInputDialog("Qual o texto a ser passado? ");
        String ehAnonima = JOptionPane.showInputDialog("Essa mensagem será anônima? (S ou N) ");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Qual número dessa mensagem? "));
        boolean anonima = false;
        if (ehAnonima.equalsIgnoreCase("S")){
            anonima = true;
        }
        amigo.enviarMensagemParaTodos(texto, remetente, anonima, id);
    }
}
