package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.Services;
import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;


/**
 * Created by louis on 06/12/2016.
 */
public abstract class Participant {
    protected float argent;
    protected Services services;
    protected ArrayList<OffreAchat> offresA = new ArrayList<>();

    protected ArrayList<Animal> mesAnimaux = new ArrayList<>(); //variable test pour le stockage provisoire des animaux et produits
    protected ArrayList<ProduitFermier> mesProduits = new ArrayList<>(); //idem

    // methodes

    public void prelever(float montant){
        argent -= montant;
    }

    public void crediter(float montant){
        argent += montant;
    }

    public void faireOffreAchat(OffreVente offreV, int quantite, boolean qualite, float enchere ) {
        if (quantite <= offreV.getProduitsVendus().size())
            offreV.ajouterOffreAchat(new OffreAchat(offreV, this, quantite, qualite , enchere));
    }

    public void retirerOffreAchat(OffreAchat offreA){
        offreA.supprimer();
    }

    // methodes test

    public void acquerirAnimal(ArrayList<Animal> animaux){
        if (0 < animaux.size())
            for(Animal a : animaux )
                mesAnimaux.add(a);
    }

    public void acquerirProduit(ArrayList<ProduitFermier> produits){
        if (0 < produits.size())
            for(ProduitFermier p : produits )
                mesProduits.add(p);
    }

    // getters

    public ArrayList<OffreAchat> getOffresA() {
        return offresA;
    }

    public float getArgent() {
        return argent;
    }
}