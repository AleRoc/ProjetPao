package iut.univ_amu.fr.participants;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.Adherence;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 *
 * <b>CentraleDAchat est la classe représentant les centrales qui font des achats groupés pour leurs membres.</b>
 * <p>
 *     Cette classe est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Une liste des adhérences.</li>
 *         <li>Une liste des offers d'achat de ses adhérents.</li>
 *         <li>Une cotisation, qui est le prix de l'adhérence.</li>
 *         <li>Une durée, exprimée en jours, d'adhérence.</li>
 *     </ul>
 *     Elle a pour objectif de regouper les demandes des membres en une seule grosse offre d'achat et ainisi obtenir des réductions de prix à l'unité compte tenu du volume important des offres de la centrale.
 * </p>
 *
 * Quand une personne veut adhérer, elle paie la cotisation et est inscrite pour duree jours.
 *
 * @author Louis VINCHON
 * @version 1.0
 */
public class CentraleDAchat extends Participant {

    /**
     * La liste des adhérences. Cet attribut peut être modifié.
     *
     * @see Adherence
     */
    private ArrayList<Adherence> adherences;

    /**
     * La liste des offres d'achat formulées par ses membres. Cet attribut peut être modifié.
     *
     * @see OffreAchat
     * @see Personne
     */
    private ArrayList<OffreAchat> offresMembres;

    /**
     * La cotisation. Cet attribut peut être modifié.
     */
    private float cotisation;

    /**
     * La durée d'adhérence accordée pour une personne payant une fois la cotisation. Cet attribut peut être changé.
     */
    private static int duree = 30;

    // methodes

    /**
     * Ajoute une nouvelle adhérence.
     *
     * @param adherence
     */
    public void ajouterAdherence (Adherence adherence){
        adherences.add(adherence);
    }

    /**
     * Retire une adhérence, elle est alors supprimée.
     *
     * @param a
     */
    public void retirerAdherence (Adherence a){
        a.supprimer();
    }

    /**
     * Ajoute une offre d'achat formulée par un adhérent.
     *
     * <p>
     *     Remarque : cette "offre" peut simplement être vue comme une demande ou un souhait.
     * </p>
     * @param o
     */
    public void ajouterOffreAdhérent (OffreAchat o){
        offresMembres.add(o);
    }

    /**
     * Retire une offre d'achat formulée par un adhérent.
     *
     * @param o
     */
    public void retirerOffreAdhérent (OffreAchat o){
        o.supprimer();
    }

    /**
     * Créée une offre d'achat à partir de plusieurs offres d'adhérents.
     */
    public void grouperOffres (){
        for ( OffreAchat offreA : offresMembres){
            //TODO trouver des offres de vente correspondantes, garder les plus intéressantes et créér des offres d'achat (qui iront dans l'arraylist<offreAchat> de la centrale (défini dans participant)) qui vont bien.
        }
    }

    /**
     * Vérifie que les adhérences sont à jour, renouvelle ou annule l'adhérence selon les informations renseignées par l'adhérent.
     *
     * @see Adherence
     */
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

    /**
     * Retourne les adhérences.
     * @return la liste des adhérences.
     */
    public ArrayList<Adherence> getAdherences() {
        return adherences;
    }

    /**
     * Retourne les offres des membres
     *
     * @return la liste des "souhaits" formulés apr les membres.
     */
    public ArrayList<OffreAchat> getOffresMembres() {
        return offresMembres;
    }

    /**
     * Retourne la cotisation.
     *
     * @return le montant à payer pour adhérer à la centrale.
     */
    public float getCotisation() {
        return cotisation;
    }

    /**
     * Retourne la durée.
     *
     * @return la durée d'inscription correspondant au paiement d'une cotisation.
     */
    public static int getDuree() {
        return duree;
    }
}
