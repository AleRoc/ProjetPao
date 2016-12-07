package iut.univ_amu.fr.aminaux;
import java.util.Map;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Sylvai on 25/11/2016.
 */
public abstract class Animal {
    private String nom;
    private boolean sexe;
    protected int age;
    protected Map<String,Integer> etatSante = new HashMap<String, Integer>(); ;

    void manger(){
        etatSante.put("repus",1);
    }

    public Animal(String nom, boolean sexe){
        this.nom = nom;
        this.sexe = sexe;
        etatSante.put("vivant", 1);
        etatSante.put("repus", 0);
        etatSante.put("gestation", 0);
    }

    void vivre(int esperanceVie, int tempsGestation){
        Random rnd = new Random();
        if(age < esperanceVie ){
            //Gestion reproduction
            if(etatSante.get("gestation") != 0 && etatSante.get("gestation") <= tempsGestation) {
                etatSante.put("gestation", etatSante.get("gestation") + 1);
            }
            age++;
            //Gestion mort "aléatoire" de la vache
        }else if(age >= esperanceVie && etatSante.get("vivant") == 1){
            if(20*age + rnd.nextInt(10+ (age * 20)) > 100)
                mourir();
            else
                age++;
        }
    }

    void accoupler(){
        etatSante.put("gestation", 1);
    }

    void mourir(){
        System.out.println("meurt");
        etatSante.put("vivant",0);
    }

}
