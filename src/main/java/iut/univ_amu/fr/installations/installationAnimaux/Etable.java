package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.*;

import java.util.ArrayList;

/**
 * Created by Roche on 25/11/2016.
 */
public class Etable extends InstallationAnimaux {
    private ArrayList<Bovin> occupants = new ArrayList<>();
    protected int capaciteActuelle = occupants.size();
    protected int capaciteMax;


    public ArrayList<Bovin> getOccupants() {
        return occupants;
    }


}
