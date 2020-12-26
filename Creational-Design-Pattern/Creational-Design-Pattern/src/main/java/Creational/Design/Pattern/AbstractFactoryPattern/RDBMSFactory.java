/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.AbstractFactoryPattern;

import Creational.Design.Pattern.AbstractFactoryPattern.Databases.MySql;
import Creational.Design.Pattern.AbstractFactoryPattern.Databases.Oracle;

/**
 *
 * @author simchu
 */
public class RDBMSFactory extends AbstractDatabaseFactory{

    @Override
    public Database getDatabase(String type) {
            Database dc = null;
            if(type.equalsIgnoreCase("Oracle")){
                dc = new Oracle();
            }
            else if(type.equalsIgnoreCase("MySql")){
                dc = new MySql();
            }
            return dc;
    }
    
}
