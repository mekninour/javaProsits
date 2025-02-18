package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //zoo
        String zooName = "";
        String city = "";
        int nbrCages = -1;

        //animal
        String family;
        String nomAnimal;
        int age;
        String m;
        boolean isMammal = false;
        String habitat;
        float swimmingDepth;
        do {
            System.out.println("Entrez le nom du zoo");
            zooName = input.nextLine();
            System.out.println("Entrez la city du zoo");
            city = input.nextLine();
            System.out.println("Entrez le nbr de cages");
            nbrCages = input.nextInt();
            input.nextLine();
        } while (nbrCages <= 0 || zooName.isEmpty() || city.isEmpty());
        Zoo myZoo = new Zoo(zooName, city);

        System.out.println(myZoo);  //affiche @ mais apres l'override affiche l'objet correctement
        int menu=-1;
        do{
            System.out.println("1-Add animal\n2-Remove animal\n3-Print Zoo info\n4-See if zoo full\n5-Create and display Penguing for exemple\n6-compare swimming function\n0-Exit");
            menu = input.nextInt();
            input.nextLine();
            switch(menu){
                case 1:
                    do {
                        System.out.println("Famille");
                        family = input.nextLine();
                        System.out.println("nomAnimal");
                        nomAnimal = input.nextLine();
                        System.out.println("age");
                        age = input.nextInt();
                        input.nextLine();
                        System.out.println("Mammal ?, O/N");
                        m = input.nextLine();
                        if (m.equalsIgnoreCase("O")) {
                            isMammal = true;
                        } else if (m.equalsIgnoreCase("N")) {
                            isMammal = false;
                        }
                    } while (family.isEmpty() || nomAnimal.isEmpty() || age <= 0);

                    Animal a = new Animal(family, nomAnimal, age, isMammal);
                    if(myZoo.addAnimal(a)){
                        System.out.println("Animal added");
                    }
                    else{
                        System.out.println("Animal not added");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Famille");
                        family = input.nextLine();
                        System.out.println("nomAnimal");
                        nomAnimal = input.nextLine();
                        System.out.println("age");
                        age = input.nextInt();
                        input.nextLine();
                        System.out.println("Mammal ?, O/N");
                        m = input.nextLine();
                        if (m.equalsIgnoreCase("O")) {
                            isMammal = true;
                        } else if (m.equalsIgnoreCase("N")) {
                            isMammal = false;
                        }
                    } while (family.isEmpty() || nomAnimal.isEmpty() || age <= 0);

                    Animal r = new Animal(family, nomAnimal, age, isMammal);
                    if(myZoo.removeAnimal(r)){
                        System.out.println("Animal Removed");
                    }
                    else{
                        System.out.println("Animal not Removed");
                    }
                    break;
                case 3:
                    myZoo.displayZoo();
                break;
                case 4:
                    if(myZoo.isZooFull()){
                        System.out.println("Zoo full");
                    }
                    else{
                        System.out.println("Zoo not full");
                    }
                    break;
                case 5:
                    do {
                        System.out.println("Famille");
                        family = input.nextLine();
                        System.out.println("nomAnimal");
                        nomAnimal = input.nextLine();
                        System.out.println("age");
                        age = input.nextInt();
                        input.nextLine();
                        System.out.println("Mammal ?, O/N");
                        m = input.nextLine();
                        if (m.equalsIgnoreCase("O")) {
                            isMammal = true;
                        } else if (m.equalsIgnoreCase("N")) {
                            isMammal = false;
                        }

                        System.out.println("habitat");
                        habitat = input.nextLine();

                        System.out.println("swimmingDepth");
                        swimmingDepth = input.nextFloat();

                    } while (family.isEmpty() || nomAnimal.isEmpty() || age <= 0);
                    Penguing p=new Penguing( family,  nomAnimal,  age, isMammal, habitat, swimmingDepth);
                    System.out.println(p.toString());
                    break;
                case 6:
                    Aquatic aquatic=new Aquatic();
                    Penguing penguing=new Penguing();
                    Dolphin dolphin=new Dolphin();
                    aquatic.swim();
                    penguing.swim();
                    dolphin.swim();
                    break;
            }
        }while(menu!=0);

    }
}