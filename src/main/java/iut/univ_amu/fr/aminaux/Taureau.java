package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Taureau extends Bovin {
    private static final String NOM = "Taureau";

    public Taureau() {
        super(NOM, true);
    }

    public void vivre(){
        super.vivre(ESPERANCE_VIE, 0);
    }

    public void manger() {
        super.manger();
    }

   public void accoupler(Vache vache){
        vache.accoupler();
    }
}
