package dcx.ufpb.br.poo.ex3;

import dcx.ufpb.br.poo.quiz.SistemaQuiz;

import java.util.ArrayList;
import java.util.List;

public class AutoresList implements SistemaAutor {
    private List<Autor> autores;

    public AutoresList(){
        this.autores = new ArrayList<>();
    }


    public void cadastrarAutor(Autor autor) throws AutorJaCadastradoException{
        if (!autores.contains(autor)){
            autores.add(autor);
        } else {
            throw new AutorJaCadastradoException("Esse autor já foi cadastrado, tente novamente!");
        }
    }

    public List<Autor> getAutores(){
        return autores;
    }


}
