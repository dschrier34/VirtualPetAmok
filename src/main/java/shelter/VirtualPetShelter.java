
package shelter;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> theHerd = new HashMap<>();

    //list all of the pets
    public Collection<VirtualPet> availablePets() {
        return theHerd.values();
    }

    //find a specific pet
    public VirtualPet findPet(String petName) {
        return theHerd.get(petName);
    }

    //add a pet
    public void addPet(VirtualPet virtualPet) {
        String newPet = virtualPet.getName();
        theHerd.put(newPet, virtualPet);
    }


    public String petStatus() {
        String petStatus = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                petStatus += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\t 0 " + "\t 0 " + "\n";
            } else if (eachPet instanceof Robotic) {
                petStatus += eachPet.getName() + "\t    0 " + "\t    0 " + "\t" + ((Robotic) eachPet).getBoredom() + "\t  "
                        + ((Robotic) eachPet).getWalk() + "\t   " + ((Robotic) eachPet).getOilAndMaintenance() + "\n";
            }
        }
        return petStatus;
    }

    public String waterOrganic() {
        String waterStatus = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                ((Organic) eachPet).waterOrganic();
                waterStatus += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n";
            }
        }
        return waterStatus;
    }

    public String feedOrganic() {
        String feedStatus = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                ((Organic) eachPet).feedOrganic();
                feedStatus += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n";
            }
        }
        return feedStatus;
    }

    public String playOrganic() {
        String playStatus = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                ((Organic) eachPet).playOrganic();
                playStatus += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n";

            }
        }
        return playStatus;
    }

    public String walkDog() {
        String walkDog = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof OrganicDog) {
                walkDog += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n";
            } else if (eachPet instanceof RoboticDog) {
                walkDog += eachPet.getName() + "\t   " + ((Robotic) eachPet).getOilAndMaintenance() + "\t  "
                        + ((Robotic) eachPet).getWalk() + "\t   " + ((Robotic) eachPet).getBoredom() + "\n";
            }
        }
        return walkDog;
    }

    public String getClean() {
        String getClean = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                getClean += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n" + ((Organic) eachPet).getClean() + "\n";

            }
        }
        return getClean;

    }

    public boolean doesPetRemain(String name) {
        return theHerd.containsKey(name);
    }

    public void adopt(String name) {
        theHerd.remove(name);
    }

    public String getTick() {
        String tickCount = "";
        for (VirtualPet eachPet : availablePets()) {
            if (eachPet instanceof Organic) {
                tickCount += eachPet.getName() + "\t   " + ((Organic) eachPet).getHunger() + "\t   "
                        + ((Organic) eachPet).getThirst() + "\t   " + ((Organic) eachPet).getBoredom() + "\n";
            } else if (eachPet instanceof Robotic) {
                tickCount += eachPet.getName() + "\t   " + ((Robotic) eachPet).getOilAndMaintenance() + "\t  "
                        + ((Robotic) eachPet).getWalk() + "\t   " + ((Robotic) eachPet).getBoredom() + "\n";
            }
        }
        return tickCount;
    }


}



