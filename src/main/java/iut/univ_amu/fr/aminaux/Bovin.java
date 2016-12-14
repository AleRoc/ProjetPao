package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public abstract class Bovin extends Animal{

    protected static final int ESPERANCE_VIE = 5;
    protected static final int BESOIN_NOURITURE = 20;
    protected static final int VIANDE_PRODUIT = 50;
    //todo changer les variable static

    public Bovin(int num, String nom, String sexe) {
        super(num, nom, sexe);
    }

    void manger() {super.manger();}

    int produireViande() {
        mourir();
        return VIANDE_PRODUIT;
    }
}
