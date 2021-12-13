package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author jhon guitarra
 */
public class FarmSystem {
    
    public static void main(String[] args) {

        Chicken chicken = null;
        ChickenCoop chickenCoop = null;
        ArrayList<Chicken> chickens = new ArrayList<>(); 

        chickenCoop = new ChickenCoop(0, chickens); 
        
        while(true){
             
            int id=1;
            String name= "Lucy";
            String color="white and brown";
            int age = 2;
            boolean molting = true;

            System.out.println("GUITARRA JHON");
            System.out.println("Menu");
            System.out.println("1 .-  Add chickens");
            System.out.println("2 .-  Remove chickens");
            System.out.println("3 .-  Show chickens in the coop");
            System.out.println("4 .-  Show the amount of chickens");
            System.out.println("5 .-  Exit");

            Scanner read = new Scanner(System.in);
            int option = read.nextInt();
                
            if (option==1) {
                
                System.out.println("Data entry");
                System.out.println("ID of Chicken --->   ");
                id = read.nextInt();
                System.out.println("Name of Chicken --->   ");
                name = read.next();
                System.out.println("Color of Chicken --->   ");
                color = read.next();
                System.out.println("Age of Chicken --->   ");
                age = read.nextInt();
                
                chicken =new Chicken(id,name,color,age,true);
                chickenCoop.add(chicken);
                }
            
            else if(option==2){
                chickenCoop.remove(chicken);  
            }
            else if(option==3){
                System.out.println("chicken in the coop -->" + chickenCoop);
            }
            else if(option==4){
                System.out.println("Amount of Chicken  -->" + chickenCoop.countChickens());
            }
            else if(option==5){
                break;
            }
        } 
    }
}
