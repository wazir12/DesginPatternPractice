/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.StateDesignPattern;

/**
 *
 * @author simchu
 */
public class WarningState implements TrafficLightState{

    @Override
    public void changeTrafficLight(String Color) {
     System.out.println("Traffic Light is Changing: "+Color);
    }
    
}
