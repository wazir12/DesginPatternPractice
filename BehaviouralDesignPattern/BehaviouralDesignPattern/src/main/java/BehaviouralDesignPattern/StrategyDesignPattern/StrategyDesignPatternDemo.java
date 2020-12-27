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
public class StrategyDesignPatternDemo {
    
    public static void main(String[] args){
        
        FileContext file = new FileContext("file1",new compressToZip());
        file.handle();
        
        file.setFile_name("file2");
        file.setStrategy(new compressToRAR());
        file.handle();
    }
    
}
