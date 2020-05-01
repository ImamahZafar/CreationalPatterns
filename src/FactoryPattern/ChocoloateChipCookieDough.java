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
public class ChocoloateChipCookieDough extends Flavour{

    @Override
    public int getPrice() {
       return price=300;  }

    @Override
    public void getIngredients() {
         System.out.println("Ingredients in Chocolate chip cookie dough are:");
     System.out.println("Cream, Chocolate Chip Cookie Dough [Unenriched Wheat Flour, Brown Sugar, Butter (Cream, Salt), Sugar, Pasteurized Eggs, Chocolate Chips (Sugar, Chocolate Liquor, Cocoa Butter, Soy Lecithin {Emulsifier}), Corn Starch, Nonfat Milk, Natural Flavor, Salt], Nonfat Milk, Sugar, Corn Syrup, Chocolate Flavored Chips  "); }
    
}