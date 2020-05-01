/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author imamah
 */
//Many different flavour icecream exist when one goes to Baskin Robin
    // It's the customer's choice to pick the favourite flavour 
    // In order to code this the Factory patterns is used as
    // Factory Pattern allows the sub-classes to choose the type of objects to create.
    // Baskin Robins also introduces new flavours all the time
    // with the help of factory pattern 
    //you’ll only need to create a new creator subclass and override the factory method in it
public class BaskinRobinsFactory {
    public Flavour getIceCream(String choiceOfFlavour)
    {
        switch(choiceOfFlavour){
            case "Rainbow Sherbet":
                return new RainbowSherbet();
             case "Chocolate Chip Cookie Dough":
                return new ChocoloateChipCookieDough();  
            case "Cotton Candy":
                return new CottonCandy();
        }
        return null;
    }
}
