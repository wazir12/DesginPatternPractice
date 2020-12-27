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
public class Employee implements Element{

    private String empName;
    private String empRating;

    public Employee(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRating() {
        return empRating;
    }

    public void setEmpRating(String empRating) {
        this.empRating = empRating;
    }
    
    
    @Override
    public void accept(Visitor v) {
        v.visitConcreteElement(this);
    }
    
}
