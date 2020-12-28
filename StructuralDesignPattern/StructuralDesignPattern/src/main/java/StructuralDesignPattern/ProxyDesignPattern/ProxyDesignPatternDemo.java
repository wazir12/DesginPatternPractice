/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.ProxyDesignPattern;

/**
 *
 * @author simchu
 */

interface image{
    public void displayImage();
}
class ActualImage implements image{

    @Override
    public void displayImage() {
       System.out.println("This is the real image");
    }
}
//protection proxy
class ProxyImage implements image{

    ActualImage realImage;

    
    
    @Override
    public void displayImage() {
            System.out.println("Checking Security Access!!");
            System.out.println("Security check is good!!");
            realImage = new ActualImage();
            realImage.displayImage();
    }
    
}
//remote proxy
class ProxyImageCache implements image{

    ActualImage realImage;

    
    
    @Override
    public void displayImage() {
            System.out.println("Checking if image is in Cache...");
            realImage = new ActualImage();
            realImage.displayImage();
    }
    
}
public class ProxyDesignPatternDemo {
    public static void main(String[] args){
        ProxyImage proxy = new ProxyImage();
        proxy.displayImage();
        
        ProxyImageCache remoteProxy = new ProxyImageCache();
        remoteProxy.displayImage();
    }
}
