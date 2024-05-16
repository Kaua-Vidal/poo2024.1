package dcx.ufpb.br.poo.quiz;

import java.util.LinkedList;
import java.util.List;

public class SistemaQuizKaua implements SistemaQuiz{

    private List<Pergunta> perguntas;

    public SistemaQuizKaua(){
        this.perguntas = new LinkedList<>();
    }

    public SistemaQuizKaua (List<Pergunta> perguntas){
        this.perguntas = perguntas;
    }

    @Override
    public void cadastraPergunta(Pergunta p) {
        this.perguntas.add(p);
    }

    @Override
    public Pergunta sorteiaPergunta() {
        if (this.perguntas.size()==0){
            return null;
        } else {
            return this.perguntas.get(0);
        }

    }

    @Override
    public List<Pergunta> getTodasAsPerguntas() {
        return this.perguntas;
    }

}
