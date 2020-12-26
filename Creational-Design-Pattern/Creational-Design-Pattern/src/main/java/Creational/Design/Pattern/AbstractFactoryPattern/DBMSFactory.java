/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.AbstractFactoryPattern;

import Creational.Design.Pattern.AbstractFactoryPattern.Databases.MongoDB;
import Creational.Design.Pattern.AbstractFactoryPattern.Databases.MsAccess;
import Creational.Design.Pattern.AbstractFactoryPattern.Databases.XML;

/**
 *
 * @author simchu
 */
public class DBMSFactory extends AbstractDatabaseFactory {

    @Override
    public Database getDatabase(String type) {
        Database dc = null;
        if(type.equalsIgnoreCase("XML")){
            dc = new XML(); 
        }
        else if(type.equalsIgnoreCase("MongoDB")){
           dc = new MongoDB(); 
        }
        else if(type.equalsIgnoreCase("MsAccess")){
            dc = new MsAccess();
        }
        return dc;
    }
    
}
