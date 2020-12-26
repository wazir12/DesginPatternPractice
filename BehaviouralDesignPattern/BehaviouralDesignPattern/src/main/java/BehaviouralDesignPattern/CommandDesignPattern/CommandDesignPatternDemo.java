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

public class CommandDesignPatternDemo {
    
    public static void main(String[] args){
        
        AC ACRoomOne = new AC();
        AC ACRoomTwo = new AC();
        System.out.println("Starting AC of Room One..");
        ACAutomationRemoteInvoker remoteInvoker = new ACAutomationRemoteInvoker();
        remoteInvoker.setiCommand(new ACTurnOnCommand(ACRoomOne));
        remoteInvoker.buttonPressed();
         
        System.out.println("Starting AC of Room Two..");
        remoteInvoker.setiCommand(new ACTurnOnCommand(ACRoomTwo));
        remoteInvoker.buttonPressed();
        
        System.out.println("Incrementing AC Temp of Room One..");
        remoteInvoker.setiCommand(new ACIncTempCommand(ACRoomOne));
        remoteInvoker.buttonPressed();
        
        System.out.println("Incrementing AC Temp of Room Two..");
        remoteInvoker.setiCommand(new ACIncTempCommand(ACRoomTwo));
        remoteInvoker.buttonPressed();
        
        
        
        
        
    }
    
}
