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
public class TextMessage extends Message {

    @Override
    public void getMessage() {
            System.out.println("This Is Text Message");
    }
    
}
