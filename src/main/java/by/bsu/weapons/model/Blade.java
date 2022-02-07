package by.bsu.weapons.model;

public class Blade extends AbstractWeapon {
    private double length;

    public Blade(String name, double wight,double length) {
        super(name, wight);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
