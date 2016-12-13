package iut.univ_amu.fr.Offre;

import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by Roche on 13/12/2016.
 */
public class OffreVente {
    private int numero;
    private String libelle;
    private ArrayList<ProduitFermier> produitsVendus;
    private float prix;
    private int date;
    private ArrayList<OffreAchat> offresAchat;

    public OffreVente (ArrayList<ProduitFermier> produits, float prix){
        produitsVendus = produits;
        this.prix = prix;
        libelle = produits.get(0).getClass().getName();
    }

    public void ajouterOffreAchat ( OffreAchat offre){
        offresAchat.add(offre);
    }

    //getters

    public int getNumero() {
        return numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public ArrayList<ProduitFermier> getProduitsVendus() {
        return produitsVendus;
    }

    public float getPrix() {
        return prix;
    }

    public ArrayList<OffreAchat> getOffresAchat() {
        return offresAchat;
    }

    //setters

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
