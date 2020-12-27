/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simchu
 */
public class ConcreteSubject implements Subject {

    private String name;
    private double price;
    private String author;
    private boolean inStock;

    public ConcreteSubject(String name, double price, String author, boolean inStock) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.inStock = inStock;
    }

   
    
    private List<Observer> obsList = new ArrayList<Observer>();

    public List<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(List<Observer> obsList) {
        this.obsList = obsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from sold out to back in Stock");
        notifyAllObservers();
    }

    @Override
    public String toString() {
        return "ConcreteSubject{" + "name=" + name + ", price=" + price + ", author=" + author + ", inStock=" + inStock + '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   
    
    
    
    
    @Override
    public void subscribeObserver(Observer observer) {
       obsList.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        obsList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
    
        System.out.println("Noitifying all abservers: "+this.toString());
        for(Observer obs: obsList){
            obs.update(this.inStock);
        }
    }
    
}
