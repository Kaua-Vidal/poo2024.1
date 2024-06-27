package dcx.ufpb.br.poo.quiz;

public class PerguntaVF extends Pergunta{

    private String afirmativa;

    public PerguntaVF (String enunciado, String afirmativa, String respostaCorreta){
        super(enunciado, respostaCorreta);
        this.afirmativa = afirmativa;
    }
    public PerguntaVF (){
        this("", "", "");
    }

    public boolean estahCorretaResposta(String resposta){
        return (resposta.startsWith(super.getRespostaCorreta()));
    }

    public void setAfirmativa(String afirmativa){
        this.afirmativa = afirmativa;
    }

    public String getAfirmativa(){
        return this.afirmativa;
    }

}
