package commands;

import controller.GameController;
import model.Spiel;

public abstract class Command {

    protected Spiel spiel;

    public Command() {
        this.spiel = GameController.getInstance().getSpiel();
    }

    public abstract void execute();
}
