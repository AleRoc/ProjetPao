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

    // methodes

    public void supprimer(){
        centrale.getAdherences().remove(this);
        adherent.getAdherences().remove(this);
    }

    // constructeur

    public Adherence(CentraleDAchat centrale, Personne adherent, boolean renouvellement, int duree) {
        this.centrale = centrale;
        this.adherent = adherent;
        this.renouvellement = renouvellement;
        this.duree = duree;

        centrale.ajouterAdherence(this);
        //L'ajout de l'adhérence à la liste d'adhérences de l'adhérent (oui c'est une vraie phrase qui a un vrai sens) est faite par l'adhérent.
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
