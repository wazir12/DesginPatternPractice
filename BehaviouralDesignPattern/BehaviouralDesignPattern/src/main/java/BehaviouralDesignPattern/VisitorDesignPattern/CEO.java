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
public class CEO implements Visitor{

    private String ceoName;

    public CEO(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }
    
    @Override
    public void visitConcreteElement(Element e) {
       Employee employee = (Employee)e;
       employee.setEmpRating("Good");
       System.out.println("This is to Certify that Mr "+employee.getEmpName()+" has got the rating from CEO: "
               +employee.getEmpRating()+"\nThanks!\n"+this.getCeoName());
       
       
    }
    
}
