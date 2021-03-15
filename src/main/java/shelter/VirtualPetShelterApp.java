package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter theHerd = new VirtualPetShelter();

        VirtualPet pet1 = new OrganicCat("Sammy", "A siamese with a cocky attitude!", 40, 40, 60, 50);
        VirtualPet pet2 = new OrganicCat("Polly", "This puss is super friendly; she loves kisses and crackers.", 40, 40, 50, 50);
        VirtualPet pet3 = new RoboticCat("Tommy", "A tabby who's hobbies include fetching, napping, cuddling, and purring.", 50, 50, 40);
        VirtualPet pet4 = new OrganicDog("Earl", "Poor old Earl is an elder dog with an old man's scowl and a peg leg.", 60, 60, 30, 50, 50);
        VirtualPet pet5 = new RoboticDog("Pete", "An energetic pup with who loves all - kids, cats, and other dogs.", 70, 60, 90);
        VirtualPet pet6 = new OrganicDog("Terry", "A pug with problems, and that's why he's here.", 30, 30, 30, 50, 50);
        VirtualPet pet7 = new RoboticDog("Benny", "A bot with a beatboy style.", 70, 50, 40);
        VirtualPet pet8 = new RoboticDog("Roger", "An outdated rat terrior robot who's a bit fragile in need of much love.", 40, 50, 30);
        VirtualPet pet9 = new OrganicCat("Saul", "A domesticated kitty who fetches for treats.", 50, 50, 70, 50);

        theHerd.addPet(pet1);
        theHerd.addPet(pet2);
        theHerd.addPet(pet3);
        theHerd.addPet(pet4);
        theHerd.addPet(pet5);
        theHerd.addPet(pet6);
        theHerd.addPet(pet7);
        theHerd.addPet(pet8);
        theHerd.addPet(pet9);


        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {

            System.out.println("    +-------------------------------------------+");
            System.out.println("    |        Welcome to Bigger Bytes Shelter    |");
            System.out.println("    |               Automated Menu              |");
            System.out.println("    +-------------------------------------------+");
            System.out.println("");
            System.out.println("");
            System.out.println("            /~~~~~~~~\\                           _");
            System.out.println("    ##\\__/ @)      ~~~~~~~~\\                     \\ \\ ) )");
            System.out.println("    |              /~~\\~~~~~                ((    |  \\");
            System.out.println("     \\    /           |                          /   |");
            System.out.println("      (~~~   /         \\____________/~~~~~~~~~~~~   /");
            System.out.println("       ~~~~|~                                     /");
            System.out.println("           :                                      |");
            System.out.println("            \\                                     |");
            System.out.println("            |                               /      \\");
            System.out.println("             \\  \\_         :         \\     /~~~\\    |");
            System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
            System.out.println("            /    :    /    :         /    :    /    :");
            System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
            System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");

            System.out.println("Currently we have the following pets available for adoption: \n");

            System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t|Walk\t|Oil & Maintenance");// the \t allows console to align output in columns
            System.out.println("--------|-------|-------|-----------|------|-----------------");
            System.out.println();
            System.out.println(theHerd.petStatus());
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1. Feed the organic pets");
            System.out.println("2. Water the organic pets");
            System.out.println("3. Play with an organic pet");
            System.out.println("4. Walk a dog");
            System.out.println("5. Clean a cage or litterbox");
            System.out.println("6. Adopt a pet");
            System.out.println("7. Drop off a pet");
            System.out.println("8. Quit");

            String optionEntered = input.nextLine();
            if (optionEntered.equals("1")) { // OPTION 1
                theHerd.feedOrganic();
                System.out.println("You got to interact with all of our critters while you fed all the pets at Bigger Bytes Shelter.\n");

            } else if (optionEntered.equals("2")) { // OPTION 2
                theHerd.waterOrganic();
                System.out.println("You got to meet all the pets at Bigger Bytes Shelter while you provided them with water.\n");

            } else if (optionEntered.equals("3")) { // OPTION 3
                System.out.println("Who would you like to play with?");
                System.out.println("\nHere are the pets currently available:");
                System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t|Walk\t|Oil & Maintenance");// the \t allows console to align output in columns
                System.out.println("--------|-------|-------|-----------|------|-----------------");
                System.out.println();
                System.out.println(theHerd.petStatus());
                String petName = input.nextLine();

                theHerd.playOrganic();
                System.out.println(petName + " had a lot of fun playing.\n");

            } else if (optionEntered.equals("4")) { // OPTION 4
                System.out.println("That's great!  Which dog would you like to walk?");
                System.out.println("\nHere are the pets currently available:");
                System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t|Walk\t|Oil & Maintenance");// the \t allows console to align output in columns
                System.out.println("--------|-------|-------|-----------|------|-----------------");
                System.out.println();
                System.out.println(theHerd.petStatus());
                String petName = input.nextLine();

                theHerd.walkDog();
                System.out.println(petName + " got a great workout!\n");

            } else if (optionEntered.equals("5")) { // OPTION 5
                System.out.println("Wow, our organic pets really appreciate it.  Who's cage or litterbox would you like to clean?");
                System.out.println("\nHere are the pets currently available:");
                System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t|Walk\t|Oil & Maintenance");// the \t allows console to align output in columns
                System.out.println("--------|-------|-------|-----------|------|-----------------");
                System.out.println();
                System.out.println(theHerd.petStatus());
                String petName = input.nextLine();

                theHerd.getClean();
                System.out.println(petName + " really appreciates a clean cage/box.\n");

            } else if (optionEntered.equals("6")) { // OPTION 6
                System.out.println("You've chosen to adopt a pet. That's fantastic!");
                System.out.println("Which pet would you like to adopt?\n");
                System.out.println(theHerd.petStatus());
                String petName = input.nextLine();

                if (!theHerd.doesPetRemain(petName)) {
                    System.out.println("Wild animals aren't an option. Please see your local zoo.");
                } else {
                    theHerd.adopt(petName);
                    System.out.println("Congrats on adopting your new pet \n" + petName + "!");
                    System.out.println("We're sure you'll be happy together.");
                }

            } else if (optionEntered.equals("7")) { // OPTION 7
                System.out.println("Enter the name of the pet being surrendered: ");
                String newPetName = input.nextLine();

                System.out.println("Enter a description for the pet being surrendered: ");
                String newPetDescription = input.nextLine();

                theHerd.addPet(new OrganicCat(newPetName, newPetDescription, 50, 50, 50, 50));
                System.out.println("Your pet will sure miss you. See, they have tears in their eyes.");
                System.out.println("Thanks for admitting your pet at Bigger Bytes Shelter.\n");
                System.out.println("We'll do our best to find them another happy home.");

            } else if (optionEntered.equals("8")) { // OPTION 8
                System.out.println("Are you sure you wish to quit the game? We have plenty more pets to play with.");
                System.out.println("Enter Yes or No");
                decision = input.nextLine();

                if (decision.equalsIgnoreCase("Yes")) {
                    System.out.println("You have quit the game...");

                } else {
                    decision.equalsIgnoreCase("No");
                    System.out.println("Glad you are still with us.");
                    System.out.println("The pets will be pleased that you stayed for a while longer.\n");
                }

            }

        }

        input.close();
    }

}
