package iut.univ_amu.fr;

import iut.univ_amu.fr.participants.CentraleDAchat;
import iut.univ_amu.fr.participants.Personne;

/**
 * Created by louis on 17/12/2016.
 */
public class Adherence {
    private CentraleDAchat centrale;
    private Personne adherent;
    private boolean renouvellement = false;
    private int duree = 0;

    public Adherence(CentraleDAchat centrale, Personne adherent, boolean renouvellement, int duree) {
        this.centrale = centrale;
        this.adherent = adherent;
        this.renouvellement = renouvellement;
        this.duree = duree;
    }

    // setters

    public void setRenouvellement(boolean renouvellement) {
        this.renouvellement = renouvellement;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    // getters

    public CentraleDAchat getCentrale() {
        return centrale;
    }

    public Personne getAdherent() {
        return adherent;
    }

    public boolean getRenouvellement() {
        return renouvellement;
    }

    public int getDuree() {
        return duree;
    }
}
