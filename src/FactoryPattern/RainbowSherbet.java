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
public class RainbowSherbet  extends Flavour{

    @Override
    public int getPrice() {
       return price=500;  }

    @Override
    public void getIngredients() {
        System.out.println("Ingredients in Rainbow Sherbet are:");
     System.out.println("Water, Sugar, Corn Syrup, Nonfat Milk, Cream, Pineapple Puree Base [Pineapple, Sugar, Corn Syrup, Concentrated Pineapple Juice, Modified Corn Starch, Water, Propylene Glycol, Natural Flavor, Carboxymethylcellulose, Potassium Sorbate and Sodium Benzoate (Preservatives), Citric Acid, Calcium Disodium EDTA], Orange Puree "); }
    
}
