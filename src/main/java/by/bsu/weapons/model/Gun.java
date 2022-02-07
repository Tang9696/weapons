package by.bsu.weapons.model;

public class Gun extends AbstractWeapon {

    private int capacity;

    public Gun(String name, double wight,int capacity) {
        super(name, wight);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
