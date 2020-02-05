package view;

import commands.*;
import controller.GameController;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class GameKeyListener implements KeyListener {

    private HashMap<Integer, Command> commands;

    public GameKeyListener() {
        this.commands = new HashMap<>();
        this.commands.put(38, new ArrowUpCommand());
        this.commands.put(39, new ArrowRightCommand());
        this.commands.put(37, new ArrowLeftCommand());
        this.commands.put(40, new ArrowDownCommand());
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        Command c = this.commands.get(keyEvent.getKeyCode());
        System.out.println(keyEvent.getKeyCode());
        if (c != null) {
            c.execute();
        } else {
            System.out.println("unkown command: " + keyEvent.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
