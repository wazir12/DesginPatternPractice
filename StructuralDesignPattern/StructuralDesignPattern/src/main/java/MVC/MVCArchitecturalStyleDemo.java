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
public class MVCArchitecturalStyleDemo {
 public static void main(String[] args){
     StudentController controller = new StudentController(new StudentModel(),new StudentView());
     controller.setStudentName("Lalit");
     controller.setStudentRollNo("70");
     controller.updateView();
 }   
}
