package iut.univ_amu.fr.participants;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.Adherence;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public class CentraleDAchat extends Participant {

    private ArrayList<Adherence> adherences;
    private ArrayList<OffreAchat> offresMembres;
    private float cotisation;
    private static int duree = 30;

    // methodes

    public void ajouterAdherence (Adherence adherence){
        adherences.add(adherence);
    }

    public void retirerAdherence (Adherence a){
        a.supprimer();
    }

    public void ajouterOffreAdhérent (OffreAchat o){
        offresMembres.add(o);
    }

    public void retirerOffreAdhérent (OffreAchat o){
        o.supprimer();
    }

    public void grouperOffres (){
        for ( OffreAchat offreA : offresMembres){
            //TODO trouver des offres de vente correspondantes, garder les plus intéressantes et créér des offres d'achat (qui iront dans l'arraylist<offreAchat> de la centrale (défini dans participant)) qui vont bien.
        }
    }

    public void controlerCotisations(){
        for(Adherence a : adherences){
            if(0 == a.getDuree() && true == a.getRenouvellement() && a.getAdherent().getArgent() >= cotisation) { // si l'adhérence arrive à terme on renouvelle si cela est autorisé par l'adhérent et si l'adhérent a suffisamment de fonds
                a.getAdherent().prelever(cotisation);
                this.crediter(cotisation);
                a.setDuree(duree);
            }
            else {// sinon l'adhérence est annulée
                a.supprimer();
            }
        }
    }

    // getters

    public ArrayList<Adherence> getAdherences() {
        return adherences;
    }

    public ArrayList<OffreAchat> getOffresMembres() {
        return offresMembres;
    }

    public float getCotisation() {
        return cotisation;
    }

    public static int getDuree() {
        return duree;
    }
}
