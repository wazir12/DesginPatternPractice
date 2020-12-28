/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.FlyweightDesignPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author simchu
 */
public class FlyweightDesignPatternDemo {
    public static void main(String[] args){
        Bucket bucket = new Bucket();
        bucket.processOrder("Macbook 2020", 2020);
        bucket.processOrder("Apple Watch", 2021);
        bucket.processOrder("Apple Gogles", 2022);
        bucket.process();
        System.out.println(bucket.getTotalProductOrders());
    }
}
//This Is the class whose object is to be stored
class Product{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + '}';
    }
    
}

class PortfolioFlyweightFactory{
    private Map<String,Product> products = new HashMap<String,Product>();
    public Product lookUp(String productName){
        if(!products.containsKey(productName))
            products.put(productName, new Product(productName));
        return products.get(productName);  
    }
    public int totalProductsMade(){
        return products.size();
    }
}
class Bucket{
    private final PortfolioFlyweightFactory portfolio = new PortfolioFlyweightFactory();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();
    
    public void processOrder(String productName,int orderNo){
        Product product = portfolio.lookUp(productName);
        Order order = new Order(orderNo,product);
        orders.add(order);
        
    }
    
    public void process(){
        for(Order order:orders){
            order.processOrder();
            orders.remove(order);
        }
       
    }
    public int getTotalProductOrders(){
        return portfolio.totalProductsMade();
    }
}
class Order{
    private final int orderNumber;
    private final Product product;

    public Order(int orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }
    public void processOrder(){
        System.out.println("Procesing Order: "+orderNumber +" for product: "+product);
    }
}