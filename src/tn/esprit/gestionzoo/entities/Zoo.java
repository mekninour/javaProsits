package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private static int counter = 0;

    public Zoo(String name,String city) { //ça ecrase le constructeur par defaut
        animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;
    }
    public void displayZoo() {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("nbrCage: "+nbrCages);
        System.out.println("Animals:");
        for(int i=0;i<counter;i++) {
            System.out.println(animals[i]);
        }
    }
    @Override public String toString(){
        String str="animals: ";
        for(int i=0;i<counter;i++)
            str+=animals[i];
        return (name+" "+city+" "+nbrCages+" "+str);
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal)==-1&&!isZooFull()) {
            animals[counter]=animal;
            counter++;
            return true;
        }
        else {
            return false;
        }
    }
    public int searchAnimal(Animal animal){
        int i=0;
        boolean found=false;
        while(!found&&i<counter){
            if(this.animals[i].getName().equalsIgnoreCase(animal.getName())){
                found=true;
            }
            else {
                i++;
            }
        }
        if(found){
            return i;
        }
        else{
            return -1;
        }
    }
    public boolean removeAnimal(Animal animal){
        int i=searchAnimal(animal);
        if(i!=-1) {
            if(i==counter-1) {
                animals[i]=animals[i+1];
            }
            else{
                animals[i]=null;
            }
            counter--;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isZooFull(){
        if(nbrCages==counter) {
            return true;
        }
        else {
            return false;
        }
    }
    Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.counter>z2.counter) {
            return z1;
        }
        else{
            return z2;
        }
    }
}
