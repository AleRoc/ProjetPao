package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Porcin;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Porcherie extends InstallationAnimaux {
    protected ArrayList<Porcin> occupants = new ArrayList<Porcin>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;


}
