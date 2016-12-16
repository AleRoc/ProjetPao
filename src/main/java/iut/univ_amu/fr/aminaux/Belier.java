package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Belier extends Ovide {
    private static final String NOM = "Belier";
    private static final boolean ESTMALE = true;

    public Belier() {
        super(NOM ,ESTMALE);
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
