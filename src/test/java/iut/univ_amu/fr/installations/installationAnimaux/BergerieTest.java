package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.Belier;
import iut.univ_amu.fr.aminaux.Brebis;
import iut.univ_amu.fr.aminaux.Truie;
import junit.framework.TestCase;

/**
 * Created by Sylvai on 13/12/2016.
 */
public class BergerieTest extends TestCase {


    Brebis brebis = new Brebis();
    Belier belier = new Belier();
    Truie trui = new Truie();

    public void testJourFermier() throws Exception {
        Bergerie bergerie = new Bergerie();
        bergerie.ajouterAnimal(brebis);
        bergerie.ajouterAnimal(trui);
        bergerie.ajouterAnimal(belier);
        bergerie.affichierAbitant();
    }
}