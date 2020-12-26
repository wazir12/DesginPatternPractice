/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.FactoryMethosDesignPattern;

/**
 *
 * @author simchu
 */
public class FactoryMethodDesignPattern {
    
    public static void main(String[] args){
        MessageFactory mf= new MessageFactory();
        Message m = mf.getMessage("JSONMessage");
        m.getMessage();
        
        mf.getMessage("TextMessage").getMessage();
    }
    
}
