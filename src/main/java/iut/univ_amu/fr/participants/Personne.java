package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.Adherence;
import iut.univ_amu.fr.PlaceMarche;
import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.installations.Installation;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.Label;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 *
 * <b>Personne est la classe abstraite caractérisant les personnes physiques sur un marché.</b>
 * <p>
 *     Cette classe, en plus des caractéristiques héritées de Participant, est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Une nom, le nom de famille de cette personne.</li>
 *         <li>Un prénom, le prénom de cette personne.</li>
 *         <li>Un age, l'age de cette personne.</li>
 *         <li>Une liste des offres de vente formulées par cette personne.</li>
 *         <li>Une liste des propriétés de cette personne.</li>
 *         <li>Une liste des adhérences de cette personne.</li>
 *     </ul>
 * </p>
 *
 * @see Participant
 * @see Personne
 * @see Adherence
 * @see Installation
 *
 *
 * @author Louis VINCHON
 * @version 1.0
 */
public abstract class Personne extends Participant {

    /**
     * Le nom de cette personne. Cet attribut n'est pas modifiable.
     */
    protected String nom;

    /**
     * Le prénom de cette personne. Cet attribu n'est pas modifiable.
     */
    protected String prenom;

    /**
     * L'age de cette personne. Cet attribut n'est pas modifiable et n'est pour le moment pas mis à jour.
     */
    protected int age;

    /**
     * La liste des offres de vente formulées par cette personne. Cet attribut est modifiable.
     */
    protected ArrayList<OffreVente> offresV = new ArrayList<>();

    /**
     * La liste des installations que possède cette personne.
     *
     * <p>
     *     Les produits et animaux sont stockés dans ces installations.
     * </p>
     *
     * @see Installation
     */
    protected ArrayList<Installation> propriétés = new ArrayList<>();

    /**
     * La liste des adhérences de cette personne.
     *
     * @see Adherence
     */
    protected ArrayList<Adherence> adherences = new ArrayList<>();

    // methodes

    /**
     * Soumet une nouvelle offre de vente à la place de marché indiquée.
     *
     * <p>
     *     L'offre n'est créée qu'à condition d'avoir au moins un produit proposé à la vente.
     * </p>
     *
     * @param placeDeMarche
     * @param produits
     * @param prix
     */
    public void faireOffreVente(PlaceMarche placeDeMarche, ArrayList<ProduitFermier> produits, int prix){
        if(0 < produits.size())
            placeDeMarche.ajouterOffreVente(new OffreVente(this, placeDeMarche, produits, prix));
    }

    /**
     * Retire l'offre de vente de la liste. Cette offre est pour cela supprimée.
     *
     * @param offreV
     */
    public void retirerOffreVente (OffreVente offreV){
        offreV.supprimer();
    }

    /**
     * Soumet une offre d'achat à la place de marché indiquée.
     *
     * <p>
     *     Il s'agit d'une surcharge de la méthode faireOffreAchat() présente dans Participant.
     *     Elle permet à une personne physique d'indiquer à une centrale d'achat (elle aussi un participant) ce qu'elle souhaite acheter et jusqu'à quel prix elle est prête à monter pour l'obtenir.
     * </p>
     *
     * @param centrale
     * @param libelle
     * @param quantite
     * @param labels
     * @param plafond
     */
    public void faireOffreAchat(CentraleDAchat centrale, String libelle, int quantite, ArrayList<Label> labels, float plafond){
        centrale.ajouterOffreAdhérent(new OffreAchat(libelle, centrale, quantite,labels,plafond));
    }

    /**
     * Inscrit cette personne dans la liste d'adhérents de la centrale indiquée en ajoutant une instance d'Adhérence aussi bien chez la centrale que chez cette personne.
     *
     * @see Adherence
     *
     * @param centrale
     * @param renouvellement
     * @param duree
     */
    public void adhererCentrale(CentraleDAchat centrale, boolean renouvellement, int duree){
        adherences.add(new Adherence( centrale, this, renouvellement, duree ));
    }

    /**
     * Annule l'adhérence indiquée. Elle est alors retirée de la liste.
     *
     * @param a
     */
    public void annulerAdherence ( Adherence a){
        a.supprimer();
    }

    // getters

    /**
     * Retourne le nom.
     *
     * @return le nom de cette personne.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prénom.
     *
     * @return le prénom de cette personne.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne l'age.
     *
     * @return l'age de cette personne.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retourn la liste d'offres de vente.
     *
     * @return la liste des offres de vente formulées par cett personne.
     */
    public ArrayList<OffreVente> getOffresV() {
        return offresV;
    }

    /**
     * Retourne les propriétés.
     *
     * @return la liste des installation possédées par cette personne.
     */
    public ArrayList<Installation> getPropriétés() {
        return propriétés;
    }

    /**
     * Retourne les adhérences.
     *
     * @return la liste des adhérences de cette personne.
     */
    public ArrayList<Adherence> getAdherences() {
        return adherences;
    }
}
