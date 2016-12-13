package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Belier;
import iut.univ_amu.fr.aminaux.Brebis;
import iut.univ_amu.fr.aminaux.Ovide;

/**
 * Created by Roche on 25/11/2016.
 */
public class Bergerie extends InstallationAnimaux {

    protected void ajouterAnimal(Ovide animal) {
        String nom = animal.getNom();
        System.out.print("C'est un(e)  : "  + animal.getNom() + " !!! ");
        if( nom.equals("Brebis") || nom.equals("Beliers") ){
            System.out.println("et on l'ajoute !!");
            super.ajouterAnimal(animal);

        }else
            throw new IllegalAccessError("On ne peux pas mettre cette animal ici");
    }


    protected void retirerAnimal(Ovide animal) {
        super.retirerAnimal(animal);
    }

    @Override
    protected void jourFermier() {
        super.jourFermier();
    }

    @Override
    protected void nourireOccupants() {

    }

    @Override
    protected void naissanceOccupants() {

    }
}
