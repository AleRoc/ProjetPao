package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.marche.PlaceMarche;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public class CentraleDAchat extends Participant {

    private ArrayList<Personne> membres;
    //TODO Comment la centrale d'achat peut-elle savoir ce que veut ses membres. Il faudrait une liste d'OffreVente que les membres proposeraient et la centrale d'achat saurait quoi demander à acheter

    public void ajouterMembre (Personne nouvMemrbe){
        membres.add(nouvMemrbe);
    }

    @Override
    public void faireOffreAchat(PlaceMarche marche, ArrayList<ProduitFermier> produit, float enchere) {

    }
}
