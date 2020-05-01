/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author imamah
 */

    //In everyday life it is the Customer's choice whether to add some topping on their subway or not
// whether someone likes lettuce or not. Some customers add  cheese in their subs and others dont
//in order to code this we would have needed multiple constructors since some parameters are optional
// but by using Builder Design Pattern there is no need of multiple constructers. 
//Builder pattern builds a complex object using simple objects and using a step by step approach
//
public class SubwaySandwich {
   private String bread;
    private String chickenflavour;
   private String cheese;
    private String lettuce;
    private String olives;
   private String sauce;
    
    public SubwaySandwich(Builder builder)
    {
        this.bread=builder.bread;
        this.cheese=builder.cheese;
        this.chickenflavour=builder.flavour;
        this.lettuce=builder.lettuce;
        this.olives=builder.olives;
        this.sauce=builder.sauce;
    }
    //Static inner class
    // helps us in building desired User object with all mandatory attributes and 
    //combination of optional attributes, without loosing the immutability.
    public static class Builder{
    private String bread;
    private String flavour;
    private String cheese; // optional
    private String lettuce; //optional
    private String olives; //optional
    private String sauce;  //optional
    
    
     public static Builder newInstance() 
        { 
            return new Builder(); 
        } 
  private Builder() {} 
    public Builder setBread(String bread) {
        this.bread = bread;
        return this;
    }
    //setters
    public Builder  setChickenFlavour(String flavour) {
        this.flavour = flavour;
         return this;
    }

    public Builder  setCheese(String cheese) {
        this.cheese = cheese;
         return this;
    }

    public Builder  setLettuce(String lettuce) {
        this.lettuce = lettuce;
         return this;
    }

    public Builder  setOlives(String olives) {
        this.olives = olives;
         return this;
    }

    public Builder setSauce(String sauce) {
        this.sauce = sauce; 
        return this;
    }
    public SubwaySandwich build()
    {    
        SubwaySandwich s =  new SubwaySandwich(this);
    
            return s;
    }
    
    }
 
   
    
      @Override
    public String toString() {
        return "Bread: "+this.bread+", "+this.chickenflavour+", "+this.sauce+", "+this.cheese+", "+this.lettuce+" ,"+this.olives;
    }
}

