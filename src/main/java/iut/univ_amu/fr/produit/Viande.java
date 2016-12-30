package iut.univ_amu.fr.produit;

/**
 * Created by louis on 06/12/2016.
 */
public class Viande extends ProduitFermier {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom = "viande de ";
    @Override
    public void validerLabels() {

    }
}
