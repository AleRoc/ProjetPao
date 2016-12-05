package fr.univ_amu.iut.batiment;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class BatAnimaux implements Batiment {

    protected static int capacite;
    //protected ArrayList<Animal> occupants; TODO une fois la classe Animal

    protected abstract void rentrerAnimaux();
    protected abstract void sortirAnimaux();
}
