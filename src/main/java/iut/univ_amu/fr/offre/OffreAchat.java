package iut.univ_amu.fr.offre;


import iut.univ_amu.fr.participants.Participant;

import java.util.Date;

/**
 * Created by Roche on 13/12/2016.
 */
public class OffreAchat {
    private String libelle;
    private OffreVente offreV;
    private Participant acheteur;
    private int quantité;
    private boolean qualite;
    private float enchere;
    private float plafond;
    private Date date;

    // methodes

    public void supprimer(){
        offreV.getOffreur().getOffresV().remove(this);
        acheteur.getOffresA().remove(this);
    }

    // constructeurs

    public OffreAchat (OffreVente offreV, Participant acheteur, int quantite, boolean qualite, float enchere){ //TODO remplacer qualite par un arraylist de labels, ou la fraicheur(actuellement qualite) serait un label
        this.offreV = offreV;
        this.quantité = quantite;
        this.qualite = qualite;
        this.acheteur = acheteur;
        this.enchere = enchere;
    }

    public OffreAchat(String libelle, int quantité, boolean qualite, float plafond) {
        this.libelle = libelle;
        this.quantité = quantité;
        this.qualite = qualite;
        this.plafond = plafond;
    }

    // getters

    public String getLibelle() {
        return libelle;
    }

    public OffreVente getOffreV() {
        return offreV;
    }

    public Participant getAcheteur() {
        return acheteur;
    }

    public int getQuantité() {
        return quantité;
    }

    public boolean isQualite() {
        return qualite;
    }

    public float getEnchere() {
        return enchere;
    }

    public float getPlafond() {
        return plafond;
    }

    public Date getDate() {
        return date;
    }

    // setters

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public void setQualite(boolean qualite) {
        this.qualite = qualite;
    }

    public void setEnchere(float enchere) {
        this.enchere = enchere;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }
}

