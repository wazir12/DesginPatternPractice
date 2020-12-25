/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.LazyInitialization;

/**
 *
 * @author simchu
 */
public class LazySingleton {
    
    //Objec is created at Runtime
    private static LazySingleton lazySingleton;
    
    private LazySingleton(){
        //System.out.println("This Not a Thread Safe LazySingleton");
    }
    //THis method without Synchronization is not thread safe
    // multiple thread accessing this method can create multiple instances
    public static  LazySingleton getInstance(){
        if(lazySingleton == null){
          System.out.println("This Not a Thread Safe LazySingleton");
            lazySingleton = new LazySingleton();
                   
        }
        return lazySingleton;
    }
    public static synchronized LazySingleton getSynchronizedInstance(){
        
       //This approach reduces the performance because of the
       //cost associated with the synchronized method.
       System.out.println("This is Thread Safe LazySingleton");
      if(lazySingleton == null){
            lazySingleton = new LazySingleton();
           // System.out.println("This is Thread Safe LazySingleton");       
        }
        return lazySingleton;  
    }
}
