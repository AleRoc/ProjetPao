package iut.univ_amu.fr.participants;

import iut.univ_amu.fr.marche.Marche;
import iut.univ_amu.fr.marche.PlaceMarche;
import iut.univ_amu.fr.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public abstract class Participant {
    protected String nom;
    private Marche marche;
    public abstract void faireOffreAchat(PlaceMarche marche, ArrayList<ProduitFermier> produit, float enchere);
}