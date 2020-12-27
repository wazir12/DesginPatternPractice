/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.StrategyDesignPattern;

/**
 *
 * @author simchu
 */
public class compressToZip implements Strategy{

    @Override
    public void compressFile(String file) {
            System.out.println("Compressing" +file+ "to ZIP");
    }
    
}
class compressToRAR implements Strategy{

    @Override
    public void compressFile(String file) {
    
        System.out.println("Compressing "+file+" to RAR");
    }
    
}
