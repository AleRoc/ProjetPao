package iut.univ_amu.fr;

import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;
import java.util.Map;

/**
 ** Created by Roche on 13/12/2016.
 */

public class PlaceMarche {
    private ArrayList<OffreVente> listeOffres = new ArrayList<>();
    private ArrayList<OffreVente> listeAttente = new ArrayList<>();

    // methodes

    public void ajouterOffreVente (OffreVente nouvOffre){ listeAttente.add(nouvOffre); }

    public void retirerOffreVente (OffreVente offre){
        listeAttente.remove(offre);
        listeOffres.remove(offre);
    }

    public void majMarche (OffreVente offre){
        listeOffres.add(offre);
        listeAttente.remove(offre);
    }

    public void vendre (OffreVente offreV, Map<OffreAchat, ArrayList<ProduitFermier>> produitsAchetés){ //pour une offre (produits a,b et c) le controleur aura décidé d'attribuer la vente des produits à tel et tel acheteur (a pour acheteur 1, b pour acheteur 2 et c pour un troisième par exemple)
        for (OffreAchat o : produitsAchetés.keySet() ){
                o.getAcheteur().acquerirProduit(produitsAchetés.get(o));
        }
    }

    //getters

    public ArrayList<OffreVente> getListeOffres() {
        return listeOffres;
    }

    public ArrayList<OffreVente> getListeAttente() {
        return listeAttente;
    }
}
