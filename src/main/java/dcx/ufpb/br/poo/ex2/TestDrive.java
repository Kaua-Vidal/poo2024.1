package dcx.ufpb.br.poo.ex2;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class TestDrive {

    public static void main(String[] args){

        List<Carro> carrosLista = new LinkedList<>();


        try {
            String marca = JOptionPane.showInputDialog("Digite a marca do carro: ");
            String modelo = JOptionPane.showInputDialog("Digite o modelo do carro");


            if (marca.isEmpty() || modelo.isEmpty()) {
                throw new NullPointerException("Marca ou modelo não foram informados");
            }

            Carro carroNovo = new Carro(marca, modelo);
            carrosLista.add(carroNovo);

            for (Carro carro : carrosLista) {
                carro.acelerar();
            }
        } catch (NullPointerException e){
            System.out.println("Exceção: " + e.getMessage());
            System.out.println("Não foi possível adicionar o carro...");
        }

    }
}
