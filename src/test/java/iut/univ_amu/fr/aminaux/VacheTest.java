package iut.univ_amu.fr.aminaux;

import iut.univ_amu.fr.aminaux.Vache;
import junit.framework.TestCase;

/**
 * Created by Sylvai on 25/11/2016.
 */
public class VacheTest extends TestCase {

    Vache vache = new Vache();
    public void testManger() throws Exception {
        int stock = 30;
       stock = vache.manger(stock);
        vache.manger(stock);
    }

    public void testVivre() throws Exception {
        int stock = 10;
        vache.vivre(stock);
        vache.vivre(stock);
        vache.vivre(stock);
        vache.vivre(stock);
        vache.vivre(stock);
        vache.vivre(stock);
        vache.vivre(stock);
    }

    public void testAccoupler() throws Exception {

    }

    public void testNaissance() throws Exception {

    }

    public void testProduire() throws Exception {

    }

    public void testMourir() throws Exception {

    }
}