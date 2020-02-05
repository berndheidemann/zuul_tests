/**
 * Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes
 * Adventure-Game. Ein Spieler kann sich in einer Umgebung bewegen,
 * mehr nicht. Das Spiel sollte auf jeden Fall ausgebaut werden,
 * damit es interessanter wird!
 * <p>
 * Zum Spielen muss eine Instanz dieser Klasse erzeugt werden und
 * an ihr die Methode "spielen" aufgerufen werden.
 * <p>
 * Diese Instanz erzeugt und initialisiert alle anderen Objekte
 * der Anwendung: Sie legt alle R�ume und einen Parser an und
 * startet das Spiel. Sie wertet auch die Befehle aus, die der
 * Parser liefert, und sorgt f�r ihre Ausf�hrung.
 *
 * @author Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */
package model;


import java.util.HashMap;

public class Spiel {
    private Spieler spieler;
    private boolean beendet;

    /**
     * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
     */
    public Spiel(Raum startRaum) {
        this.beendet = false;
        this.spieler = new Spieler();
        this.spieler.geheZu(startRaum);
    }


    public void quit() {
        this.beendet = true;
    }

    /**
     * Die Hauptmethode zum Spielen. Läuft bis zum Ende des Spiels
     * in einer Schleife.
     */

    private void raumInfoAusgeben() {
        System.out.println(this.spieler.getAktuellerRaum().getLangeBeschreibung());
    }

    public Spieler getSpieler() {
        return this.spieler;
    }

}
