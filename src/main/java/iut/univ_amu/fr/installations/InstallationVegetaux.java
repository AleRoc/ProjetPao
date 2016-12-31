package iut.univ_amu.fr.installations;

import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by louis on 05/12/2016.
 */
public class InstallationVegetaux {
    private static int VOL_MAX;
    private static int VOL_PRODUIT;
    private ArrayList<ProduitFermier> list = new ArrayList<>();



    public ArrayList<ProduitFermier> getList() {
        return list;
    }
}
