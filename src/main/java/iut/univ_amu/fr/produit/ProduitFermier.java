package iut.univ_amu.fr.produit;

import java.util.ArrayList;

/**
 * Created by louis on 05/12/2016.
 */
public abstract class ProduitFermier {
    @Override
    public String toString() {
        return "ProduitFermier{" +
                "nom='" + nom + '\'' +
                ", dureeVieMax=" + dureeVieMax +
                ", dureeVie=" + dureeVie +
                ", quantite=" + quantite +
                '}';
    }

    private String nom;
    private int dureeVieMax;
    private int dureeVie;
    private int quantite;
    private ArrayList<Label> labels;

    public abstract void validerLabels();

    public void deprecier(){ dureeVie -= 1; }

    public abstract String getNom();
}
