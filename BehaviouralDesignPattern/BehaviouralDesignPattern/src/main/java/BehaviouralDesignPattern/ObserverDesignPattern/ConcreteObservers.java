/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.ObserverDesignPattern;

/**
 *
 * @author simchu
 */
public class ConcreteObservers implements Observer {

    String name;

    public ConcreteObservers(String name,ConcreteSubject subject) {
        this.name = name;
        subject.subscribeObserver(this);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void update(boolean inStock) {
       System.out.println("Hi"+name+"\nWe are happy to inform you that your book is in Stock!!");
    }

    @Override
    public String toString() {
        return "ConcreteObservers{" + "name=" + name + '}';
    }
    
}
