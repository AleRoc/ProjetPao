package iut.univ_amu.fr.installations.installationStockage;

import iut.univ_amu.fr.installations.Installation;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class InstallationStockage implements Installation {

    protected static int VOL_MAX;
    protected static int VOL;

    protected ArrayList<ProduitFermier> stock;


    protected abstract void ajouterProduit();
    protected abstract void retirerProduit();
}
