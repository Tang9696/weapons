package by.bsu.weapons;

import by.bsu.weapons.logic.DivisionCalculator;
import by.bsu.weapons.model.Blade;
import by.bsu.weapons.model.Division;
import by.bsu.weapons.model.Gun;
import by.bsu.weapons.view.DivisionPrinter;

public class Main {

    public static void main(String[] args){
        Division division = new Division();

        Blade blade = new Blade("knife",1.0,1.0);
        Gun gun = new Gun("TT",3.0,9);
        division.add(blade);
        division.add(gun);

        DivisionPrinter printer = new DivisionPrinter();
        printer.print(division);
        DivisionCalculator calculator = new DivisionCalculator();
        double totalWeight = calculator.calculatorTotalweight(division);
        System.out.println("Total weight = " + totalWeight);
    }
}
