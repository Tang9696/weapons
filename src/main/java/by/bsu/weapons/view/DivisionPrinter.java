package by.bsu.weapons.view;

import by.bsu.weapons.model.AbstractWeapon;
import by.bsu.weapons.model.Division;

import java.util.List;

public class DivisionPrinter {

    public void print(Division division){
        List<AbstractWeapon> weapons = division.getWeapons();
        for (AbstractWeapon weapon : weapons){
            System.out.println("Name =" + weapon.getName());
            System.out.println("Weight = " + weapon.getWight());
        }
    }
}
