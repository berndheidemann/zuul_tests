package model;

import java.awt.image.BufferedImage;

public class Tile {

    private char sign;

    public boolean isWalkable() {
        return walkable;
    }

    private boolean walkable;
    private String spriteFile;
    private int tileXPos;
    private int tileYPos;
    private BufferedImage tileImage;

    public Tile(char sign, boolean walkable, String spriteFile, int tileXPos, int tileYPos) {
        this.sign = sign;
        this.walkable = walkable;
        this.spriteFile = spriteFile;
        this.tileXPos = tileXPos;
        this.tileYPos = tileYPos;
    }

    public String getSpriteFile() {
        return this.spriteFile;
    }

    public int getYPos() {
        return this.tileXPos;
    }

    public int getXPos() {
        return this.tileXPos;
    }

    public void setImage(BufferedImage tileImage) {
        this.tileImage = tileImage;
    }

    public BufferedImage getTileImage() {
        return tileImage;
    }
}
