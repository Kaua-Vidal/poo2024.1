package dcx.ufpb.br.poo.biblioteca;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class GravadoraDeAutores {

    private String nomeArquivoAutores = "autores.dat";

    public GravadoraDeAutores(String nomeArquivo){
        this.nomeArquivoAutores = nomeArquivo;
    }

    public GravadoraDeAutores(){
        this("autores.dat");
    }

//    public void gravaAutores(LinkedList<List> autores) {
//        public LinkedList<Autor> lerAutores() throws IOException {
//            ObjectInputStream in = null;
//            try {
//                in = new ObjectInputStream(new FileInputStream("autores.txt"));
//                return (LinkedList<Autor>) in.readObject();
//
//            } catch(){
//
//            }
//        }
//    }
}
