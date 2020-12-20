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
public class CoffeeShop {
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
    
    
    
    
}
