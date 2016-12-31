package iut.univ_amu.fr.installations;

import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class InstallationProduction implements Installation {
    private static int VOL_MAX;
    private static int VOL_PRODUIT;
    private ArrayList<ProduitFermier> list = new ArrayList<>();

    public void produireViande(){
        //TODO remplir la fonction
    }
    public void produireRessource() {
        //TODO remplir la fonction
    }

    public ArrayList<ProduitFermier> getList() {
        return list;
    }
}
