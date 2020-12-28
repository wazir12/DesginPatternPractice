/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author simchu
 */
public class StudentModel {
    private String name;
    private String rollNo;

    public String getName() {
         System.out.println("Student Controller getting name from model...");
        return name;
    }

    public void setName(String name) {
         System.out.println("Student Controller setting name in model...");
        this.name = name;
    }

    public String getRollNo() {
        System.out.println("Student Controller getting RollNo from model...");
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        System.out.println("Student Controller setting Student Roll Number in model...");
        this.rollNo = rollNo;
    }
    
    
    
    
}
