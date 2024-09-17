package dcx.ufpb.br.poo.gerenciadorDeTask;

import javax.swing.*;
import java.awt.*;

public class TarefasGUI {


    public class AgendaGUIV3ComMenu extends JFrame {
        JLabel linha1, linha2;
        ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
        SistemaTarefas tarefa = new GerenciadorDeTarefas();
        JMenuBar barraDeMenu = new JMenuBar();

        public AgendaGUIV3ComMenu() {
            setTitle("Gerenciador de tarefas");
            setSize(800, 600); //tamanho da janela
            setLocation(150, 150);
            setResizable(false);
            setBackground(Color.white);
            linha1 = new JLabel("Minhas tarefas", JLabel.CENTER);
            linha1.setForeground(Color.red);
            linha1.setFont(new Font("Serif", Font.BOLD, 24));
            linha2 = new JLabel(boloImg, JLabel.CENTER);
            setLayout(new GridLayout(3, 1));
            add(linha1);
            add(linha2);
            add(new JLabel());
            JMenu menuCadastrar = new JMenu("Cadastrar");
            JMenuItem menuCadastrarTarefa = new JMenuItem(
                    "Cadastrar tarefa");
            menuCadastrar.add(menuCadastrarTarefa);
            JMenu menuRemover = new JMenu("Remover");
            JMenuItem menuRemoverTarefa = new JMenuItem(
                    "Remover tarefa");
            menuRemover.add(menuRemoverTarefa);
            menuRemoverAniversariante.addActionListener(
                    new TarefaRemoveController(tarefa, this));
            menuCadastrarAniversariante.addActionListener(
                    (ae) -> {
                        String nome = JOptionPane.showInputDialog(this,
                                "Qual o nome do aniversariante?");
                        int dia = Integer.parseInt(JOptionPane.showInputDialog(this,
                                "Qual o dia do mês em que nasceu? [1-31]"));
                        int mes = Integer.parseInt(JOptionPane.showInputDialog(this,
                                "Qual o mês em que nasceu?[1-12]"));
                        boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
                        if (cadastrou) {
                            JOptionPane.showMessageDialog(this,
                                    "Aniversariante cadastrado");
                        } else {
                            JOptionPane.showMessageDialog(this,
                                    "Aniversariante não foi cadastrado. " +
                                            "Verifique se já não existia");
                        }
                    });
            barraDeMenu.add(menuCadastrar);
            barraDeMenu.add(menuPesquisar);
            barraDeMenu.add(menuRemover);
            setJMenuBar(barraDeMenu);
        }

        //...
        public static void main(String[] args) {
            JFrame janela = new TarefasGUI();
            janela.setVisible(true);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
