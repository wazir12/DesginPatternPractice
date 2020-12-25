/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.BillPughSingleton;

/**
 *
 * @author lalit.wazir
 * When the singleton class is loaded, 
 * SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, 
 * this class gets loaded and creates the Singleton class instance.
 * THis class doesn't need synchronization
 * 
 * 
 */
public class BillPughSingleton {

    private static class SingletonHelper{
          private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    private BillPughSingleton() {
        System.out.println("this Bill Pugh Singleton");
    }
    
     public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
}
