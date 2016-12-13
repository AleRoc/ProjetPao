package iut.univ_amu.fr.aminaux;

import junit.framework.TestCase;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class BelierTest extends TestCase {

    Belier belier = new Belier();
    Brebis brebis = new Brebis();
    public void testVivre() throws Exception {
        System.out.println("Teste vivre");
        belier.vivre();
        belier.vivre();
        belier.vivre();
        belier.vivre();
        belier.vivre();
        belier.vivre();
        belier.vivre();
    }

    public void testManger() throws Exception {
        System.out.println("Test production de viande et manger");
        System.out.println("repus : " + belier.etatSante.get("repus"));
        belier.manger();
        int stock =0;
        System.out.println("vivant : " +belier.etatSante.get("repus") +" stock : " + stock);
        stock = belier.produireViande();
        System.out.println("vivant : " +belier.etatSante.get("vivant") +" stock : " +stock);
    }

    public void testAccoupler() throws Exception {
        System.out.println("Test accouplement ");
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        belier.accoupler(brebis);
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));

    }
}