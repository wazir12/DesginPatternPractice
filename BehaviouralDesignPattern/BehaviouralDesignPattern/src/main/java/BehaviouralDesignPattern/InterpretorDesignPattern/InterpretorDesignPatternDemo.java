/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.InterpretorDesignPattern;

import java.util.Scanner;

/**
 *
 * @author simchu
 */
abstract class Expression{
    public abstract int interpret();
}

//Terminal Expression
class Number extends Expression{
    
    protected int value = 0;

    public Number(int value) {
        this.value = value;
    }
    

    @Override
    public int interpret() {
       return value;
    }
    
}

//Non Terminal Expression
class Add extends Expression{

    protected Expression lhs = null;
    protected Expression rhs = null;

    public Add(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    
    @Override
    public int interpret() {
     return lhs.interpret() +rhs.interpret();
    }
    
}

//Non Terminal Expression
class Multiply extends Expression{

    protected Expression lhs = null;
    protected Expression rhs = null;

    public Multiply(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    
    @Override
    public int interpret() {
     return lhs.interpret() * rhs.interpret();
    }
    
}
//Non Terminal Expression
class Divide extends Expression{

    protected Expression lhs = null;
    protected Expression rhs = null;

    public Divide(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    
    @Override
    public int interpret() {
     return lhs.interpret() / rhs.interpret();
    }
    
}
//Non Terminal Expression
class Subtract extends Expression{

    protected Expression lhs = null;
    protected Expression rhs = null;

    public Subtract(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    
    @Override
    public int interpret() {
     return lhs.interpret() - rhs.interpret();
    }
    
}


public class InterpretorDesignPatternDemo {
    public static void main(String[] args){
        Evaluator  eval = new Evaluator();
        System.out.println("Enter the Expression in postfix Notation");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        sc.close();
        System.out.println(eval.parse(expression).interpret());
        
        
    }
}
