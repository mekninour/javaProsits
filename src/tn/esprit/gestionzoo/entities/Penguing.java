package tn.esprit.gestionzoo.entities;

public class Penguing extends Aquatic{
    private float swimmingDepth;
    public Penguing(){
        super();
    }
    public Penguing(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super( family,  name,  age, isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override public String toString(){
        String v;
        if(isMammal){
            v = "Mammal";
        }
        else{
            v = "Non-mammal";
        }
        return (family+" "+name+" "+age+" "+v+" "+habitat+" "+swimmingDepth);
    }
}
