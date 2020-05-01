/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author imamah
 */
public class ChiefOfArmyStaff {
     private static ChiefOfArmyStaff chiefOfArmyStaff;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private ChiefOfArmyStaff()
    {
        System.out.println("Chief of Army Staff appointed");
    }
    public static ChiefOfArmyStaff getInstance()
    {
        if(chiefOfArmyStaff!=null)
            return chiefOfArmyStaff;
        else
        {
            chiefOfArmyStaff=new ChiefOfArmyStaff();
            return chiefOfArmyStaff;
        } 
    }
    public void officialVisit(String city)
    {
            System.out.println("Chief of Army Staff "+ this.name+ " is on an official visit in "+ city);
    }
}
