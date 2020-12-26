/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.AbstractFactoryPattern;

/**
 *
 * @author simchu
 */
public abstract class AbstractDatabaseFactory {
    
    public abstract Database getDatabase(String type); 
    
    public static AbstractDatabaseFactory createDatabaseFactory(String factoryType){
        
        if(factoryType.equalsIgnoreCase("RDBMSFactory")){
            return new RDBMSFactory();
        }
        else if(factoryType.equalsIgnoreCase("DBMSFactory")){
            return new DBMSFactory();
        }
        return null;
    }
    
}
