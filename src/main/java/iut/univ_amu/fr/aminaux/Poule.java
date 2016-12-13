package iut.univ_amu.fr.aminaux;

import java.util.Random;

/**
 * Created by Sylvai on 05/12/2016.
 */
public class Poule extends Volaille {

    private static final int TEMPS_GESTATION = 2;
    private static final int OEUF_PRODUIT = 10;
    private static final String NOM = "Poule";

    public Poule() {
        super(NOM, false);
    }


    public void manger() {
        super.manger();
    }

    public int produire() {
        if(etatSante.get("repus") != 0){
            etatSante.put("repus" , 0);
            return OEUF_PRODUIT;
        }else
            return 0;
    }

    public void vivre() {
        super.vivre(ESPERANCE_VIE,TEMPS_GESTATION);
    }

    @Override
    public void mourir() {
        super.mourir();
    }

    @Override
    public void accoupler() {
        super.accoupler();
    }

    public Volaille naissance() {
        if(etatSante.get("gestation") > 0 && etatSante.get("gestation") <= TEMPS_GESTATION){
            Random rnd = new Random();
            if(rnd.nextBoolean())
                return new Poule();
            else
               return new Coq();
        }
        else{
            etatSante.put("gestation", 0);
            etatSante.put("aTerme", 0);
            throw new SecurityException("La Poule ne peut pas acouché");
        }


    }

}
