/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.SingletonPatternWithSerialization;

import java.io.Serializable;

/**
 *
 * @author simchu
 */
public class SingletonWithSerialization implements Serializable{
    //Serlialization defeats singleton pattern, 
    //because JVM create a new object during deserialization
     private static final SingletonWithSerialization singleton = new SingletonWithSerialization();

    private SingletonWithSerialization() {
        System.out.println("The Singleton Instance");
      //  System.out.println("hashcode: "+singleton.hashCode());
    }
    
    
    public static SingletonWithSerialization getInstance(){
        return singleton;
    }
    
    protected Object readResolve(){
        //Overcoming Singleton with Serialization problem
            return singleton;
        }
    
}
