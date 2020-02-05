package view;

import model.PlayerState;
import model.Spiel;

import java.awt.image.BufferedImage;

public class PlayerRenderer implements Renderer {

    public BufferedImage render(Spiel spiel, BufferedImage img) {
        int playerX = spiel.getSpieler().getX();
        int playerY = spiel.getSpieler().getY();
        img.getGraphics().drawImage(Tiles.characterTiles.get(PlayerState.standing_facing_west), playerX * Tiles.TILE_WIDTH, playerY * Tiles.TILE_HEIGHT, Tiles.TILE_WIDTH, Tiles.TILE_HEIGHT, null);
        return img;
    }
}
