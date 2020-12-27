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
//Abstract class defining the abstract layer and this is made available to client 
public abstract class Template {
    protected ColorImplementor color;

    public ColorImplementor getColor() {
        return color;
    }

    public void setColor(ColorImplementor color) {
        this.color = color;
    }
    
    public abstract void designWallFunction();
    
}
