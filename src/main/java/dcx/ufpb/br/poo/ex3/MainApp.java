package dcx.ufpb.br.poo.ex3;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args){

        AutoresList autores = new AutoresList();

        String nome = "Machado de Assis";
        String codigo = "123";
        String nome2 = "Mauro de Andrade";
        String codigo2 = "456";

        Autor autor1 = null;
        Autor autor2 = null;


        try{
            autor1 = new Autor(nome, codigo, "");
            autores.cadastrarAutor(autor1);
            autor2 = new Autor(nome2, codigo2, "");
            autores.cadastrarAutor(autor2);
        } catch (AutorJaCadastradoException e){
            System.out.println(e.getMessage());
        }


        if (autor1.compareTo(autor2) == 0){
            System.out.println("O "+autor1+" é igual ao "+autor2);
        } else if (autor1.compareTo(autor2) == -1){
            System.out.println("Apenas o nome do "+autor1+" é igual ao "+autor2+" mas seu código não");
        } else if(autor1.compareTo(autor2) == 1){
            System.out.println("Nenhum dos autores são iguais.");
        }

        for (Autor autor: autores.getAutores()){
            System.out.println(autor);
        }


    }





    //        String opcao = JOptionPane.showInputDialog("1. Cadastrar autor\n2.Remover autor\n3.Mostrar autor");
//
//        switch(opcao){
//            case "1":
//                try{
//                    String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor: ");
//                    String codigo = JOptionPane.showInputDialog("Digite o codigo: ");
//                    String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
//                    Autor autor = new Autor(nomeAutor, codigo, dataNascimento);
//                    autores.cadastrarAutor(autor);
//                } catch(AutorJaCadastradoException e) {
//                    JOptionPane.showMessageDialog(null, e.getMessage());
//                }
//                break;
//
//        }
}
