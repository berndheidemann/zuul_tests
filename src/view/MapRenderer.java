package view;

import controller.GameController;
import model.PlayerState;
import model.Raum;
import model.Spiel;
import model.Spieler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MapRenderer implements Renderer {

    public MapRenderer() {

    }

    public BufferedImage render(Spiel spiel, BufferedImage img) {
        Raum raum = spiel.getSpieler().getAktuellerRaum();
        Graphics g = img.getGraphics();
        for (int y = 0; y < raum.getMap().length; y++) {
            String row[] = raum.getMap()[y].split("");
            for (int x = 0; x < row.length; x++) {
                char sign = row[x].charAt(0);
                g.drawImage(Tiles.tilemap.get(sign).getTileImage(), x * Tiles.TILE_WIDTH, y * Tiles.TILE_WIDTH, Tiles.TILE_WIDTH, Tiles.TILE_HEIGHT, null);
            }
        }
        return img;
    }


}
