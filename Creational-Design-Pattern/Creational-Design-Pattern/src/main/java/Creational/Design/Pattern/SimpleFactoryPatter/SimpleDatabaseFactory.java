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
public class SimpleDatabaseFactory {
    
    public static Database getDatabase(String db){
        Database dc = null;
        if(db.equals("RDBMS")){
            dc = new RDBMS();
        }
        else if(db.equals("DBMS")){
           dc = new DBMS();  
        } 
        return dc;
    }
    
}
