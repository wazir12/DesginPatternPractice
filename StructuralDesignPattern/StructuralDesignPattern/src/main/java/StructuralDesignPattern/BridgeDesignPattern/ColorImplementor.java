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
public interface ColorImplementor {
    
    public void pickColor();
    
}
class Red  implements ColorImplementor{

    @Override
    public void pickColor() {
        System.out.println("Color of the Wall is Red");
    }
    
}
class Biege implements ColorImplementor{

    @Override
    public void pickColor() {
        System.out.println("Color of the Wall is Beige"); 
    }

}
