package view;

import model.PlayerState;
import model.Tile;
import model.WorldGenerator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Tiles {

    public static HashMap<Character, Tile> tilemap = new HashMap<>();
    public static HashMap<PlayerState, BufferedImage> characterTiles = new HashMap<>();

    private String[] filenames = new String[]{"Overworld.png"};
    public static int TILE_WIDTH = 16;
    public static int TILE_HEIGHT = 16;

    public Tiles() {
        tilemap.put(' ', new Tile(' ', true, "Overworld.png", 0, 0));
        tilemap.put('*', new Tile('*', false, "Overworld.png", 14, 0));
        tilemap.put('E', new Tile('E', true, "Overworld.png", 20, 0));
        loadSpritesForTiles();
        loadSpritesForPlayer();
    }

    private void loadSpritesForPlayer() {
        BufferedImage tilesMap = null;
        try {
            tilesMap = ImageIO.read(new File("sprites/character.png"));
            BufferedImage tileImage = new BufferedImage(TILE_WIDTH, TILE_HEIGHT, BufferedImage.TYPE_INT_ARGB);
            tileImage.getGraphics()
                    .drawImage(
                            tilesMap.getSubimage(0 * TILE_WIDTH, 1 * TILE_HEIGHT, TILE_WIDTH,
                                    TILE_HEIGHT), 0, 0, null);
            characterTiles.put(PlayerState.standing_facing_west, tileImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadSpritesForTiles() {
        for (Map.Entry<Character, Tile> entry : tilemap.entrySet()) {
            System.out.println("loading " + entry.getKey());
            Tile tile = entry.getValue();
            try {
                BufferedImage tilesMap = ImageIO.read(new File("sprites/" + tile.getSpriteFile()));
                BufferedImage tileImage = new BufferedImage(TILE_WIDTH, TILE_HEIGHT, BufferedImage.TYPE_INT_ARGB);
                tileImage.getGraphics()
                        .drawImage(
                                tilesMap.getSubimage(tile.getXPos() * TILE_WIDTH, tile.getYPos() * TILE_HEIGHT, TILE_WIDTH,
                                        TILE_HEIGHT), 0, 0, null);
                tile.setImage(tileImage);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
