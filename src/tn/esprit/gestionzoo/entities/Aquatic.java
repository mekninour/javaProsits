package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){
        super();
    }
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
          super( family,  name,  age, isMammal);
          this.habitat = habitat;
    }
    @Override public String toString(){
        String v;
        if(isMammal){
            v = "Mammal";
        }
        else{
            v = "Non-mammal";
        }
        return (family+" "+name+" "+age+" "+v+" "+habitat);
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
