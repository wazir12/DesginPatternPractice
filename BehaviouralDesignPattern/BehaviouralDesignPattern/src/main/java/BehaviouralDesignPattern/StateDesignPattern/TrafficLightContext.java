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
public class TrafficLightContext {
    String color;
    TrafficLightState state;

    public TrafficLightContext(String color, TrafficLightState state) {
        this.color = color;
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
        state.changeTrafficLight(color);
    }
    
    public void handle(){
       state.changeTrafficLight(color);
    }
    
}
