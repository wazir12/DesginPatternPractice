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
public class BuilderDesignPatternDemoClient {
    
    public static void main(String[] args){
        
        Mobile m = Manufacturer.createCompleteObj();
        System.out.println(m.toString());
        
    }
    
}
