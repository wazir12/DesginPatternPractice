/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.ChainOfResponsibilityDesignPattern;

/**
 *
 * @author simchu
 */
public class Manager extends LoanApproval {

    @Override
    public void approveLoan(Loan loan) {
      if(loan.getAmount()<=5000){
          System.out.println("Loan Approved by Manager");
      }
      else{
          nextLoanApproval.approveLoan(loan);
      }
    }
    
    
}
class Director extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
      if(loan.getAmount()<=100000){
          System.out.println("Approved by Director!!");
      }  
      else{
         nextLoanApproval.approveLoan(loan);
      }
    }
    
}
class President extends LoanApproval{

    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount()>100000){
            System.out.println("Loan Approved by President");
        }
    }
    
}
