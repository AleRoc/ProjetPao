package iut.univ_amu.fr.offre;

import iut.univ_amu.fr.PlaceMarche;
import iut.univ_amu.fr.participants.Personne;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;
import java.util.Date;

/**
 ** Created by Roche on 13/12/2016.
 *
 *
 * <b>OffreVente est la classe représentant une offre de vente formulée par un Participant.</b>
 * <p>
 *     Cette offre est déposée sur une place de marché et est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Une personne, c'est le particpant qui a émis cette offre.</li>
 *         <li>Une place de marché, c'est le marché où l'offre à été déposée.</li>
 *         <li>Un libelle, c'est le nom du produit proposé à la vente.</li>
 *         <li>Les produits vendus, c'est la liste de tous les produits du même type (i.e. Lait) proposés à la vente indifféremment de leur date de péremption.</li>
 *         <li>Un prix, c'est le prix de base des produits frais, auquel le contrôleur, lors de la vente, peut appliquer un coefficient réducteur pour les produits les moins frais par exemple.</li>
 *         <li>La date, c'est la date à laquelle l'offre a été émise.</li>
 *         <li>Les offres d'achat, c'est une liste de toutes les offres d'achat qui ont visé cette offre de vente.</li>
 *     </ul>
 * </p>
 *
 * @see PlaceMarche
 * @see Personne
 * @see OffreAchat
 * @see ProduitFermier
 *
 *
 * @author Louis VINCHON
 * @version 1.0
 */

public class OffreVente{

    /**
     * L'offreur, c'est la personne qui a émis cette offre. Cet attribut n'est pas modifiable.
     */
    private Personne offreur;

    /**
     * La place de marché sur laquelle cette offre est enregistrée. Cet attribut n'est pour l'instant pas modifiable.
     */
    private PlaceMarche placeDeMarche;

    /**
     * Le libelle commun aux produits vendus. Cet attribut n'est pas modifiable.
     */
    private String libelle;

    /**
     * La liste des produits vendus. Cet attribut peut être modifié.
     */
    private ArrayList<ProduitFermier> produitsVendus = new ArrayList<>();

    /**
     * Le prix de base choisi par l'offreur. Cet attribut est modifiable.
     */
    private float prix;

    /**
     * La date de dernière émission-modification de cette offre. Cet attribut est automatiquement mis à jour.
     */
    private Date date;

    /**
     * Les offres d'achat visant cette offre. Cet attribut est modifiable.
     */
    private ArrayList<OffreAchat> offresAchat = new ArrayList<>();

    // constructeurs

    /**
     * Constructeur Offrevente.
     *
     * <p>
     *     Ce constructeur renseigne tous les attributs listés ci-dessus pour fournir tous les détails nécessaires à une transaction.
     * </p>
     *
     * @param offreur
     * @param placeDeMarche
     * @param produitsVendus
     * @param prix
     */
    public OffreVente(Personne offreur, PlaceMarche placeDeMarche, ArrayList<ProduitFermier> produitsVendus, float prix) {
        this.offreur = offreur;
        this.placeDeMarche = placeDeMarche;
        this.produitsVendus = produitsVendus;
        this.prix = prix;
        libelle = produitsVendus.get(0).getClass().getName();
        date = new Date();
    }

    // methodes

    @Override
    public String toString() {
        String str1 =  "OffreVente{" +
                         "offreur=" + offreur +
                         ", placeDeMarche=" + placeDeMarche +
                         ", libelle='" + libelle + '\'' +
                         ", produitsVendus=";
        for (ProduitFermier PF : produitsVendus) {
            str1 += " " + PF.toString();
        }
        str1 += "\n";
        str1 += ", prix=" + prix +
                ", date=" + date +
                ", offresAchat=" + offresAchat +
                '}';
        return str1;
    }

    /**
     * Ajoute une offre d'achat à la liste.
     *
     * @param offreA
     */
    public void ajouterOffreAchat (OffreAchat offreA){
        offresAchat.add(offreA);
    }

    /**
     * Retire une offre d'achat de la liste.
     * @param offreA
     */
    public void retirerOffreAchat (OffreAchat offreA) { offreA.supprimer(); }

    /**
     * Ajoute une produit à la liste des produits déjà proposés.
     *
     * @param produits
     */
    public void ajouterProduits (ArrayList<ProduitFermier> produits)
    {
        if (0 < produits.size())
            for (ProduitFermier p : produits)
                produitsVendus.add(p);
    }

    /**
     * Retire un produit de la liste de produits déjà proposés.
     *
     * @param produits
     */
    public void retirerProduits (ArrayList<ProduitFermier> produits){
        if (0 < produits.size())
            for (ProduitFermier p : produits)
                produitsVendus.remove(p);
        if(0 == produitsVendus.size())
            supprimer();
    }

    /**
     * Retire toutes les références à cette offre dans les instances de Personne, OffreAchat et PlaceMarche qui lui sont associées.
     *
     * <p>
     *     Remarque : toutes les offres d'achat qui avaient été formulées pour cette offre sont également supprimées.
     * </p>
     */
    public void supprimer(){
        for(OffreAchat o : offresAchat)
            o.supprimer();
        placeDeMarche.getListeAttente().remove(this);
        placeDeMarche.getListeOffres().remove(this);
        offreur.getOffresV().remove(this);
    }

    //getters

    /**
     * Retourne l'offreur.
     *
     * @return la personne qui a émis cette offre.
     */
    public Personne getOffreur() {
        return offreur;
    }

    /**
     * Retourne la place de marché.
     *
     * @return la place de marché sur laquelle l'offre est actuellement affichée.
     */
    public PlaceMarche getPlaceDeMarche() {
        return placeDeMarche;
    }

    /**
     * Retourne le libelle.
     *
     * @return le libelle commun à la liste de produits vendus.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Retourne la liste de produits vendus.
     *
     * @return la liste de tous les produits que l'offreur souhaite vendre.
     */
    public ArrayList<ProduitFermier> getProduitsVendus() {
        return produitsVendus;
    }

    /**
     * Retourne le prix.
     *
     * @return le prix de base auquel l'offreur souhaite vendre ses produits.
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Retourne la date.
     *
     * @return la date de dernière création-modification de cette offre.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Retourne les offres d'achat.
     *
     * @return toutes les offres d'achat visant cette offre.
     */
    public ArrayList<OffreAchat> getOffresAchat() {
        return offresAchat;
    }

    // setters

    /**
     * Ajuste le prix.
     *
     * @param prix
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }
}
