/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.CommandDesignPattern;

/**
 *
 * Contains All the Command Classes
 */

public class ACTurnOnCommand implements ICommandAc {

    AC ac = null;

    public ACTurnOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning On AC.....");
        ac.turnOn();
    }

}

class ACTurnOffCommand implements ICommandAc {

    AC ac = null;

    public ACTurnOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning Off AC.....");
        ac.turnOff();
    }

}

class ACIncTempCommand implements ICommandAc {

    AC ac = null;

    public ACIncTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Incrementing  AC Temperature.....");
        ac.incTemp();
    }

}

class ACDecTempCommand implements ICommandAc {

    AC ac = null;

    public ACDecTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decreasing  AC Temperature.....");
        ac.decTemp();
    }

}
