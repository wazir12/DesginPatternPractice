/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author simchu
 */
public class ObserverDesignPatternDemo {
    
    public static void main(String[] args){
        ConcreteSubject book = new ConcreteSubject("Book1",200,"lalit",false);
        ConcreteObservers endUser = new ConcreteObservers("Bob",book);
        ConcreteObservers endUser2 = new ConcreteObservers("TOM", book);
        
        List<Observer> subscribers = book.getObsList();
        for(Iterator<Observer> itr = subscribers.iterator(); itr.hasNext();){
            ConcreteObservers users = (ConcreteObservers) itr.next();
            
            System.out.println("subscribers: "+users.toString());
        }
        
        System.out.println("Is Book in stock"+book.isInStock());
        book.setInStock(true);
        
        
        
        
    }
    
}
