/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.PrototypeDesignPattern;

import java.util.ArrayList;

/**
 *
 * @author simchu
 */
public class CoffeeShop implements Cloneable{
    private String shopName;
    private ArrayList<Coffee> coffeeType = new ArrayList<Coffee>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<Coffee> getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(ArrayList<Coffee> coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "shopName=" + shopName + ", coffeeType=" + coffeeType + '}';
    }
    public void loadStock(){
        for(int i=1; i<=3;i++){
            Coffee coffee = new Coffee();
            coffee.setCoffeeId(i);
            coffee.setCoffeeName("coffee name "+i);
            getCoffeeType().add(coffee);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //super.clone()--> Implements shallow cloning by default
        //Shallow Cloning doesnt create new object but create new reference to the same Object
        //return super.clone(); //To change body of generated methods, choose Tools | Templates.
    //Deep Cloning- Creates a new object instead of just copying data to a refernece pointing to the same object
        CoffeeShop cShop = new CoffeeShop();
        for(Coffee c: this.getCoffeeType()){
            cShop.getCoffeeType().add(c);
        }
        return cShop;
    }
    
    
    
    
}
