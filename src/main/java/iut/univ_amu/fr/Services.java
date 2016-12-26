package iut.univ_amu.fr;

import iut.univ_amu.fr.participants.CentraleDAchat;

import java.util.ArrayList;

/**
 * Created by louis on 17/12/2016.
 */
public class Services { //Singleton
    private Services instance = new Services();

    private ArrayList<PlaceMarche> placesMarche = new ArrayList<>();
    private ArrayList<CentraleDAchat> centralesDAchat = new ArrayList<>();

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

    private Services(){}

    public Services getInstance() { return instance; }

    // getters

    public ArrayList<PlaceMarche> getPlacesMarche() {
        return placesMarche;
    }

    public ArrayList<CentraleDAchat> getCentralesDAchat() {
        return centralesDAchat;
    }
}
