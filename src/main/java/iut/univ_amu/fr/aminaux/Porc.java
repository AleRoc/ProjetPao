package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 07/12/2016.
 */
public class Porc extends Porcin {

    private static final String NOM = "Porc";

    public Porc() {
        super(NOM, true);
    }

    void vivre(){
        super.vivre(ESPERANCE_VIE, 0);
    }

    void manger() {
        super.manger();
    }

    void accoupler(Truie truie){
        truie.accoupler();
    }
}
