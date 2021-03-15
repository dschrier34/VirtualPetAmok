package shelter;

    public abstract class Robotic extends VirtualPet {
        protected int boredom;
        protected int oilAndMaintenance;
        protected int walk;


        Robotic(String petName, String description, int boredom, int oilAndMaintenance, int walk) {
            super(petName, description);
            this.boredom = boredom;
            this.oilAndMaintenance = oilAndMaintenance;
            this.walk = walk;


        }
        protected int getBoredom() {
            return boredom;
        }
        protected int getOilAndMaintenance() {
            return oilAndMaintenance;
        }
        protected int getWalk(){
            return walk;
        }




}

