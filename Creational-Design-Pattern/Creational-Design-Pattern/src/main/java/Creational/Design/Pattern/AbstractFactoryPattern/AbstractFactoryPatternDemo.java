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
//Client Code
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractDatabaseFactory databaseFactory = null;
        Database db = null;
    //Step 1 : Get Abstract Database Factory
        databaseFactory = AbstractDatabaseFactory.createDatabaseFactory("DBMSFactory"); 
        //Step2:Get Db
        db = databaseFactory.getDatabase("MsAccess");
        db.connect();
        db = databaseFactory.getDatabase("MongoDB");
        db.connect();
        db = databaseFactory.getDatabase("XML");
        db.connect();
        databaseFactory = AbstractDatabaseFactory.createDatabaseFactory("RDBMSFactory");
        db = databaseFactory.getDatabase("MySql");
        db.connect();
        db = databaseFactory.getDatabase("Oracle");
        db.connect();
       
        
    }
 
   
}
