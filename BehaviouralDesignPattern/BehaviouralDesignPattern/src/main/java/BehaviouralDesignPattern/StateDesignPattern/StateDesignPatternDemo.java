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
public class StateDesignPatternDemo {
    
    public static void main(String[] args){
        TrafficLightContext trafficLight = new TrafficLightContext("RED",new StopState()); 
        trafficLight.setColor("YELLOW");
        trafficLight.setState(new WarningState());
        trafficLight.setColor("GREEN");
        trafficLight.setState(new MoveState());
        
        
    }
   
    
    
}
