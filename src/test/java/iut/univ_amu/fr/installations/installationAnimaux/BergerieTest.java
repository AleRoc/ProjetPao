package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Belier;
import iut.univ_amu.fr.aminaux.Brebis;
import iut.univ_amu.fr.aminaux.Truie;
import junit.framework.TestCase;

/**
 * Created by Sylvai on 13/12/2016.
 */
public class BergerieTest extends TestCase {


    Brebis brebis1 = new Brebis();
    Belier belier = new Belier();
    Brebis brebis2 = new Brebis();

    public void test_Ajouter_Supprimer_Afficher() throws Exception {
        Bergerie bergerie = new Bergerie();
        bergerie.ajouterAnimal(brebis1);
        bergerie.ajouterAnimal(brebis2);
        bergerie.ajouterAnimal(belier);
        bergerie.affichierAbitant();
        bergerie.retirerAnimal(brebis1);
        bergerie.affichierAbitant();

    }
}