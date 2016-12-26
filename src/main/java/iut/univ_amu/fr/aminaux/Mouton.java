package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Mouton extends Ovide {
    private static final String NOM = "Belier";
    private static final boolean ESTMALE = true;

    public Mouton() {
        super(NOM ,ESTMALE);
    }

    void vivre(){
        super.vivre(ESPERANCE_VIE,0);
    }

    @Override
    public String toString() {
        String sexe;
        if (ESTMALE) sexe = "male";
        else sexe = "femelle";
        return NOM  + " " + sexe + " ";
    }

    void manger() {
        super.manger();
    }

    void accoupler(Brebis brebis){
        brebis.accoupler();
    }

}
