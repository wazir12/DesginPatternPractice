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
public class MessageFactory {
    
    public Message getMessage(String type){
        if(type == null){
            return null;
        }
        else if (type.equalsIgnoreCase("JSONMessage")){
            return new JSONMessage();
        }
        else if(type.equals("TextMessage")){
            return new TextMessage();
        }
        return null;
    }
    
}
