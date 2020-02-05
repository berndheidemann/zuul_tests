package commands;

import model.Spiel;

public class ArrowRightCommand extends Command {


    @Override
    public void execute() {
        int x = this.spiel.getSpieler().getX();
        int y = this.spiel.getSpieler().getY();
        if (this.spiel.getSpieler().getAktuellerRaum().feldIstBegehbar(x + 1, y)) {
            this.spiel.getSpieler().setX(x + 1);
        }
    }
}
