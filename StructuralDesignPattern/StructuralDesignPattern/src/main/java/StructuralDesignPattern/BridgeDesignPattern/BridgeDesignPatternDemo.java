/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.BridgeDesignPattern;

/**
 *
 * @author simchu
 */
public class BridgeDesignPatternDemo {
    public static void main(String[] args){
        ButterflyWallDesign design1 = new ButterflyWallDesign();
        design1.setColor(new Red());
        design1.designWallFunction();
        
        ButterflyWallDesign design2 = new ButterflyWallDesign();
        design2.setColor(new Biege());
        design2.designWallFunction();
    }
}
