package iut.univ_amu.fr.aminaux;

import java.util.Random;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Brebis extends Ovide {

    private static final int TEMPS_GESTATION = 2;
    private static final int LAIT_PRODUIT = 100;
    private static final String NOM = "Brebis";
    private static final boolean ESTMALE = false;


    public void manger() {
        super.manger();
    }

    public Brebis() {
        super(NOM, ESTMALE);
    }

    public void vivre() {
        super.vivre(ESPERANCE_VIE, TEMPS_GESTATION);
    }

    @Override
    public void accoupler() {super.accoupler(); }

    /*
    Ovide naissance() {

        if(etatSante.get("aTerme") == 1){
            etatSante.put("gestation", 0);
            etatSante.put("aTerme", 0);
            Random rnd = new Random();
            if(rnd.nextBoolean()) {
                //return new Brebis();
            }
            else {
                //return new Belier();
            }
        }
        else
            throw new SecurityException("La Brebis ne peut pas acouché");

    }*/

    public int produire() {
        if(etatSante.get("repus") != 0){
            etatSante.put("repus" , 0);
            return LAIT_PRODUIT;
        }else
            return 0;
    }

    @Override
    public void mourir() {
        super.mourir();
    }
}
