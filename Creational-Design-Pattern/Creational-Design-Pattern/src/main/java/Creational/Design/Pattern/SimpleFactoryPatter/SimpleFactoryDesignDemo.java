/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SimpleFactoryPatter;

/**
 *
 * @author simchu
 */
public class SimpleFactoryDesignDemo {
    
    public static void main(String[] args){
       Database dc = null;
        dc = SimpleDatabaseFactory.getDatabase("RDBMS");
        System.out.println(dc.connect());
    }
    
}
