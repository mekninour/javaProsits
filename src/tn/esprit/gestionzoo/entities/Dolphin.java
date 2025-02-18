package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;
    public Dolphin(){
        super();
    }
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed) {
        super( family,  name,  age, isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override public String toString(){
        String v;
        if(isMammal){
            v = "Mammal";
        }
        else{
            v = "Non-mammal";
        }
        return (family+" "+name+" "+age+" "+v+" "+habitat+" "+swimmingSpeed);
    }
    @Override public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
