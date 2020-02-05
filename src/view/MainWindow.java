package view;

import controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MainWindow extends JFrame {

    private BufferedImage img;

    public void setImg(BufferedImage img) {
        this.img = img;
        repaint();
    }

    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(GameController.WIDTH, GameController.HEIGHT);
        setVisible(true);
        this.addKeyListener(new GameKeyListener());
    }

    public void paint(Graphics g) {
        g.drawImage(img, 5, 30, GameController.WIDTH + 5, GameController.HEIGHT + 30, null);
    }
}
