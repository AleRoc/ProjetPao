package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Bovin;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Etable extends InstallationAnimaux {
    protected ArrayList<Bovin> occupants = new ArrayList<Bovin>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;


}
