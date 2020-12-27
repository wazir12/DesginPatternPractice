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
public class Refrigator {
    
    private int price;
    private int volume;
    private boolean isPowerSaver;

    public Refrigator(int price, int volume, boolean isPowerSaver) {
        this.price = price;
        this.volume = volume;
        this.isPowerSaver = isPowerSaver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isIsPowerSaver() {
        return isPowerSaver;
    }

    public void setIsPowerSaver(boolean isPowerSaver) {
        this.isPowerSaver = isPowerSaver;
    }

    @Override
    public String toString() {
        return "Refrigator{" + "price=" + price + ", volume=" + volume + ", isPowerSaver=" + isPowerSaver + '}';
    }
    
    
    
    
    
}
