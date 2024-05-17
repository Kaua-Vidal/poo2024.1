package dcx.ufpb.br.poo.quiz;

import javax.swing.JOptionPane;
import java.util.List;

public class ProgramaQuiz {
    public static void main (String[] args){
        SistemaQuiz sistema = new SistemaQuizKaua();


        String opcao = "";
        while (!opcao.equals("4")){
            opcao = JOptionPane.showInputDialog("Digite uma opçao: " +
                    "\n1.Cadastre Pergunta" +
                    "\n2.Listar perguntas" +
                    "\n3.Sortear Pergunta" +
                    "\n4.Sair");
            if (opcao.startsWith("1")){
                PerguntaME pergunta = new PerguntaME();
                pergunta.setEnunciado(JOptionPane.showInputDialog("Digite o enunciado: "));
                int quantAlternativas = 4;
                String [] alternativas = new String[quantAlternativas];
                for (int k = 0; k<quantAlternativas; k++){
                    alternativas[k] = JOptionPane.showInputDialog("Digite a alternativa "+ (k+1));
                }
                pergunta.setAlternativas(alternativas);
                pergunta.setRespostaCorreta(JOptionPane.showInputDialog("Qual a respota correta: "));
                sistema.cadastraPergunta(pergunta);
            } else if (opcao.startsWith("2")){
                JOptionPane.showMessageDialog(null, "as perguntas são: ");
                List<Pergunta> perguntas = sistema.getTodasAsPerguntas();
                for (Pergunta p:perguntas){
                    JOptionPane.showMessageDialog (null, p.toString());
                }
            } else if (opcao.startsWith("3")){
                try {
                    Pergunta perguntaSorteada = sistema.sorteiaPergunta();
                    String resposta = JOptionPane.showInputDialog(perguntaSorteada.toString());
                    if (perguntaSorteada.estahCorretaResposta(resposta)){
                        JOptionPane.showMessageDialog(null, "Parabéns!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Que pena!");;
                    }
                } catch (PerguntaNaoExisteException e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível sortear!");
                    e.printStackTrace();
                }

            } else if (opcao.startsWith("4")){
                JOptionPane.showMessageDialog(null, "Tchau! ");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente colocar outra opção...");
            }

        }
    }
}
