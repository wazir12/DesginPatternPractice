/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderDesignPattern;

/**
 *
 * @author simchu
 */
public class Mobile {
    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String metalCase;

    @Override
    public String toString() {
        return "Mobile{" + 
                "\nmemory=" + memory + ",\n"
                + " battery=" + battery + ",\n"
                +" wireless=" + wireless + 
                ",\n screen=" + screen + 
                ",\n metalCase=" + metalCase + 
                '}';
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMetalCase() {
        return metalCase;
    }

    public void setMetalCase(String metalCase) {
        this.metalCase = metalCase;
    }
    
    
    
}
