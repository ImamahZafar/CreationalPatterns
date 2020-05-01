/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationalpatterns;
import Singleton.*;
import FactoryPattern.*;
import BuilderPattern.*;
/**
 *
 * @author imamah
 */
public class CreationalPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Many different flavour icecream exist when one goes to Baskin Robin
    // It's the customer's choice to pick the favourite flavour 
    // In order to code this the Factory patterns is used as
    // Factory Pattern allows the sub-classes to choose the type of objects to create.
    // Baskin Robins also introduces new flavours all the time
    // with the help of factory pattern 
    //you’ll only need to create a new creator subclass and override the factory method in it
 BaskinRobinsFactory  baskinRobinsFactory = new  BaskinRobinsFactory();
        Flavour customer1=baskinRobinsFactory.getIceCream("Rainbow Sherbet");
        customer1.getIngredients();
         Flavour customer2=baskinRobinsFactory.getIceCream("Cotton Candy");
        customer2.getIngredients();
        System.out.println("Price is "+ customer2.getPrice());
        
        // Singleton class is used when only one instance of the class can exisit. 
    // Real life example of this is The Chief of Army Staff of Pakistan.
    // There are many generals in the army but only one is appointed as the Chief of army staff
    // so for any offical visit to a city, one person has the duty to visit all the cities. 
    ChiefOfArmyStaff General=    ChiefOfArmyStaff.getInstance();
      General.setName("Raheel Shareef");
      General.officialVisit("Lahore");
      
      ChiefOfArmyStaff secondGeneral=    ChiefOfArmyStaff.getInstance();
      secondGeneral.setName("Qamar Bajwa");
      secondGeneral.officialVisit("Karachi");
      //calling the officialVisit function of the first variable created which has been initilized with 
      // the name Raheel Shareef but since only one instance of the object ChiefOfArmyStaff is created
      //so it overwrites the previous name and Qamar Bajwa is the name of the ChiefOfArmyStaff single object
      General.officialVisit("Karahi");
      
      //In everyday life it is the Customer's choice whether to add some topping on their subway or not
// whether someone likes lettuce or not. Some customers add  cheese in their subs and others dont
//in order to code this we would have needed multiple constructors since some parameters are optional
// but by using Builder Design Pattern there is no need of multiple constructers. 
//Builder pattern builds a complex object using simple objects and using a step by step approach
 SubwaySandwich sub1= SubwaySandwich.Builder.newInstance().setBread("Oregno").setChickenFlavour("Terriyai").setLettuce("Lettuce").setCheese("Cheese").setOlives("Olive").setSauce("Chipotle").build();
   
    System.out.println(sub1);
    //optional parameters are missing but object would be created with the help of builder pattern
      SubwaySandwich sub2= SubwaySandwich.Builder.newInstance().setBread("Italian").setChickenFlavour("Tikka").setCheese("cheese").setSauce("BBQ").build();
     System.out.println(sub2);
    }
    
}
