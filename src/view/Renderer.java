package view;

import model.Spiel;

import java.awt.image.BufferedImage;

public interface Renderer {
    public BufferedImage render(Spiel spiel, BufferedImage img);
}
