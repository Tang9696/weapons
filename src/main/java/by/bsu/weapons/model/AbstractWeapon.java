package by.bsu.weapons.model;

public abstract class AbstractWeapon {

    private String name;
    private double wight;

    public AbstractWeapon(String name, double wight) {
        this.name = name;
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
