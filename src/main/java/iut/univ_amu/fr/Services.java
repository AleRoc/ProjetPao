package iut.univ_amu.fr;

import iut.univ_amu.fr.participants.CentraleDAchat;

import java.util.ArrayList;

/**
 * Created by louis on 29/12/2016.
 */
public class Services {
    private static Services ourInstance = new Services();

    private ArrayList<PlaceMarche> placesMarche = new ArrayList<>();
    private ArrayList<CentraleDAchat> centralesDAchat = new ArrayList<>();

    // methodes

    public void ajouterPlaceDeMarche(PlaceMarche p){
        placesMarche.add(p);
    }
    public void retirerPlaceDeMarche(PlaceMarche p){
        placesMarche.remove(p);
    }

    public void ajouterCentraleDAchat(CentraleDAchat c){
        centralesDAchat.add(c);
    }
    public void retirerCentraleDAchat(CentraleDAchat c){
        centralesDAchat.remove(c);
    }

    // getters

    public ArrayList<PlaceMarche> getPlacesMarche() {
        return placesMarche;
    }

    public ArrayList<CentraleDAchat> getCentralesDAchat() {
        return centralesDAchat;
    }

    // constructeurs

    public static Services getInstance() {
        return ourInstance;
    }

    private Services() {
    }
}
