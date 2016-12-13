package iut.univ_amu.fr;

import iut.univ_amu.fr.Offre.OffreVente;

import java.util.ArrayList;

/**
 * Created by Roche on 13/12/2016.
 */
public class PlaceMarche {
    private ArrayList<OffreVente> listeOffres;
    private ArrayList<OffreVente> listeAttente;

    public void ajouterOffreVente (OffreVente nouvOffre){
        int num = 0;
        if (listeOffres.size()==0)
        {
            nouvOffre.setNumero(num);
        }
        else
            for (OffreVente offre : listeOffres)
            {
                if(num != offre.getNumero()){
                    nouvOffre.setNumero(num);
                    break;
                }
                num++;
            }
        listeAttente.add(nouvOffre);
    }

    public void retirerOffreVente (OffreVente offre){
        listeOffres.remove(listeOffres.indexOf(offre));
    }

    public ArrayList<OffreVente> getListeOffres() {
        return listeOffres;
    }

    public void majMarche (OffreVente offre){

    }
}
