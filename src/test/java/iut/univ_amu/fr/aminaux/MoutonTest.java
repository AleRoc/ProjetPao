package iut.univ_amu.fr.aminaux;

import junit.framework.TestCase;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class MoutonTest extends TestCase {

    Mouton mouton = new Mouton();
    Brebis brebis = new Brebis();
    public void testVivre() throws Exception {
        System.out.println("Teste vivre");
        mouton.vivre();
        mouton.vivre();
        mouton.vivre();
        mouton.vivre();
        mouton.vivre();
        mouton.vivre();

    }

    public void testManger() throws Exception {
        System.out.println("Test production de viande et manger");
        System.out.println("repus : " + mouton.etatSante.get("repus"));
        mouton.manger();
        int stock =0;
        System.out.println("vivant : " + mouton.etatSante.get("repus") +" stock : " + stock);
        stock = mouton.produireViande();
        System.out.println("vivant : " + mouton.etatSante.get("vivant") +" stock : " +stock);
    }

    public void testAccoupler() throws Exception {
        System.out.println("Test accouplement ");
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));
        mouton.accoupler(brebis);
        System.out.println("Gestation de la brebis : " + brebis.etatSante.get("gestation"));

    }
}