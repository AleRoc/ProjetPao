package iut.univ_amu.fr.aminaux;

import java.util.Random;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Brebis extends Ovide {

    private static final int TEMPS_GESTATION = 2;
    private static final int LAIT_PRODUIT = 100;
    private static final String NOM = "Brebis";


    void manger() {
        super.manger();
    }

    public Brebis() {
        super(NOM, false);
    }

    void vivre() {
        super.vivre(ESPERANCE_VIE, TEMPS_GESTATION);
    }

    @Override
    void accoupler() {super.accoupler(); }

    Ovide naissance() {
        if(etatSante.get("gestation") >= TEMPS_GESTATION){
            etatSante.put("gestation", 0);
            Random rnd = new Random();
            if(rnd.nextBoolean())
                return new Brebis();
            else
                return new Belier();
        }
        else
            throw new SecurityException("La vache ne peut pas acouché");

    }

    int produire() {
        if(etatSante.get("repus") != 0){
            etatSante.put("repus" , 0);
            return LAIT_PRODUIT;
        }else
            return 0;
    }

    @Override
    void mourir() {
        super.mourir();
    }
}
