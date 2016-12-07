package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public abstract class Volaille extends Animal{
    protected static final int ESPERANCE_VIE = 5;
    protected static final int BESOIN_NOURITURE = 20;
    protected static final int OEUF_PRODUIT = 4;
    protected static final int VIANDE_PRODUIT = 50;
    //todo changer les valeurs des variables
    public Volaille(String nom, boolean sexe) {
        super(nom, sexe);
    }
    

    void manger() {
        super.manger();
    }

    int produireViande() {
        mourir();
        return VIANDE_PRODUIT;
    }
}
