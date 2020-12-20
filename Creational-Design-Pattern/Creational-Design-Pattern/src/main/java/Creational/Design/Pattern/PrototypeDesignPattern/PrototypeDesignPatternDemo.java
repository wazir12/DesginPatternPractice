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
    public static void main(String[] args){
        CoffeeShop shop = new CoffeeShop();
        shop.setShopName("CCD");
        shop.loadStock();
        System.out.println(shop.toString());
        
    }
    
}
