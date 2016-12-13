package iut.univ_amu.fr.aminaux;

import java.util.Random;

/**
 * Created by Sylvai on 05/12/2016.
 */
public class Truie extends Porcin {
    private static final int TEMPS_GESTATION = 2;
    private static final int LAIT_PRODUIT = 100;
    private static final String NOM = "Truie";

    public Truie() {
        super(NOM, false);
    }


    void manger() {
        super.manger();
    }

    int produire() {
        if(etatSante.get("repus") != 0){
            etatSante.put("repus" , 0);
            return LAIT_PRODUIT;
        }else
            return 0;
    }

    void vivre() {
        super.vivre(ESPERANCE_VIE,TEMPS_GESTATION);
    }

    @Override
    void mourir() {
        super.mourir();
    }

    @Override
    void accoupler() {
        super.accoupler();
    }

    Porcin naissance() {
        if(etatSante.get("aTerme") == 1){
            etatSante.put("gestation", 0);
            etatSante.put("aTerme", 0);
            Random rnd = new Random();
            if(rnd.nextBoolean()){
                System.out.println("une vache est née");
                return new Truie();
            }
            else{
                System.out.println("un taureau est née");
                return new Porc();
            }
        }
        else{
            throw new SecurityException("La vache ne peut pas acouché");
        }
    }
}
