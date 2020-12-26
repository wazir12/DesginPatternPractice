/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.MediatorDesignPattern;

/**
 *
 * @author simchu
 */
public class MediatorDesignPattern {
    public static void main(String[] args){
       Mediator med = new MediatorImp();
        
       UserColleague user1 = new UserImpl(med,"Lalit");
       UserColleague user2 = new UserImpl(med,"Arun");
        UserColleague user3 = new UserImpl(med,"JACK");
        med.registerUser(user1);
        med.registerUser(user2);
        med.registerUser(user3);
        
        user1.send("hello");
        
        
       
    }
    
}
