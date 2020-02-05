package commands;

import model.Spiel;

public class ArrowDownCommand extends Command {


    @Override
    public void execute() {
        int x = this.spiel.getSpieler().getX();
        int y = this.spiel.getSpieler().getY();
        if (this.spiel.getSpieler().getAktuellerRaum().feldIstBegehbar(x, y + 1)) {
            this.spiel.getSpieler().setY(y + 1);
        }
    }
}
