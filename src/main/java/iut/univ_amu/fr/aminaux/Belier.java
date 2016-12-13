package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Belier extends Ovide {

    private static final String NOM = "Belier";

    public Belier(){
        super(NOM, true);
    }

    public void vivre(){
        super.vivre(ESPERANCE_VIE,0);
    }

    public void manger() {
        super.manger();
    }

    public void accoupler(Brebis brebis){
        brebis.accoupler();
    }

}
