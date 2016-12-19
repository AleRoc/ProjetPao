package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.installations.Installation;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Personne extends Participant {

    protected String prenom;
    protected int age;

    protected float argent;

    protected ArrayList<Installation> propriétés;
    protected ArrayList<CentraleDAchat> adherences;
    public abstract void faireOffreVente();
    public abstract void adhererCentrale(CentraleDAchat centrale);
}
