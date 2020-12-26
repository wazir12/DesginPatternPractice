/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.InterpretorDesignPattern;

import java.util.Stack;

/**
 *
 * @author simchu
 */
public class Evaluator {
    public Expression parse(String text){
        
        //Setting Expression Stack
        Stack<Expression> stack = new Stack<Expression>();
        
        //Parsing texxt
        String[] words = text.split(" ");
        for(String word : words){
            Expression lhs = null;
            Expression rhs = null;
            
            switch(word){
                case "+":
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Add(lhs,rhs));
                    break;
                    
                case "-":
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Subtract(lhs,rhs));
                    break;
                case "*":
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Multiply(lhs,rhs));
                    break;
                case "/":
                    rhs = stack.pop();
                    lhs = stack.pop();
                    stack.push(new Divide(lhs, rhs));
                    break;
                    
                default :
                    int number = Integer.parseInt(word);
                    stack.push(new Number(number));
                    break;
            }
        }
        return stack.pop();
    }
}
