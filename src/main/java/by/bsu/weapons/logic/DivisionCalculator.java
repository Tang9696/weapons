package by.bsu.weapons.logic;

import by.bsu.weapons.model.AbstractWeapon;
import by.bsu.weapons.model.Division;

import java.util.List;

public class DivisionCalculator {

    public double calculatorTotalweight(Division division){
        List<AbstractWeapon> weapons = division.getWeapons();
        double totalweight = 0;
        for (AbstractWeapon weapon : weapons){
           totalweight = totalweight + weapon.getWight();
        }
        return totalweight;
    }
}
