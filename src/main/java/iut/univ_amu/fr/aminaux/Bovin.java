package iut.univ_amu.fr.aminaux;

/**
 * Created by Sylvai on 05/12/2016.
 */
public abstract class Bovin extends Animal{

    protected static final int ESPERANCE_VIE = 5;
    protected static final int BESOIN_NOURITURE = 20;

    public Bovin(String nom, boolean sexe) {
        super(nom, sexe);
    }
}
