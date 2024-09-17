package dcx.ufpb.br.poo.gerenciadorDeTask;

import javax.swing.*;
import java.awt.*;

public class TarefasJFrame {

    public class TarefasJFrameGUI extends JFrame{
        public TarefasJFrameGUI(){
            setTitle("Gerenciador de tarefas");
            setVisible(true);
            setSize(800, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLocationRelativeTo(null);
            setLayout(null);
            JButton jButton = new JButton("Cadastrar tarefa");
            jButton.setBounds(0, 0, 150, 70);
            jButton.setFont(new Font("Arial", Font.BOLD, 10));
            jButton.setForeground(new Color(255, 255, 255));
            jButton.setBackground(new Color(10, 10, 10));
            add(jButton);
        }
    }
}
