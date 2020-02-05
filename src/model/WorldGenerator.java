package model;

import java.util.HashMap;

public class WorldGenerator {
    private Raum lichtung, waldstueck, taverne, hexenhaus, dorfplatz, kellerDerTaverne, geheimgang, taverneErsterStock, piratenHoehle;

    public WorldGenerator() {
        this.raeumeAnlegen();
        this.setzeAusgaenge();
        this.addGegenstaende();
    }

    private void raeumeAnlegen() {
        lichtung = new Raum("auf einer Lichtung, umgeben von dunklen Tannen");
        lichtung.setMap(new String[]{
                "*************************",
                "*                       *",
                "*                 E     *",
                "*                       *",
                "*                       *",
                "*            **         *",
                "*           *  *        *",
                "*            **         *",
                "*                       *",
                "*              *        *",
                "*                       *",
                "*                       *",
                "*                       *",
                "*                       *",
                "*                       *",
                "*                       *",
                "*************************"

        });


    }

    private void setzeAusgaenge() {
        lichtung.setAusgang("east", waldstueck);
    }


    private void addGegenstaende() {
        lichtung.gegenstandAblegen(new Gegenstand("Korb", "ein Weidenkorb gefüllt mit Brot", 4));
        lichtung.gegenstandAblegen(new Essen("Muffin", "lecker lecker", 1, 5));
    }

    public Raum getStartRaum() {
        return this.lichtung;
    }


}
