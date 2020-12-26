/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simchu
 */
public interface Mediator {
    public void sendMessage(String message, UserColleague  user);
    public void registerUser(UserColleague user);
    
}

class MediatorImp implements Mediator{

    private List<UserColleague> users;

    public MediatorImp() {
        this.users = new ArrayList<UserColleague>();
    }
    
    
    @Override
    public void sendMessage(String message, UserColleague user) {
        for(UserColleague u : this.users){
            // Message should be recieved by user in the list accept the sender
               if(u!=user){
                   u.recieve(message);
               }
        }  
    }

    @Override
    public void registerUser(UserColleague user) {
        this.users.add(user);
    }
    
}
