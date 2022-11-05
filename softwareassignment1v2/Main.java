/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwareassignment1v2;

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
            System.out.println("3) Search pet by name");
            System.out.println("4) Search pet by age");
            System.out.println("5) Exit program");
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
                System.out.printf("%s rows in set.\n", numRows);
                System.out.println("");
            }
            
            else if (response == 4){
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
                       numRows++;
                    }                    
                }
                System.out.println("+----------------------+");
                System.out.printf("%s rows in set.\n", numRows);
                System.out.println("");
            }
            
            else if (response == 5){
                isRunning = false;
            }
            
            else{
                System.out.println("input error");
            }
        }
    }
    
}
