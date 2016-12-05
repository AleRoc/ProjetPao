package iut.univ_amu.fr.aminaux;
import java.util.Random;

/**
 * Created by Sylvai on 25/11/2016.
 */
public class Vache extends Bovin {

    private static final int TEMPS_GESTATION = 2;
    private static final String NOM = "Vache";

    @Override
    int manger(int stockNouriture) {
        if(stockNouriture - BESOIN_NOURITURE >= 0)
            return stockNouriture - BESOIN_NOURITURE;
        else
            return -1;
    }

    public Vache() {
        super(NOM, false);
    }

    void vivre(int stockNouriture) {
        Random rnd = new Random();
        System.out.print("La vache ");
        if(age < ESPERANCE_VIE ){
            //Gestion reproduction
            if(etatSante.get("gestation") >= TEMPS_GESTATION){
                System.out.print("acouche");
                naissance();
            }else if(etatSante.get("gestation") != 0){
                etatSante.put("gestation", etatSante.get("gestation") + 1 );
                System.out.print(" atttend un enfant depuis " + etatSante.get("gestation") + " ans");
            }
            manger(stockNouriture);
            produire();
            super.vivre();
        //Gestion mort "aléatoire" de la vache
        }else if(age >= ESPERANCE_VIE && etatSante.get("vivant") == 1){
            if(20*age + rnd.nextInt(10+ (age * 20)) > 100)
                mourir();
            else
                super.vivre();
        }else{
            System.out.println(" est morte");
        }
    }

    @Override
    void accoupler() {
        System.out.print("la vache");
        super.accoupler();
    }

    @Override
    void naissance() {
        Random rnd = new Random();
        if(rnd.nextBoolean()){
            System.out.println("une vache est née");
            Vache bebeVache = new Vache();
        }
        else{
            System.out.println("un toraux est née");
            //todo crée toraux
        }
    }

    void produire() {
        System.out.print("La vache produit 100L de laits");
    }

    @Override
    void mourir() {
        super.mourir();
    }
}
