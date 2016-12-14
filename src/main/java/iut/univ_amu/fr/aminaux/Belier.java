package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Belier extends Ovide {
    private static final String NOM = "Belier";
    private static final String SEXE = "Male";
    private static int nbBeliersConstruit = 1;

    public Belier() {
        super(nbBeliersConstruit, NOM, SEXE);
        ++nbBeliersConstruit;
    }

    void vivre(){
        super.vivre(ESPERANCE_VIE,0);
    }

    void manger() {
        super.manger();
    }

    void accoupler(Brebis brebis){
        brebis.accoupler();
    }

}
