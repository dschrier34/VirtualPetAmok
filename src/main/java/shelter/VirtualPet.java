package shelter;


public abstract class VirtualPet {
    protected String petName;
    protected String description;



    VirtualPet(String petName, String description) {
        this.petName = petName;
        this.description = description;

    }

    protected String getName() {
        return petName;
    }

    protected String getDescription() {
        return description;
    }



}

