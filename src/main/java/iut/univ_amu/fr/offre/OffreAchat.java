package iut.univ_amu.fr.offre;

import iut.univ_amu.fr.participants.Personne;

import java.util.Date;

/**
 * Created by Roche on 13/12/2016.
 */
public class OffreAchat {
    private Personne acheteur;
    private float enchere;
    private Date date;

    public OffreAchat (Personne acheteur, float enchere){
        this.acheteur = acheteur;
        this.enchere = enchere;
    }

    // getters
    public Personne getAcheteur() {
        return acheteur;
    }

    public float getEnchere() {
        return enchere;
    }
}
