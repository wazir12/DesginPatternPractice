/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehaviouralDesignPattern.StrategyDesignPattern;

/**
 *
 * @author simchu
 */
public class FileContext {
    
    private String file_name;
    Strategy strategy;

    public FileContext(Strategy strategy) {
        this.strategy = strategy;
    }

    
    public FileContext(String file_name, Strategy strategy) {
        this.file_name = file_name;
        this.strategy = strategy;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void handle(){
       this.strategy.compressFile(this.file_name);
    }
    
    
}
