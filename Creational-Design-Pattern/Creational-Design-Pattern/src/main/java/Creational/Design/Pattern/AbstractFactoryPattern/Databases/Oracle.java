/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.AbstractFactoryPattern.Databases;

import Creational.Design.Pattern.AbstractFactoryPattern.Database;

/**
 *
 * @author simchu
 */
public class Oracle implements Database {

    @Override
    public void connect() {
        System.out.println("Oracle Connected!!");
    }
    
}
