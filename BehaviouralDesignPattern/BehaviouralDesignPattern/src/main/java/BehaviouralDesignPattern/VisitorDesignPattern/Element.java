/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.VisitorDesignPattern;

/**
 *
 * @author simchu
 */
public interface Element {
     
    public void accept(Visitor v);
    
    
}

