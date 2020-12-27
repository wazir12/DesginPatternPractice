/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.MomentoDesignPattern;

/**
 *
 * @author simchu
 */


public class MomentoDesignPatternDemo {
    public static void main(String[] args){
        
        //Creating Originator
        LiveAreaOriginator originator = new LiveAreaOriginator();
        // Creating care taker to store the momento
        CareTaker ctaker = new CareTaker();
        //Setting the Refrigator object
        originator.setRefri(new Refrigator(2000,2000,true));
       
       //Saving the created Momento(that contains the previous state of the Refrigator) in Care Taker
        ctaker.setMomento(originator.createMomento());
        
        
        //Adding Second Refrigator in living area
        originator.setRefri(new Refrigator(3000,3000,true));
        
        ctaker.setMomento(originator.createMomento());
        
        System.out.println("Current State of Originator"+ originator);
        
        System.out.println("Restoring the Old Refrigator");
        
        originator.getMomento(ctaker.getMomento(0));
        
         System.out.println("Current State of Originator after restoring"+ originator);
        
        
    }
}
