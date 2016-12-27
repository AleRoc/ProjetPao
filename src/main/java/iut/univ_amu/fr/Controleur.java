package iut.univ_amu.fr;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;

/**
 * Created by Roche on 13/12/2016.
 */
public class Controleur {
    private Services services;

    // methodes

    public void choisirAcheteur(){

        for (PlaceMarche marche : services.getPlacesMarche()){
            for (OffreVente offreV : marche.getListeOffres()){
                for (OffreAchat offreA: offreV.getOffresAchat()){
                }// pour chaque offre d'achat
            }// pour chaque offre de vente
        }// pour chaque place de marche
    }

    public void validerOffres(){
        for (PlaceMarche marche : services.getPlacesMarche()){
            for (OffreVente offreV : marche.getListeAttente()){
                //TODO conditions
                if (offreV.getPrix() <= 0) {//simple validation par le prix : pas de prix nul ou négatif
                    offreV.getOffreur().retirerOffreVente(offreV);
                    marche.retirerOffreVente(offreV);
                }
                else
                    marche.majMarche(offreV);
            }
        }
    }
}
