package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.Adherence;
import iut.univ_amu.fr.PlaceMarche;
import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.installations.Installation;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Personne extends Participant {
    protected String nom;
    protected String prenom;
    protected int age;
    protected ArrayList<OffreVente> offresV = new ArrayList<>();

    protected ArrayList<Installation> propriétés = new ArrayList<>();
    protected ArrayList<Adherence> adherences = new ArrayList<>();

    // methodes

    public void faireOffreVente(PlaceMarche placeDeMarche, ArrayList<ProduitFermier> produits, int prix){
        if(0 < produits.size())
            placeDeMarche.ajouterOffreVente(new OffreVente(this, placeDeMarche, produits, prix));
    }

    public void retirerOffreVente (OffreVente offreV){
        offreV.supprimer();
    }

    public void faireOffreAchat(CentraleDAchat centrale, String libelle, int quantite, boolean qualite, float plafond){ //l'idée est qu'en achetant via une centrale on cherche à faire de l'achat de masse et donc des économies, pas d'enchère donc, seulement un plafond
        centrale.ajouterOffreAdhérent(new OffreAchat(libelle, quantite, qualite, plafond));
    }

    public void adhererCentrale(CentraleDAchat centrale, boolean renouvellement, int duree){
        adherences.add(new Adherence( centrale, this, renouvellement, duree ));
    }

    public void annulerAdherence ( Adherence a){
        a.supprimer();
    }

    // getters

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<OffreVente> getOffresV() {
        return offresV;
    }

    public ArrayList<Installation> getPropriétés() {
        return propriétés;
    }

    public ArrayList<Adherence> getAdherences() {
        return adherences;
    }
}
