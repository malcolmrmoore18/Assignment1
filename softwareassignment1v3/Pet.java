/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareassignment1v3;

/**
 *
 * @author malxm
 */
public class Pet {
    private int ID;
    private String name;
    private int age;
    
    public Pet(int ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void updateID(int newID){
        this.ID = newID;
    }
    
    public void updateName(String newName){
        this.name = newName;
    }
    
    public void updateAge(int newAge){
        this.age = newAge;
    }
    
}
