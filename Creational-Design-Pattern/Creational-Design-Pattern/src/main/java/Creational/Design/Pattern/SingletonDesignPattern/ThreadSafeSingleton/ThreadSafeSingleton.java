/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.ThreadSafeSingleton;

/**
 *
 * @author simchu
 */
public class ThreadSafeSingleton {
     //Objec is created at Runtime
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){
        System.out.println("Thread Safe singleton using double locking");
    }
    
    //Overcome the Synchronization overhead
    
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
}
