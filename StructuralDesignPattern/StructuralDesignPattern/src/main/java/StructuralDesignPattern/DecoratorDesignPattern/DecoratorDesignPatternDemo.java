/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.DecoratorDesignPattern;

/**
 *
 * @author simchu
 */
interface Burger{
    
    public void makeBurger();
}
class PlainBurger implements Burger{

    @Override
    public void makeBurger() {
        System.out.println("Plain Burger is ready!!");
    }
    
}
abstract class BurgerDecorator extends PlainBurger{
    Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void makeBurger() {
        burger.makeBurger(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class CheeseBurger extends BurgerDecorator{

    public CheeseBurger(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println("Cheese Added");
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
public class DecoratorDesignPatternDemo {
    public static void main(String[] args){
       Burger burger = new PlainBurger();
       burger.makeBurger();
       new CheeseBurger(burger).makeBurger();
    }
}
