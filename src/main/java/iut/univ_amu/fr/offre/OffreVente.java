package iut.univ_amu.fr.offre;

import iut.univ_amu.fr.PlaceMarche;
import iut.univ_amu.fr.participants.Personne;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 ** Created by Roche on 13/12/2016.
 */

public class OffreVente{
    private Personne offreur;
    private PlaceMarche placeDeMarche;
    private String libelle;
    private ArrayList<ProduitFermier> produitsVendus = new ArrayList<>();
    private float prix;
    private int date;
    private ArrayList<OffreAchat> offresAchat = new ArrayList<>();

    public OffreVente(Personne offreur, PlaceMarche placeDeMarche, ArrayList<ProduitFermier> produitsVendus, float prix) {
        this.offreur = offreur;
        this.placeDeMarche = placeDeMarche;
        this.produitsVendus = produitsVendus;
        this.prix = prix;
        libelle = produitsVendus.get(0).getClass().getName();
    }

    public void ajouterOffreAchat (OffreAchat offreA){
        offresAchat.add(offreA);
    }

    public void retirerOffreAchat (OffreAchat offreA) { offresAchat.remove(offreA); }

    public void ajouterProduits (ArrayList<ProduitFermier> produits)
    {
        if (0 < produits.size())
            for (ProduitFermier p : produits)
                produitsVendus.add(p);
    }

    public void retirerProduits (ArrayList<ProduitFermier> produits){
        if (0 < produits.size())
            for (ProduitFermier p : produits)
                produitsVendus.remove(p);
    }

    //getters

    public Personne getOffreur() {
        return offreur;
    }

    public PlaceMarche getPlaceDeMarche() {
        return placeDeMarche;
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

    public int getDate() {
        return date;
    }

    public ArrayList<OffreAchat> getOffresAchat() {
        return offresAchat;
    }

    // setters

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
