package iut.univ_amu.fr.installations.installationStockage;

import iut.univ_amu.fr.installations.Installation;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class InstallationStockage implements Installation {

    protected static int volMax;
    protected static int vol;

    //protected ArrayList<Produit> stock; TODO produit à créer


    protected abstract void ajouterProduit();
    protected abstract void retirerProduit();
}
