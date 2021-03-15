package shelter;

public class OrganicDog extends Organic {
    private int walk;

    OrganicDog(String petName, String description, int hunger, int thirst, int boredom, int clean, int walk){
        super(petName, description, hunger, thirst, boredom, clean);
        this.walk = walk;
    }


    protected int getWalk() {
        return walk;
    }
    protected void cleanCage() {
        this.clean -= 5;
        this.walk += 5;
    }
    protected void walkDog() {
        this.clean += 5;
        this.walk -= 5;
    }
}
