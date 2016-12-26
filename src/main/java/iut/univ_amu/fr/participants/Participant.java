package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.Services;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;

import java.util.ArrayList;


/**
 * Created by louis on 06/12/2016.
 */
public abstract class Participant {
    protected float argent;
    protected Services services;

    protected ArrayList<OffreAchat> offresA = new ArrayList<>();

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
        offreA.getOffreV().retirerOffreAchat(offreA);
        this.retirerOffreAchat(offreA);
    }

    // getters

    public ArrayList<OffreAchat> getOffresA() {
        return offresA;
    }

    public float getArgent() {
        return argent;
    }
}