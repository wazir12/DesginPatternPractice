/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.AdapterDesignPattern;

/**
 *
 * @author simchu
 */
  class FrenchPerson implements ISpeakFrenchTargetInterface{

        @Override
        public void speakFrench() {
            System.out.println("I speak French!!");
        }
        
    }
    class EnglishPerson implements ISpeakEnglish{

        @Override
        public void speakEnglish() {
            System.out.println("I Speak English");
        }
        
    }
    class EnglishToFrenchAdapter implements ISpeakEnglish{

        ISpeakFrenchTargetInterface toFrench;

        public EnglishToFrenchAdapter(ISpeakFrenchTargetInterface toFrench) {
            this.toFrench = toFrench;
        }
        
        
        
        @Override
        public void speakEnglish() {
           this.toFrench.speakFrench();
           System.out.println("English English");
        }
        
    }
public class AdapterDesignPatternDemo {
    
  
    public static void main(String[] args){
       EnglishToFrenchAdapter translator = new EnglishToFrenchAdapter(new FrenchPerson());
       
      translator.speakEnglish();
    }
}
