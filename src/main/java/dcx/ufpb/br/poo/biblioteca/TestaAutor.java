package dcx.ufpb.br.poo.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaAutor {
    public static void main(String[] args) {
        Autor autor1 = new Autor("001", "Machado de Assis", "");
        Autor autor2 = new Autor("002", "Dante Aligrieri", "");
        Autor autor3 = new Autor("003", "Kauã Vidal", "");
        System.out.println(autor1.compareTo(autor2));
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        Collections.sort(autores);
        for (Autor autor: autores){
            System.out.println(autor.getNome());
        }
    }
}
