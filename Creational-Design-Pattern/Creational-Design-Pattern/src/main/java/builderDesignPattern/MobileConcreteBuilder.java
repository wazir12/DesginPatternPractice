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
public class MobileConcreteBuilder extends MobileBuilder {

    @Override
    public void createMemory() {
       getMobile().setMemory("32 GB");
       System.out.println("Memory created and installed");
      
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("450 mAh");
        System.out.println("Battery created and Installed!!");
    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Bluetooth and Wifi");
        System.out.println("Wireless created and installed!!");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Amoled");
        System.out.println("Screen Created");
       
    }

    @Override
    public void createMetalCase() {
     getMobile().setMetalCase("Gold Plated iron case");
     System.out.println("Metal Case created!!");
    }
    
}
