/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author simchu
 */
public class IteratorDesignPatternDemo {
 
    public static void main(String[] args){
        //Concrete Collection
        List<String> list = new ArrayList<String>();
        list.add("TOM");
        list.add("JACK");
        list.add("HENRY");
        list.add("MICHAEL");
        
        //Concrete Iterator
        Iterator<String> itr = list.iterator();
        System.out.println("The Concrete Iterator: "+itr.toString() );
        while(itr.hasNext()){
            System.out.println("Name: "+itr.next());
        }
        
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("Aloha");
        set.add("konichwa");
        set.add("Hi");
        
        Iterator<String>  setItr = set.iterator();
        System.out.println("Concrete iteraator: "+ setItr.toString());
        while(setItr.hasNext()){
            System.out.println("Greeting :" +setItr.next());
        }
                
        
    }
}
