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
public abstract class MobileBuilder {
    
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
    //Creating all parts of Mobile
    public abstract void createMemory();
    public abstract void createBattery();
    public abstract void createWireless();
    public abstract void createScreen();
    public abstract void createMetalCase();
    
    public final Mobile buildMobile(){
        Mobile mob = new Mobile();
        setMobile(mob);
        
        createMemory();
        createBattery();
        createWireless();
        createScreen();
        createMetalCase();
        
        return mob;
       
    }
}
