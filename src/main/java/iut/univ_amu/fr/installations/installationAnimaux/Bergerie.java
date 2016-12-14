package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Ovide;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Bergerie extends InstallationAnimaux {
    protected ArrayList<Ovide> occupants = new ArrayList<Ovide>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;


}
