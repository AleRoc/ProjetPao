package iut.univ_amu.fr.offre;

import iut.univ_amu.fr.participants.CentraleDAchat;
import iut.univ_amu.fr.participants.Participant;
import iut.univ_amu.fr.produit.Label;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Roche on 13/12/2016.
 *
 * <b>OffreAchat est la classe représentant une offre d'achat formulée par un Participant.</b>
 * <p>
 *     Cette offre vise une OffreVente particulière et est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Un libelle, qui sert seulement dans le cas d'une offre formulée au travers d'une centrale d'achat.</li>
 *         <li>Une centrale d'achat, qui sert seulement dans le cas d'une offre formulée au travers d'une centrale d'achat.</li>
 *         <li>Une offre de vente, qui sert seulement dans le cas où l'émetteur de l'offre choisis directement les produits qu'il souhaite acheter, c'est l'offre visée.</li>
 *         <li>Un acheteur, c'est le participant qui emet cette offre.</li>
 *         <li>Une quantité, qui est la quantité de produit que l'acheteur souhaite acquérir.</li>
 *         <li>Des Labels, ce sont les Labels de produit que l'acheteur veut impérativement.</li>
 *         <li>Une enchere, qui est la somme d'argent que l'acheteur est prêt à ajouter au prix annoncé à l'unité.</li>
 *         <li>Un prix maximum ou plafond, qui sert seulement dans le cas d'un offre formulée au travers d'une centrale d'achat : c'est le prix maximum que l'acheteur est prêt à payer (à l'unité)<br/>
 *         pour les achat groupés effectués par la centrale d'achat.</li>
 *     </ul>
 * </p>
 *
 * @see OffreVente
 * @see Participant
 * @see Label
 * @see CentraleDAchat
 *
 * @author Louis VINCHON
 * @version 1.0
 */
public class OffreAchat {

    /**
     * le libelle du produit recherché lorsque cette offre est formulée pour une centrale d'achat. Cet attribut n'est pour le moment pas changeable.
     */
    private String libelle;

    /**
     * Centrale d'achat à laquelle a été soumise cette offre d'achat.
     */
    private CentraleDAchat centrale;
    /**
     * L'offre de vente visée lorsque cette offfre est formulée pour une place de marché. Cet attribut n'est pour le moment pas changeable.
     *
     * @see iut.univ_amu.fr.PlaceMarche
     */
    private OffreVente offreV;

    /**
     * Le Participant qui a émis cette offre d'achat. Cet attribut n'est pas changeable.
     */
    private Participant acheteur;

    /**
     * La quantité de produit désirée. Cette quantité peut être modifiée.
     */
    private int quantité;

    /**
     * Les Labels demandés. Ces Labels peuvent être modifiés.
     */
    private ArrayList<Label> labels = new ArrayList<>();

    /**
     * L'enchere à l'unité que l'acheteur propose pour l'acquisition du produit.
     */
    private float enchere;

    /**
     * Le prix maximum que l'acheteur est prêt à payer pour le produit demandé.
     */
    private float plafond;

    /**
     * La date d'émission de cette offre. Cet attribut est changé automatiquement à chaque modification de l'offre.
     */
    private Date date;

    // methodes

    /**
     * Supprime toutes les références à cette offre dans les instances d' OffreVente, CentraleDAchat et Participant qui lui sont associées.
     */
    public void supprimer(){
        offreV.getOffresAchat().remove(this);
        centrale.getOffresMembres().remove(this);
        acheteur.getOffresA().remove(this);
    }

    /**
     * Modifie la valeur de l'attribut date à la date actuelle.
     */
    private void initDate(){
        date = new Date();
    }

    // constructeurs

    /**
     * Constructeur OffreAchat pour une place de marché.
     *
     * <p>
     *     Ce constructeurs renseigne les attributs utiles à la place de marché.
     *     La date est automatiquement ajoutée.
     * </p>
     *
     * @param offreV
     * @param acheteur
     * @param quantite
     * @param labels
     * @param enchere
     */
    public OffreAchat (OffreVente offreV, Participant acheteur, int quantite, ArrayList<Label> labels, float enchere){
        this.offreV = offreV;
        this.quantité = quantite;
        this.labels = labels;
        this.acheteur = acheteur;
        this.enchere = enchere;
        initDate();
    }

    /**
     * Constructeur OffreAchat pour une centrale d'achat.
     *
     * <p>
     *     Ce constructeur renseigne les attributs utiles à la centrale d'achat.
     *     La date est automatiquement ajoutée.
     * </p>
     *
     * @param libelle
     * @param centrale
     * @param quantité
     * @param labels
     * @param plafond
     */
    public OffreAchat(String libelle, CentraleDAchat centrale,  int quantité, ArrayList<Label> labels, float plafond) {
        this.libelle = libelle;
        this.centrale = centrale;
        this.quantité = quantité;
        this.labels = labels;
        this.plafond = plafond;
        initDate();
    }

    // getters

    /**
     * Retourne le libelle.
     *
     * @return le libelle du produit souhaité en centrale d'achat.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Retourne la centrale.
     *
     * @return la centale à laquelle a été soumise cette offre d'achat
     */
    public CentraleDAchat getCentrale() {
        return centrale;
    }

    /**
     * Retourne l'offre de vente.
     *
     * @return l'offre de vente visée par cette offre d'achat.
     */
    public OffreVente getOffreV() {
        return offreV;
    }

    /**
     * Retourne l'acheteur.
     *
     * @return le participant qui a émis cette offre.
     */
    public Participant getAcheteur() {
        return acheteur;
    }

    /**
     * Retourne la quantité.
     *
     * @return la quantité de produit souhaitée par l'acheteur.
     */
    public int getQuantité() {
        return quantité;
    }

    /**
     * Retourne les Labels.
     *
     * @return les Labels que l'acheteur souhaite "acquérir".
     */
    public ArrayList<Label> getLabels() {
        return labels;
    }

    /**
     * Retourne l'enchere.
     *
     * @return l'enchere proposée par l'acheteur.
     */
    public float getEnchere() {
        return enchere;
    }

    /**
     * Retourne le plafond
     *
     * @return le prix maximum que l'acheteur souhaite dépenser par unité de produit.
     */
    public float getPlafond() {
        return plafond;
    }

    /**
     * Retourne la date.
     *
     * @return la date de la dernière création-modification de l'offre.
     */
    public Date getDate() {
        return date;
    }

    // setters

    /**
     * Ajuste la quantité de produit.
     *
     * @param quantité
     */
    public void setQuantité(int quantité) {
        if(0 < quantité)
            this.quantité = quantité;
        initDate();
    }

    /**
     * Ajuste les Labels.
     *
     * @param labels
     */
    public void setLabels(ArrayList<Label> labels) {
        this.labels = labels;
        initDate();
    }

    /**
     * Ajuste l'enchère.
     *
     * @param enchere
     */
    public void setEnchere(float enchere) {
        this.enchere = enchere;
        initDate();
    }

    /**
     * Ajuste le plafond.
     *
     * @param plafond
     */
    public void setPlafond(float plafond) {
        if(0 < plafond)
            this.plafond = plafond;
        initDate();
    }
}

