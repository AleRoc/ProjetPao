package iut.univ_amu.fr.produit;

/**
 * Created by louis on 06/12/2016.
 */
public class Vin extends ProduitFermier {
    private String nom = "vin";
    @Override
    public void validerLabels() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
