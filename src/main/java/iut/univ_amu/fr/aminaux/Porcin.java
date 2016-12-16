package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public abstract class Porcin extends Animal {
    protected static final int ESPERANCE_VIE = 5;
    protected static final int BESOIN_NOURITURE = 20;
    private static final int VIANDE_PRODUIT = 250;
    //todo changer les variable static
    public Porcin(String nom, boolean estmale) {
        super(nom, estmale);
    }

    public void manger() {
        super.manger();
    }

    public int produireViande() {
        mourir();
        return VIANDE_PRODUIT;
    }
}
