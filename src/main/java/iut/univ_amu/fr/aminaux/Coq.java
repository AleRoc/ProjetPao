package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public class Coq extends Volaille {
    private static final String NOM = "Coq";

    public Coq(){
        super(NOM, true);
    }

    void vivre(){
        super.vivre(ESPERANCE_VIE,0);
    }

    void manger() {
        super.manger();
    }

    void accoupler(Poule poule){
        poule.accoupler();
    }

}
