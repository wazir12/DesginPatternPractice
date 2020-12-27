/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.MomentoDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simchu
 */
public class LiveAreaOriginator {
    Refrigator refri;

    public Refrigator getRefri() {
        return refri;
    }

    public void setRefri(Refrigator refri) {
        this.refri = refri;
    }
    
    public Momento createMomento(){
        return new Momento(refri);
    }
    public void getMomento(Momento m){
        refri =  m.getRefri();
    }

    @Override
    public String toString() {
        return "LiveAreaOriginator{" + "refri=" + refri.toString() + '}';
    }
    
    
    
    
}

class CareTaker{
   List<Momento> momentoList = new ArrayList<Momento>();
   
   public void setMomento(Momento m){
       momentoList.add(m);
   }
   
   public Momento getMomento(int index){
       return momentoList.get(index);
   }
   
}
