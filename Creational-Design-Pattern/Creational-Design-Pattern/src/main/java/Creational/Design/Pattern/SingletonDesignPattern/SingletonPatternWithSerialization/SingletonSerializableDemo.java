/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Design.Pattern.SingletonDesignPattern.SingletonPatternWithSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author simchu
 */
public class SingletonSerializableDemo {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
       SingletonWithSerialization obj = SingletonWithSerialization.getInstance();
       System.out.println("Hascode obj1: "+ obj.hashCode());
       saveToFile(obj,"myFile.bin");
       SingletonWithSerialization obj2 = readFile("myFile.bin");
       System.out.println("hashcode of Deserialized Obj: "+ obj2.hashCode());
    }
    //Serialization
    static void saveToFile(SingletonWithSerialization singletonObj, String name) throws IOException{
        
        try(FileOutputStream fout = new FileOutputStream(name);
                ObjectOutputStream Ostream = new ObjectOutputStream(fout);){
            //Serialization
            Ostream.writeObject(singletonObj);
        
        }
    }
        //Deserialization
        static SingletonWithSerialization readFile(String file) throws IOException, 
                ClassNotFoundException{
            try(FileInputStream Fin = new FileInputStream(file);
                    ObjectInputStream oin = new ObjectInputStream(Fin)){
                return (SingletonWithSerialization) oin.readObject();
            }
        }
    
        
}
