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
        int cont=2;
        Chicken chicken;
        ChickenCoop chickenCoop = null;
        ArrayList<Chicken> chickens = new ArrayList<>(); 


        chicken =new Chicken(0,"Lucy","White and brown",0,true);
         chickenCoop = new ChickenCoop(0, chickens); 
        System.out.println("chicken -->" + chicken);
        System.out.println("Chickens in the Chicken coop  -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        chicken =new Chicken(1,"Daysi","White",0,true);
        chickenCoop.add(chicken);
        System.out.println("Chickens in the Chicken coop  -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        chicken =new Chicken(2,"Renata","Black",0,true);
        chickenCoop.add(chicken);
        System.out.println("Chickens in the Chicken coop  -->" + chickenCoop.countChickens());
        System.out.println("chicken coop -->" + chickenCoop);
        
        while(true){
        
        int option = 0;
        String data = "" ;
        
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
        System.out.println("4 .-  Exit");
        
        Scanner read = new Scanner(System.in);
        
        option = read.nextInt();
                
            if (option==1) {
                
                System.out.println("Data entry");
                cont++;
                System.out.println("Name of Chicken --->   ");
                name = read.next();
                System.out.println("Color of Chicken --->   ");
                color = read.next();
                System.out.println("Age of Chicken --->   ");
                age = read.nextInt();
                
                chicken =new Chicken(cont,name,color,age,true);
                chickenCoop.add(chicken);
                }
            
            else if(option==2){
                chickenCoop.remove(chicken);  
            }
            
            else if(option==3){
            System.out.println("Chickens in the Chicken coop  -->" + chickenCoop.countChickens());
            System.out.println("chicken coop -->" + chickenCoop);
            }
            
            else if(option==4){
                break;
            }
        } 
    }
}
