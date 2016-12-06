package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.installations.Installation;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class InstallationAnimaux implements Installation {

    protected static int capaciteOpti;
    protected static int capaciteMax;

    protected ArrayList<Animal> occupants;

    protected abstract void ajouterAnimal();
    protected abstract void retirerAnimal();
}
