package iut.univ_amu.fr.aminaux;
import java.util.Map;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Sylvai on 25/11/2016.
 */
public abstract class Animal {
    private int numA;
    private String nom;
    private String sexe;
    private String etat;
    protected int age;
    protected Map<String,Integer> etatSante = new HashMap<String, Integer>();

    //TODO que signifie l'integer de la Map ?
    //TODO la classe est belier est celle de référence il faut la rendre la plus simple possible.
    //TODO le nom et le sexe et le num sont définis automatiquement en fonction du constructeur qu'on utilise
    //J'ai mis une variable etat et passer Sexe en String ce qui est plus conforme

    void manger(){
        etatSante.put("repus", 1);
    }

    public Animal(int numA, String nom, String sexe){
        this.numA = numA;
        this.nom = nom;
        this.sexe = sexe;
        etatSante.put("vivant", 1);
        etatSante.put("repus", 0);
        if(sexe == "femelle"){
            etatSante.put("gestation", 0);
            etatSante.put("aTerme", 0);
        }
    }

    public void vivre(int esperanceVie, int tempsGestation){
        Random rnd = new Random();
        if(age < esperanceVie ){
            //Gestion reproduction
            if(etatSante.get("gestation") != 0 && etatSante.get("gestation") <= tempsGestation)
                etatSante.put("gestation", etatSante.get("gestation") + 1);
            else if(etatSante.get("gestation") != 0 && etatSante.get("gestation") >= tempsGestation)
                etatSante.put("aTerme",1);
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

    public boolean isMale() {
        if (sexe == "male") return true;
        else return false;
    }
    public boolean isFemelle() {
        if (sexe == "femelle") return true;
        else return false;
    }

    public int statusGestation(int tempsGestation){
        if(etatSante.get("gestation") == 0)
            return 0;
        else if (etatSante.get("gestation") <= tempsGestation)
            return 1;
        else
            return 2;

    }


    public String getNom() {
        return nom;
    }

    public int getNumA() {
        return numA;
    }
}
