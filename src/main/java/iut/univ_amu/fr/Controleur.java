package iut.univ_amu.fr;


        import iut.univ_amu.fr.marche.PlaceMarche;
        import iut.univ_amu.fr.offre.OffreVente;

        import java.util.ArrayList;

/**
 * Created by Roche on 13/12/2016.
 */
public class Controleur {
    private ArrayList<PlaceMarche> listeMarche;

    public void choisirAcheteur(){

    }

    public void validerOffres(){
        for (PlaceMarche marche : listeMarche){
            for (OffreVente offre : marche.getListeAttente()){
                //TODO conditions
            }

        }

    }
}
