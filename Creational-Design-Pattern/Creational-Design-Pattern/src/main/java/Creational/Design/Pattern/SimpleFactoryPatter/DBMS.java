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
public class DBMS implements Database{

    @Override
    public String connect() {
        return "Connection successful with DBMS";
    }
    
    
}
