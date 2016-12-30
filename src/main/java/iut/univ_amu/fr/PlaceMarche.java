package iut.univ_amu.fr;

import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;
import java.util.Map;

/**
 ** Created by Roche on 13/12/2016.
 * <b>PlaceMarche est la classe représentant une place d'échange de produits et animaux.</b>
 * <p>
 *     Cette classe, est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Une liste des offres de vente affichées sur cette place.</li>
 *         <li>Une liste des offres de vente soumises à cette place mais pas encore validées par le controleur.</li>
 *     </ul>
 * </p>
 *
 * @see Controleur
 * @see OffreVente
 *
 * @author Louis VINCHON
 * @version 1.0
 */

public class PlaceMarche {

    /**
     * La liste des offres de vente affichées. Cet attribut est modifiable.
     * <p>
     *     Il s'agit de offres qui ont été validées par le controleur. Ce sont les seulees offres visibles.
     * </p>
     */
    private ArrayList<OffreVente> listeOffres = new ArrayList<>();

    /**
     * la liste des offres en attente de validation. Elles sont invisibles. Cet attribut est modifiable.
     */
    private ArrayList<OffreVente> listeAttente = new ArrayList<>();

    // methodes

    /**
     * Ajoute à la liste d'attente les offres soumises par les Personnes.
     *
     * @see iut.univ_amu.fr.participants.Personne
     *
     * @param nouvOffre
     */
    public void ajouterOffreVente (OffreVente nouvOffre){ listeAttente.add(nouvOffre); }

    /**
     * Retire une offre de vente de toutes les listes de cette place.
     * <p>
     *     Remarque : l'offre n'est pas supprimée, elle existe toujours.
     *     Cette methode ne doit être utilisée que dans le cas d'un déplacement de l'offre sur une autre instance de PlaceMarche.
     * </p>
     *
     * @param offre
     */
    public void retirerOffreVente (OffreVente offre){
        listeAttente.remove(offre);
        listeOffres.remove(offre);
    }

    /**
     * Déplace une offre vente jusqu'à présent en liste d'attente vers la liste affichée.
     * @param offre
     */
    public void majMarche (OffreVente offre){
        listeOffres.add(offre);
        listeAttente.remove(offre);
    }

    /**
     * Vend les biens proposés dans l'offre de vente indiquée aux offres d'achat renseignées dans la Map "produitsAchetés".
     *
     * <p>
     *     La Map "produitsAchetés" a pour key les offres d'achat sélectionnées par le controleur, et en value la liste des produits à attribuer à chacun des Acheteur.
     * </p>
     *
     * @param offreV
     * @param produitsAchetés
     */
    public void vendre (OffreVente offreV, Map<OffreAchat, ArrayList<ProduitFermier>> produitsAchetés){ //pour une offre (produits a,b et c) le controleur aura décidé d'attribuer la vente des produits à tel et tel acheteur (a pour acheteur 1, b pour acheteur 2 et c pour un troisième par exemple)
        for (OffreAchat o : produitsAchetés.keySet() ){
        }
    }

    //getters

    /**
     * Retourne la liste des offres.
     *
     * @return la liste des offres validées et affichées.
     */
    public ArrayList<OffreVente> getListeOffres() {
        return listeOffres;
    }

    /**
     * Retourne la liste d'attente.
     *
     * @return la liste des offres en attente de validation.
     */
    public ArrayList<OffreVente> getListeAttente() {
        return listeAttente;
    }
}
