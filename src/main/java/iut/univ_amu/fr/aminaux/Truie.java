package iut.univ_amu.fr.aminaux;

import java.util.Random;

/**
 * Created by Sylvai on 05/12/2016.
 */
public class Truie extends Porcin {
    private static final int TEMPS_GESTATION = 2;
    private static final int LAIT_PRODUIT = 100;
    private static final String NOM = "Truie";
    private static final String SEXE = "Femelle";
    private static int nbTruieConstruit = 1;

    public Truie() {
        super(nbTruieConstruit, NOM, SEXE);
        ++nbTruieConstruit;
    }


    public void manger() {
        super.manger();
    }

    public int produire() {
        if(etatSante.get("repus") != 0){
            etatSante.put("repus" , 0);
            return LAIT_PRODUIT;
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

    Porcin naissance() {
        if(etatSante.get("aTerme") == 1){
            etatSante.put("gestation", 0);
            etatSante.put("aTerme", 0);
            Random rnd = new Random();
            if(rnd.nextBoolean()){
                System.out.println("une truie est née");
                return new Truie();
            }
            else{
                System.out.println("un porc est né");
                return new Porc();
            }
        }
        else{
            throw new SecurityException("Le porc ne peut pas acouché");
        }
    }
}
