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
//Director
public class Manufacturer {
     
    public static Mobile createCompleteObj(){
        MobileBuilder builder = new MobileConcreteBuilder();
        return builder.buildMobile();
        
    }
}
