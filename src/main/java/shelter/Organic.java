package shelter;


public abstract class Organic extends VirtualPet {
    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int clean;

    Organic(String petName, String description, int hunger, int thirst, int boredom, int clean) {
        super(petName, description);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.clean = clean;
    }


    protected int getHunger() {
        return hunger;
    }

    protected int getThirst() {
        return thirst;
    }

    protected void feedOrganic() {
        this.hunger += 5;
        this.thirst -= 5;
    }
    protected void waterOrganic() {
        this.thirst += 5;
    }
    protected int getClean() {
        return clean;
    }
    protected int getBoredom() {
        return boredom;
    }
    protected void playOrganic() {
        this.boredom -= 5;
    }


}

