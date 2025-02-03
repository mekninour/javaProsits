import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";
    public void display(){
        System.out.println(zooName+" comporte "+nbrCages+" cages");
    }

    public static void main(String[] args) {
        ZooManagement zoo=new ZooManagement();
        //zoo.display();
        String nom="";
        int nombre=-1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrez le nom du zoo");
            nom=input.nextLine();
        }while(nom.isEmpty());
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrez le nbr de cages");
            nombre=input.nextInt();
        }while(nombre <=0);
        zoo.zooName = nom;
        zoo.nbrCages = nombre;
        zoo.display();

        //prosit2
        /*
        Animal a=new Animal();
        a.family="lion";
        a.age=10;
        a.name="li";
        a.isMammal=true;

        Zoo z=new Zoo();
        z.name=zoo.zooName;
        z.city="tunis";
        z.nbrCages= zoo.nbrCages;
        z.animals[0]=a;
        */

        Animal lion=new Animal("mamifere","li",10,true);
        Zoo myZoo=new Zoo(zoo.zooName,"tunis",zoo.nbrCages);
        myZoo.animals[0]=lion;
        myZoo.displayZoo();

        System.out.println(myZoo);  //affiche @ mais apres l'override affiche l'objet correctement
      //  System.out.println(myZoo.toString());   //affiche @ et apres l'override on en a plus besoin

    }
}