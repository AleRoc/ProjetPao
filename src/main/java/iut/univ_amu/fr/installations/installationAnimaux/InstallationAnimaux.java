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

    protected void ajouterAnimal(Animal a) {
        occupants.add(a);
    }

    protected void retirerAnimal(Animal animal) {
        for (int i=0; i<occupants.size(); ++i) {
            if (occupants.get(i) == animal)
                occupants.set(i, null);
            else
                System.out.print("Animal non présent dans le tableau");
        }
        for (int i=0; i<occupants.size(); ++i) {
            if (occupants.get(i) == null) {
                occupants.set(i, occupants.get(++i));
            }
        }
    }

}
