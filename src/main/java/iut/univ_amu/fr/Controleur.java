package iut.univ_amu.fr;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Roche on 13/12/2016.
 */
public class Controleur {
    private Services services;

    // methodes

    public void choisirAcheteur(String ordre){
        for (PlaceMarche marche : services.getPlacesMarche()){
            for (OffreVente offreV : marche.getListeOffres()){
                switch(ordre){
                    case "date" :
                        Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>(){
                            @Override
                            public int compare(OffreAchat o1, OffreAchat o2) {
                                if (o1.getDate().before(o2.getDate())) {
                                    return -1;
                                } else if (o1.getDate().after(o2.getDate())) {
                                    return 1;
                                } else {
                                    return 0;
                                }
                            }
                        });
                        break;
                    case "enchere" :
                        Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>(){
                            @Override
                            public int compare(OffreAchat o1, OffreAchat o2) {
                                return Float.compare(o1.getEnchere(), o2.getEnchere()); //a tester mais sa me semble pas terrible
                            }
                        });
                        break;
                    case "quantite" :
                        Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>(){
                            @Override
                            public int compare(OffreAchat o1, OffreAchat o2) {
                                return o1.getQuantité() - o2.getQuantité();
                            }
                        });
                        break;
                    default:
                        System.out.println("On ne connait pas cette façon de trier.");
                        break;
                }
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
                    offreV.supprimer();
                    marche.retirerOffreVente(offreV);
                }
                else
                    marche.majMarche(offreV);
            }
        }
    }
}
