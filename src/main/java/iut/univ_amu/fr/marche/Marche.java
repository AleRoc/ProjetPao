package iut.univ_amu.fr.marche;

import java.util.ArrayList;

/**
 * Created by Roche on 14/12/2016.
 */
public class Marche {
    private ArrayList<PlaceMarche> listePlacesMarche;
    private Marche instance;
    private Marche(){}

    public Marche getInstance(){
        if (null == instance)
            return instance = new Marche();
        else
            return instance;
    }

    //getters

    public ArrayList<PlaceMarche> getListePlacesMarche() {
        return listePlacesMarche;
    }
}
