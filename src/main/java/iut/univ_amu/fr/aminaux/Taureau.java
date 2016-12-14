package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Taureau extends Bovin {
    private static final String NOM = "Taureau";
    private static final String SEXE = "Male";
    private static int nbTaureauConstruit = 1;

    public Taureau() {
        super(nbTaureauConstruit, NOM, SEXE);
        ++nbTaureauConstruit;
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
