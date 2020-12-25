/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.LazyInitialization;

/**
 *
 * @author simchu
 */
public class LazySingletonDemo {
    
    public static void main(String[] args){
        LazySingleton lazy = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getSynchronizedInstance();
        if(lazy.hashCode()==lazy2.hashCode()){
            System.out.println("Same");
        }
        else{
             System.out.println("Different");
        }
                
    }
    
}
