package iut.univ_amu.fr.produit;

import java.util.ArrayList;

/**
 * Created by louis on 05/12/2016.
 */
public abstract class ProduitFermier {
    private String nom;
    private int dureeVieMax;
    private int dureeVie;
    private int quantite;
    private ArrayList<Label> labels;

    public abstract void validerLabels();

    public void deprecier(){ dureeVie -= 1; }

    public int getDureeVieMax() {
        return dureeVieMax;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public int getQuantite() {
        return quantite;
    }

    public ArrayList<Label> getLabels() {
        return labels;
    }

    @Override
    public String toString() {
        return "ProduitFermier{" +
                "nom='" + nom + '\'' +
                ", dureeVieMax=" + dureeVieMax +
                ", dureeVie=" + dureeVie +
                ", quantite=" + quantite +
                '}';
    }
}
