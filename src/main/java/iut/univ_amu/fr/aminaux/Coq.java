package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public class Coq extends Volaille {
    private static final String NOM = "Coq";
    private static final boolean ESTMALE = true;

    public Coq() {
        super(NOM, ESTMALE);
    }

    public void vivre(){
        super.vivre(ESPERANCE_VIE,0);
    }

    public void manger() {
        super.manger();
    }

    public void accoupler(Poule poule){
        poule.accoupler();
    }

}
