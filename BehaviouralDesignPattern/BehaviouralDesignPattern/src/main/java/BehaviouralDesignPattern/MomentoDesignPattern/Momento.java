/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.MomentoDesignPattern;

/**
 *
 * @author simchu
 */
public class Momento {
    Refrigator refri;

    public Momento(Refrigator refri) {
        this.refri = refri;
    }

    public Refrigator getRefri() {
        return refri;
    }

    public void setRefri(Refrigator refri) {
        this.refri = refri;
    }

    @Override
    public String toString() {
        return "Momento{" + "refri=" + refri + '}';
    }
    
    
    
}
