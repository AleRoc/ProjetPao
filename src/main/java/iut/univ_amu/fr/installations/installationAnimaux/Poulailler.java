package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Volaille;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Poulailler extends InstallationAnimaux {
    protected ArrayList<Volaille> occupants = new ArrayList<Volaille>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;


}
