package shelter;

public class RoboticDog extends Robotic {

    private int walk;

    RoboticDog(String petName, String description, int boredom, int walk, int oilAndMaintenance) {
        super(petName, description, boredom, walk, oilAndMaintenance);
        this.walk = walk;
    }


    protected int getWalk() {
        return walk;
    }

    protected void walkDog() {
        this.oilAndMaintenance += 5;
        this.walk -= 5;
    }

}

