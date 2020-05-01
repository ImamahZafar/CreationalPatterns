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
public class CottonCandy extends Flavour {

    @Override
    public int getPrice() {
      return price=400; }

    @Override
    public void getIngredients() {
         System.out.println("Ingredients in Cotton Candy are:");
    System.out.println("Cream, Cotton Candy Flavored Base (Corn Syrup, Water, Sugar, Artificial Flavor, Sodium Citrate, Citric Acid), Nonfat Milk, Sugar, Corn Syrup, Whey Powder, Stabilizer/Emulsifier Blend ");  
    }
    
}
