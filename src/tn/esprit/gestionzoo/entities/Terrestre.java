package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal{
    private int nbrLegs;
    public Terrestre(){
        super();
    }
    public Terrestre(String family, String name, int age, boolean isMammal,int nbrLegs) {
        super( family,  name,  age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override public String toString(){
        String v;
        if(isMammal){
            v = "Mammal";
        }
        else{
            v = "Non-mammal";
        }
        return (family+" "+name+" "+age+" "+v+" "+nbrLegs);
    }
}
