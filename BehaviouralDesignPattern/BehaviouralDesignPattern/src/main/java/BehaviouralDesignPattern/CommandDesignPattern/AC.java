/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.CommandDesignPattern;

/**
 *
 * @author simchu
 */
public class AC {
    
    public void turnOn(){
        System.out.println("AC is turned On!!");
    }
    
     public void turnOff(){
        System.out.println("AC is turned Off!!");
    }
    
     public void incTemp(){
        System.out.println("AC temp Increased!!");
    }
      public void decTemp(){
        System.out.println("AC temp decreased!!");
    }
}
