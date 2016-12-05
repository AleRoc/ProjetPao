package fr.univ_amu.iut.batiment;

/**
 * Created by Roche on 25/11/2016.
 */
public abstract class BatStockage implements Batiment {

    protected static int volStockage;
    protected static int qtéStockée;


    protected abstract void mettreEnStock();
}
