/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.CommandDesignPattern;

/**
 *
 * @author simchu
 */
public class ACAutomationRemoteInvoker {
    ICommandAc iCommand; 

    public void setiCommand(ICommandAc iCommand) {
        this.iCommand = iCommand;
    }
    public void buttonPressed(){
        iCommand.execute();
    }
    
    
}
