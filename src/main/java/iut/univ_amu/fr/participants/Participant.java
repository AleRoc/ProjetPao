package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.marche.Marche;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Participant {
    private String nom;
    private Marche marche;
    public abstract void faireOffreAchat();
}