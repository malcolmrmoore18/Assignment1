/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwareassignment1v3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Malcolm Moore 11/3/22
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        List<Pet> petList = new ArrayList<Pet>();
        Pet Kitty = new Pet(petList.size(), "Kitty", 8);
        petList.add(Kitty);
        Pet Bruno = new Pet(petList.size(), "Bruno", 7);
        petList.add(Bruno);
        Pet Boomer = new Pet(petList.size(), "Boomer", 8);
        petList.add(Boomer);
        
        boolean isRunning = true;
        
        while (isRunning){
            System.out.println("Pet Database Program");
            System.out.println("What would you like to do?");
            System.out.println("1) View all pets");
            System.out.println("2) Add more Pets");
            System.out.println("3) Update an existing pet");
            System.out.println("4) Remove an existing pet");
            System.out.println("5) Search pet by name");
            System.out.println("6) Search pet by age");
            System.out.println("7) Exit program");
            System.out.print("Your response: ");
            
            int response = input.nextInt();
            input.nextLine();
            
            if (response == 1){
                System.out.println(petList.size());
                System.out.println("+----------------------+");
                System.out.println("| ID |   Name   |  Age |");
                System.out.println("+----------------------+");
                for (Pet p: petList){
                    System.out.printf("| %s  | %-9s|  %s   |\n", p.getID(), p.getName(), p.getAge());
                }
                System.out.println("+----------------------+");
                System.out.printf("%s rows in set.\n", petList.size());
                System.out.println("");
                
            }
            
            else if (response == 2){
                System.out.print("Enter pet's name: ");
                String petName = input.nextLine();
                System.out.print("Enter pet's age: ");
                int petAge = input.nextInt();
                input.nextLine();
                
                Pet newPet = new Pet(petList.size(), petName, petAge);
                petList.add(newPet);
            }
            
            else if (response == 3){
                System.out.print("Enter the ID of the pet to be updated: ");
                int petUpdate = input.nextInt();
                input.nextLine();
                
                System.out.print("Enter new pet name: ");
                String newName = input.nextLine();
                System.out.print("Enter new pet age: ");
                int newAge = input.nextInt();
                input.nextLine();
                
                for (Pet p: petList){
                    if (p.getID() == petUpdate){
                        p.updateName(newName);
                        p.updateAge(newAge);
                    }
                }
            }
            
            else if (response == 4){
                
                System.out.print("Enter the ID of the pet to be removed: ");
                int petRemove = input.nextInt();
                input.nextLine();
                
                for (Pet p: petList){
                    if (p.getID() == petRemove){
                        petList.remove(p);
                    }
                    
                }
                
                for (Pet p: petList){
                    if (p.getID() > petRemove){
                        p.updateID(p.getID() - 1);
                    }
                }
            }
            
            else if (response == 5){
                System.out.print("Enter a name to search: ");
                String nameSearch = input.nextLine();
                
                System.out.println("+----------------------+");
                System.out.println("| ID |   Name   |  Age |");
                System.out.println("+----------------------+");
                
                int numRows = 0;
                for (Pet p: petList){
                    if (p.getName().equals(nameSearch)){
                       System.out.printf("| %s  | %-9s|  %s   |\n", p.getID(), p.getName(), p.getAge()); 
                       numRows++;
                    }                    
                }
                System.out.println("+----------------------+");
                System.out.printf("%s rows in set.\n\n", numRows);
                System.out.println("");
            }
            
            else if (response == 6){
                System.out.print("Enter an age to search: ");
                int ageSearch = input.nextInt();
                input.nextLine();
                
                System.out.println("+----------------------+");
                System.out.println("| ID |   Name   |  Age |");
                System.out.println("+----------------------+");
                
                int numRows = 0;
                for (Pet p: petList){
                    if (p.getAge() == ageSearch){
                       System.out.printf("| %s  | %-9s|  %s   |\n", p.getID(), p.getName(), p.getAge()); 
                       numRows ++;
                    }                    
                }
                System.out.println("+----------------------+");
                System.out.printf("%s rows in set.\n", numRows);
                System.out.println("");
            }
            
            else if (response == 7){
                isRunning = false;
            }
            
            else{
                System.out.println("input error");
            }
        }
    }
    
}
