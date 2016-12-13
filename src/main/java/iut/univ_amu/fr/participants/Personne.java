package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.installations.Installation;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Personne extends Participant {
    private float argent;
    private ArrayList<Installation> propriétés;
    private ArrayList<CentraleDAchat> adherences;
    public abstract void faireOffreVente();
    public abstract void adhererCentrale(CentraleDAchat centrale);
}
