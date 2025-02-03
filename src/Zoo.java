public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo() {
        animals = new Animal[10];
    }

    public Zoo(String name,String city,int nbrCages) { //ça ecrase le constructeur par defaut
        animals=new Animal[nbrCages];
        this.name=name;
        this.nbrCages=nbrCages;
        this.city=city;
    }
    public void displayZoo() {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("nbrCage: "+nbrCages);
        System.out.println("Animals:");
        for(int i=0;i<animals.length;i++) {
            System.out.println(animals[i]);
        }
    }
    @Override public String toString(){
        String str="animals: ";
        for(int i=0;i<animals.length;i++)
            str+=animals[i];
        return (name+" "+city+" "+nbrCages+" "+str);
    }

}
