/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simchu
 */
interface Data{
    public void doubleClick();
}
//Leaf
class File implements Data{
 String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
 
    @Override
    public void doubleClick() {
       System.out.println("Opened File: "+this.getFileName());
    }
    
}
//COmpsosite
class Folder implements Data{
    
    private String folderName;
    List<Data> folder = new ArrayList<Data>();

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void add(Data data){
        folder.add(data);
    }
    public void remove(Data data){
        folder.remove(data);
    }
    @Override
    public void doubleClick() {
        System.out.println(this.getFolderName()+" folder is opened!!");
        for(Data d: folder){
            d.doubleClick();
        }
    }
    
}
public class CompositeDesignPatternDemo {
    public static void main(String[] args){
       Folder folder = new Folder();
       folder.setFolderName("folder1");
       File file1 = new File();
       file1.setFileName("FILE1");
       File file2 = new File();
       file2.setFileName("FILE2");
       folder.add(file1);
       folder.add(file2);
       folder.doubleClick();
       
       
       Folder folder2 = new Folder();
       folder2.setFolderName("folder2");
       File file3 = new File();
       file3.setFileName("FILE3");
       File file4 = new File();
       file4.setFileName("FILE4");
       folder2.add(file3);
       folder2.add(file4);
       folder2.doubleClick();
    }
}
