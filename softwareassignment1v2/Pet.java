/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareassignment1v2;

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
}
