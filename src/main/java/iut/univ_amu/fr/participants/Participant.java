package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.aminaux.Animal;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.Label;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;


/**
 * Created by louis on 06/12/2016.
 *
 * <b>Participant est la classe abstraite caractérisant les acteurs sur un marché.</b>
 * <p>
 *     Cette classe est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>L'argent, qui est la somme d'argent que possède le participant.</li>
 *         <li>Une liste d'offres d'achat, ce sont toutes les offres d'achat formulées par notre participant et qui sont toujours valides.</li>
 *     </ul>
 * </p>
 *
 * @see OffreAchat
 *
 * @author Louis VINCHON
 * @version 1.0
 */
public abstract class Participant {

    /**
     * La somme d'argent possédée par le participant. Cet attribut est modifiable.
     */
    protected float argent;

    /**
     * La liste des offres d'achat formulée par ce participant. Cet attribut est modifiable.
     */
    protected ArrayList<OffreAchat> offresA = new ArrayList<>();

    protected ArrayList<Animal> mesAnimaux = new ArrayList<>(); //variable test pour le stockage provisoire des animaux et produits
    protected ArrayList<ProduitFermier> mesProduits = new ArrayList<>(); //idem

    // methodes

    /**
     * Prélève un certain montant sur l'argent de ce particpant.
     *
     * @param montant
     * @return true si le prélèvement a pu s'effectuer (fonds suffisants), false sinon (le prélèvement n'est alors pas effectué).
     */
    public boolean prelever(float montant){
        if(argent>=montant){
            argent -= montant;
            return true;
        }
        else
            return false;
    }

    /**
     * Crédite un certain montant sur l'argent de ce participant.
     *
     * @param montant
     */
    public void crediter(float montant){
        argent += montant;
    }

    public void faireOffreAchat(OffreVente offreV, int quantite, ArrayList<Label> labels, float enchere ) {
        if (quantite <= offreV.getProduitsVendus().size()) {
            OffreAchat o = new OffreAchat(offreV, this, quantite, labels, enchere);
            offreV.ajouterOffreAchat(o);
            offresA.add(o);
        }
    }

    /**
     * Retire une offre d'achat de la liste d'offres de ce participant.
     *
     * @param offreA
     */
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

    /**
     * Retourne la liste d'offres d'achat.
     *
     * @return la liste des offres d'achat formulées par ce participant.
     */
    public ArrayList<OffreAchat> getOffresA() {
        return offresA;
    }

    /**
     * Retourne l'argent.
     *
     * @return la somme d'argent que possède actuellement ce particpant.
     */
    public float getArgent() {
        return argent;
    }
}