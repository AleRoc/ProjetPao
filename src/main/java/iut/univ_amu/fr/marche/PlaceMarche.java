package iut.univ_amu.fr.marche;

import iut.univ_amu.fr.offre.OffreVente;

import java.util.ArrayList;

/**
 ** Created by Roche on 13/12/2016.
 */
public class PlaceMarche {
    private ArrayList<OffreVente> listeOffres;
    private ArrayList<OffreVente> listeAttente;

    public void ajouterOffreVente (OffreVente nouvOffre){
        int num = 1;
        if (listeOffres.size()==0){
            nouvOffre.setNumero(num);
            return;
        }
        else {
            for (OffreVente offre : listeAttente) {
                if (num != offre.getNumero()) {
                    nouvOffre.setNumero(num);
                    return;
                }
                num++;
            }
            nouvOffre.setNumero(num);
        }
        listeAttente.add(nouvOffre);
        listeOffres.sort(OffreVente::compareTo);
    }

    public void retirerOffreVente (OffreVente offre){
        listeOffres.remove(listeOffres.indexOf(offre));
        listeOffres.remove(listeAttente.indexOf(offre));
    }

    public ArrayList<OffreVente> getListeOffres() {
        return listeOffres;
    }

    public ArrayList<OffreVente> getListeAttente() {
        return listeAttente;
    }

    public void majMarche (OffreVente offre){
        listeOffres.add(offre);
        listeAttente.remove(offre);
    }
}
