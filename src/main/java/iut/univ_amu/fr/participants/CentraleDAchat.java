package iut.univ_amu.fr.participants;

import java.util.ArrayList;

/**
 * Created by louis on 06/12/2016.
 */
public class CentraleDAchat extends Participant {

    private ArrayList<Personne> membres;

    @Override
    public void faireOffreAchat() {

    }
    public void ajouterMembre (Personne nouvMemrbe){
        membres.add(nouvMemrbe);
    }

}
