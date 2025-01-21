import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";
    public void display(){
        System.out.println(zooName+" comporte "+nbrCages+" cages");
    }
    public static void main(String[] args) {
        ZooManagement zoo=new ZooManagement();
        zoo.display();
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
    }
}