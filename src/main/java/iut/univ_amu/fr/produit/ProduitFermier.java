package iut.univ_amu.fr.produit;

import java.util.ArrayList;

/**
 * Created by louis on 05/12/2016.
 */
public abstract class ProduitFermier {
    private int dureeVieMax;
    private int dureeVie;
    private int quantite;
    private ArrayList<Label> labels;

    public abstract void validerLabels();
}
