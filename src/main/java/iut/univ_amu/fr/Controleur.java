package iut.univ_amu.fr;


import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;

import java.util.Collections;
import java.util.Comparator;

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
                                return o1.getDate().compareTo(o2.getDate());
                            }
                        });

                        break;
                    case "enchere" :
                        Collections.sort(offreV.getOffresAchat(), new Comparator<OffreAchat>(){
                            @Override
                            public int compare(OffreAchat o1, OffreAchat o2) {
                                return Float.compare(o1.getEnchere(), o2.getEnchere());
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
                    default :
                        System.out.println("On ne connait pas cette façon de trier.");
                        break;
                }// tri selon les paramètres
            }// pour chaque offre de vente
        }// pour chaque place de marche
    }

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
