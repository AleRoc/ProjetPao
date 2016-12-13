package iut.univ_amu.fr.installations.installationAnimaux;

import iut.univ_amu.fr.aminaux.*;
import iut.univ_amu.fr.installations.Installation;

import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class InstallationAnimaux implements Installation {

    protected static int CAPACITEOPTIMAL;
    protected static int CAPACITEMAXIMAL;


    protected ArrayList<Animal> occupants = new ArrayList<Animal>();

    protected void ajouterAnimal(Animal animal){
        occupants.add(animal);
    }
    protected void retirerAnimal(Animal animal){
        if(occupants.contains(animal)){
            int index = occupants.indexOf(animal);
            occupants.remove(index);
        }else
            throw new IllegalAccessError("l'animal n'existe pas");
    }
    protected void jourFermier(){
        for(Animal a : occupants ) {
           int race = identifierAnimal(a);
            switch (race){
                case 10:
                    Belier belier = (Belier) a;
                    belier.vivre();
                    break;
                case 11:
                    Brebis brebis = (Brebis) a;
                    brebis.vivre();
                    break;
                case 20:
                    Coq coq = (Coq) a;
                    coq.vivre();
                    break;
                case 21:
                    Poule poule = (Poule) a;
                    poule.vivre();
                    break;
                case 30:
                    Porc porc = (Porc) a;
                    porc.vivre();
                    break;
                case 31:
                    Truie truie = (Truie) a;
                    truie.vivre();
                    break;
                case 40:
                    Taureau taureau = (Taureau) a;
                    taureau.vivre();
                    break;
                case 41:
                    Vache vache = (Vache) a;
                    vache.vivre();
                    break;
            }
        }
    }
    public int identifierAnimal(Animal a){
        if(a instanceof Belier)
            return 10;
        else if(a instanceof Brebis)
            return 11;
        else if(a instanceof Coq)
            return 20;
        else if(a instanceof Poule)
            return 21;
        else if(a instanceof Porc)
            return 30;
        else if(a instanceof Truie)
            return 31;
        else if(a instanceof Taureau)
            return 40;
        else if(a instanceof Vache)
            return 41;
        else
            throw  new IllegalAccessError("l'animal n'est pas connu");

    }
    protected void nourireOccupants(){

    }
    protected void naissanceOccupants(){

    }

    public void affichierAbitant(){
        for(Animal a : occupants ){
            System.out.println(a.getNom() + a.isSexe());
        }
    }
}
