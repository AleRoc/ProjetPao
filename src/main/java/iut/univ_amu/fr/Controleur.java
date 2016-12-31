package iut.univ_amu.fr;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.*;

/**
 * Created by Roche on 13/12/2016.
 *
 * <b>Controleur est la classe représentant l'autorité des marché fermiers (AMF).</b>
 *
 *
 * <p>
 *     Cette classe a pour but de contrôler la validité des offres présentes sur le marché et est caractérisée par les informations suivantes :
 *     <ul>
 *         <li>Une liste des places de marché et centrales d'achat existantes.</li>
 *     </ul>
 * </p>
 *
 * @author Louis VINCHON
 * @version 1.0
 */
public class Controleur {

    /**
     * Les "services" qui est en fait la liste de toutes les places de marché et centrales d'achat en fonctionnement.
     *
     * @see Services
     */
    private Services services;

    // methodes

    /**
     * Choisit les acheteurs pour une offre de vente donnée.
     *
     * <p>
     *     On trie lse offres d'achat selon un critère et on attribue un à un les produits de l'offre de vente, puis on demande à la place de marché de procéder à la vente.
     * </p>
     *
     * @param offreV
     * @param ordre
     */
    public void choisirAcheteurs(OffreVente offreV, String ordre) {
        switch (ordre) {
            case "date":
                Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>() {
                    @Override
                    public int compare(OffreAchat o1, OffreAchat o2) {
                        return o1.getDate().compareTo(o2.getDate());
                    }
                });
                break;
            case "enchere":
                Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>() {
                    @Override
                    public int compare(OffreAchat o1, OffreAchat o2) {
                        return Float.compare(o1.getEnchere(), o2.getEnchere());
                    }
                });
                break;
            case "quantite":
                Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>() {
                    @Override
                    public int compare(OffreAchat o1, OffreAchat o2) {
                        return o1.getQuantité() - o2.getQuantité();
                    }
                });
                break;
            default:
                System.out.println("On ne connait pas cette façon de trier.");
                break;
        }// tri selon l'ordre choisi

        Map<OffreAchat, ArrayList<ProduitFermier>> produitsAV = new TreeMap<>();
        ArrayList<ProduitFermier> produitsVendus = (ArrayList<ProduitFermier>) offreV.getProduitsVendus().clone();

        int num = 0;
        while (0 < produitsVendus.size()) {
            while (0 < produitsVendus.size() || 0 < offreV.getOffresAchat().get(num).getQuantité()) {
                if (!produitsAV.containsKey(offreV.getOffresAchat().get(num))){ //si la map ne contient pas encore cette offre d'achat on l'ajoute
                    produitsAV.put(offreV.getOffresAchat().get(num),new ArrayList<ProduitFermier>());
                }
                else {
                    produitsAV.get(offreV.getOffresAchat().get(num)).add(produitsVendus.get(0));
                    produitsVendus.remove(0);
                }
            }
            ++num;
        }
        offreV.getPlaceDeMarche().vendre(offreV, produitsAV);
    }

    /**
     * Valide les offres d'achat en liste d'attente dans les places de marché.
     *
     * <p>
     *     Pour le moment une seule vérification est faite : tant que le prix n'est pas nul ou négatif l'offre est validée.
     * </p>
     */
    public void validerOffres(){
        for (PlaceMarche marche : services.getPlacesMarche()){
            for (OffreVente offreV : marche.getListeAttente()){
                //TODO conditions
                if (offreV.getPrix() <= 0) {//simple validation par le prix : pas de prix nul ou négatif
                    offreV.supprimer();
                }
                else
                    marche.majMarche(offreV);
            }
        }
    }
}
