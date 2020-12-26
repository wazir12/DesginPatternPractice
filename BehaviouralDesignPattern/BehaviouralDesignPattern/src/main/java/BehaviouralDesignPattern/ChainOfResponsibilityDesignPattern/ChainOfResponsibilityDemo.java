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
//Entity
class Loan{
   private  int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
   
}

//Main Handler
abstract class LoanApproval{
    
    protected LoanApproval nextLoanApproval = null;
    public void setNextLoanApproval(LoanApproval nextLoanApproval){
        this.nextLoanApproval = nextLoanApproval;
    }
    public abstract void approveLoan(Loan loan);
}


public class ChainOfResponsibilityDemo {
    public static void main(String[] args){
     
      LoanApproval m = new Manager();
      LoanApproval d = new Director();
      LoanApproval p= new President();
      
      m.setNextLoanApproval(d);
      d.setNextLoanApproval(p);
     
    Loan loan = new Loan();
    loan.setAmount(5000);
    m.approveLoan(loan);
       
    Loan loan2 = new Loan();
    loan2.setAmount(10000);
    m.approveLoan(loan2);
      
    Loan loan3 = new Loan();
    loan3.setAmount(1000000);
    m.approveLoan(loan3);
      
      
      
    }
    
}
