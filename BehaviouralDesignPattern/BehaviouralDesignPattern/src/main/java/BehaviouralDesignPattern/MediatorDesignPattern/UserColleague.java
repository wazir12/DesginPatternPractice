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
public abstract class UserColleague {
    protected Mediator mediator;
    protected String name;

    public UserColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
   
    public abstract void send(String Message);
    public abstract void recieve(String message);
    
}

class UserImpl extends UserColleague{

    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String Message) {
       System.out.println(this.name+" :Sending Message : "+Message);
       mediator.sendMessage(Message,this);
    }

    @Override
    public void recieve(String message) {
       System.out.println(this.name+" :Message Recieved: "+message);
    }
    
}
