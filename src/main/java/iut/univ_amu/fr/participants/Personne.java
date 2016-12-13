package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.installations.Installation;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Personne extends Participant {
    private int argent;
    private ArrayList<Installation> propriétés;


    public abstract void faireOffreVente();
}
