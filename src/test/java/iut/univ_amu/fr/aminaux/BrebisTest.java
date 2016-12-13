package iut.univ_amu.fr.aminaux;

import junit.framework.TestCase;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class BrebisTest extends TestCase {

    Brebis brebis = new Brebis();
    Belier belier = new Belier();
    public void testVivre() throws Exception {
        System.out.println("Test Vivre");
        brebis.vivre();
        brebis.vivre();
        brebis.vivre();
        brebis.vivre();
        brebis.vivre();
        brebis.vivre();
    }

    public void testNaissance() throws Exception {
        System.out.println("Test produire");
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        belier.accoupler(brebis);
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        brebis.vivre();
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        brebis.vivre();
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        brebis.vivre();
        Ovide ovide = brebis.naissance();
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        System.out.println("Sexe du bébé :" + ovide.isSexe());
    }

    public void testProduire() throws Exception {
        int stock = 0;
        System.out.println("repus :" + brebis.etatSante.get("repus") + " stock :" + stock);
        brebis.produire();
        System.out.println("repus :" + brebis.etatSante.get("repus") + " stock :" + stock);
        brebis.manger();
        System.out.println("repus :" + brebis.etatSante.get("repus") + " stock :" + stock);
        stock = brebis.produire();
        System.out.println("repus :" + brebis.etatSante.get("repus") + " stock :" + stock);
    }
}