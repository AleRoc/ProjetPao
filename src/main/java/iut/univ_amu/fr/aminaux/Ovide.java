package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public abstract class Ovide extends Animal {
    protected static final int ESPERANCE_VIE = 5;
    protected static final int BESOIN_NOURITURE = 20;
    private static final int VIANDE_PRODUIT = 50;
    //todo changer les variable static

    public Ovide(String nom, boolean sexe) {
        super(nom, sexe);
    }


    public int produireViande() {
        mourir();
        return VIANDE_PRODUIT;
    }
}
