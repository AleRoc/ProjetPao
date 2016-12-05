package iut.univ_amu.fr.aminaux;
import java.util.Map;

import java.util.HashMap;

/**
 * Created by Sylvai on 25/11/2016.
 */
public abstract class Animal {
    private String nom;
    private boolean sexe;
    protected int age;
    protected Map<String,Integer> etatSante = new HashMap<String, Integer>(); ;

    int manger( int stockNouriture){
        return 0;
    }

    public Animal(String nom, boolean sexe){
        this.nom = nom;
        this.sexe = sexe;
        etatSante.put("vivant", 1);
        etatSante.put("faim", 0);
        etatSante.put("malade", 0);
        etatSante.put("feconde",0);
        etatSante.put("gestation", 0);
    }

    void vivre(){
        age++;
        System.out.println("vie, elle a " + age + " ans" );
    }

    void accoupler(){
        if(sexe == false){
            System.out.println("va attendre un bébé");
            etatSante.put("gestation", 1);
        }else{
            System.out.println("n'est pas féconde");
        }
    }

    void naissance(){
    }

    void produire(){}

    void mourir(){
        System.out.println("meurt");
        etatSante.put("vivant",0);
    }

    public Map<String, Integer> getEtatSante() {
        return etatSante;
    }


}
