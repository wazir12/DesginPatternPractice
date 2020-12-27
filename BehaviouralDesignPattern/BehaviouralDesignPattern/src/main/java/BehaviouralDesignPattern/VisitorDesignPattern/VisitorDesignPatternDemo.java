/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.VisitorDesignPattern;

import java.util.ArrayList;

/**
 *
 * @author simchu
 */
public class VisitorDesignPatternDemo {
    static ArrayList<Element> employeeList;
    public static void main(String[] args){
       employeeList = new ArrayList<Element>();
        Element emp1 = new Employee("EMPLOYEE1");
        Element emp2 = new Employee("EMPLOYEE2");
        Element emp3 = new Employee("EMPLOYEE3");
        Element emp4 = new Employee("EMPLOYEE4"); 
        Element emp5 = new Employee("EMPLOYEE5");
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        Visitor v = new CEO("THE CEO OF THE COMPANY");
        for(Element e: employeeList){
            e.accept(v);
        }
        
        
        
           
        
       
    }
   
            
    
}
