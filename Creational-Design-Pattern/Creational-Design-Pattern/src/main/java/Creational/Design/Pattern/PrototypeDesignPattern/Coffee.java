/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.PrototypeDesignPattern;

/**
 *
 * @author lalitwazir
 */
public class Coffee {
    private int coffeeId;
    private String CoffeeName;

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getCoffeeName() {
        return CoffeeName;
    }

    public void setCoffeeName(String CoffeeName) {
        this.CoffeeName = CoffeeName;
    }

    @Override
    public String toString() {
        return "Coffee{" + "coffeeId=" + coffeeId + ", CoffeeName=" + CoffeeName + '}';
    }
    
    
}
