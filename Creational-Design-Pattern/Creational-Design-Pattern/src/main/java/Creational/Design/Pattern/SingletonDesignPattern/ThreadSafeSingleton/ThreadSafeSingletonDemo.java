/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.ThreadSafeSingleton;

/**
 *
 * @author simchu
 */
public class ThreadSafeSingletonDemo {
    public static void main(String[] args){
        ThreadSafeSingleton inst = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        
                
    }
}
