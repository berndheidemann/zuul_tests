package controller;

import model.Raum;
import model.Spiel;
import model.WorldGenerator;
import view.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GameController implements Runnable {

    private static GameController instance;
    private Spiel spiel;
    public static final int WIDTH = 415;
    public static final int HEIGHT = 340;
    private MainWindow view;
    private Tiles tiles;
    private ArrayList<Renderer> rendererChain;

    private GameController() {
        Raum startRaum = new WorldGenerator().getStartRaum();
        this.spiel = new Spiel(startRaum);
        this.tiles = new Tiles();
        this.rendererChain = new ArrayList<>();
        this.rendererChain.add(new MapRenderer());
        this.rendererChain.add(new PlayerRenderer());
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    @Override
    public void run() {
        int[][] data = new int[20][20];
        boolean down = true;
        int boxWidth = WIDTH / data[0].length;
        int boxHeight = HEIGHT / data.length;
        while (true) {
            BufferedImage img = new BufferedImage(GameController.WIDTH, GameController.HEIGHT, BufferedImage.TYPE_INT_ARGB);
            for (Renderer r : this.rendererChain) {
                img = r.render(this.spiel, img);
            }
            this.view.setImg(img);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void start() {
        this.view = new MainWindow();
        Thread t = new Thread(this);
        t.start();
    }

    public Spiel getSpiel() {
        return this.spiel;
    }
}
