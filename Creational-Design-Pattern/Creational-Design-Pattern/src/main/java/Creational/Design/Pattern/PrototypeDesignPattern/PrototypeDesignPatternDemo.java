/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.PrototypeDesignPattern;

/**
 *
 * @author simchu
 */
public class PrototypeDesignPatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        CoffeeShop prototype = new CoffeeShop();
        prototype.setShopName("CCD");
        prototype.loadStock();
       // System.out.println(prototype.toString());
        
        CoffeeShop newShop = (CoffeeShop) prototype.clone();
        newShop.setShopName("CCD New");
        prototype.getCoffeeType().remove(0);
         System.out.println(prototype.toString());
        //newShop.loadStock
        System.out.println(newShop.toString());
        
    }
    
}
