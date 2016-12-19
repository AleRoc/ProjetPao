package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.marche.PlaceMarche;
import iut.univ_amu.fr.offre.OffreAchat;
import iut.univ_amu.fr.offre.OffreVente;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by Roche on 13/12/2016.
 */
public class Paysan extends Personne{

    @Override
    public void faireOffreAchat(PlaceMarche marche, ArrayList<ProduitFermier> produit, float enchere) {
        mainLoop : for (OffreVente offre : marche.getListeOffres())
            if(offre.getProduitsVendus() == produit) {
                offre.ajouterOffreAchat(new OffreAchat(this, enchere));
                break mainLoop;
            }
    }

    @Override
    public void faireOffreVente() {

    }

    @Override
    public void adhererCentrale(CentraleDAchat centrale) {
        centrale.ajouterMembre(this);
        this.adherences.add(centrale);
    }
}
