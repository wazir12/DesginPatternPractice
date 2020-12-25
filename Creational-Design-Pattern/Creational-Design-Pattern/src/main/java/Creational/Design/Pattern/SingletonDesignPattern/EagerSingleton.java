/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern;

/**
 *
 * @author simchu
 */
public class EagerSingleton {
    
    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("The Singleton Instance");
        System.out.println("hashcode: "+singleton.hashCode());
    }
    
    
    public static EagerSingleton getInstance(){
        return singleton;
    }
    
}
