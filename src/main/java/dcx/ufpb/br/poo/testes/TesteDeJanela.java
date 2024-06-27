package dcx.ufpb.br.poo.testes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class TesteDeJanela {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Janela de teste");
        janela.setLocation(0, 0);
        janela.setSize(400, 400);
        JButton botao = new JButton("Meu botão");
        botao.setToolTipText("Dica: meu botão de teste");
        botao.addActionListener((ae) -> {
            JOptionPane.showMessageDialog(janela, "no meu botão?? sai fora, danada");
            tocarSom("D:\\Documentos\\Área de programação\\Java\\poo2024.2\\sounds\\Lá ele!.wav");
        });
        janela.setLayout(new GridLayout(3, 1));
        janela.add(new JLabel());
        janela.add(botao);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    public static void tocarSom(String caminhoDoSom) {
        try {
            File arquivoDeSom = new File(caminhoDoSom);
            System.out.println("Caminho absoluto do arquivo: " + arquivoDeSom.getAbsolutePath());

            if (!arquivoDeSom.exists()) {
                System.err.println("O arquivo de som não existe: " + caminhoDoSom);
                return;
            }
            if (!arquivoDeSom.canRead()) {
                System.err.println("O arquivo de som não tem permissão de leitura: " + caminhoDoSom);
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivoDeSom);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

