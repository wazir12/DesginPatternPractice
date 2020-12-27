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
//Concrete extension of abstract class
public class WoodenWallDesign extends Template{

    @Override
    public void designWallFunction() {
     System.out.println("Design Wall with Wooden Wall template ...");
        if(color!=null)
        {
            color.pickColor();
        }
    }
    
}
