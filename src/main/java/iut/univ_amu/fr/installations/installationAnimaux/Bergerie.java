package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.aminaux.Brebis;
import iut.univ_amu.fr.aminaux.Mouton;
import iut.univ_amu.fr.aminaux.Ovide;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Bergerie extends InstallationAnimaux {
    private ArrayList<Ovide> occupants = new ArrayList<>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;

    public ArrayList<Ovide> getOccupants() {
        return occupants;
    }

    @Override
    public String toString() {
        return "Bergerie{" +
                "occupants=" + occupants +
                ", capaciteActuelle=" + capaciteActuelle +
                ", capaciteMax=" + capaciteMax +
                '}';
    }

    public void ajouterAnimal(Ovide a) {occupants.add(a);}

    protected void retirerAnimal(Ovide animal) {
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
