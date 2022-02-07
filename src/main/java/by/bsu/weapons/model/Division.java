package by.bsu.weapons.model;

import java.util.ArrayList;
import java.util.List;

public class Division {

    private List<AbstractWeapon> weapons;

    public Division(){
        weapons = new ArrayList<AbstractWeapon>();
    }

    public List<AbstractWeapon> getWeapons(){
        return weapons;
    }

    public void add(AbstractWeapon weapon){
        weapons.add(weapon);
    }
}
