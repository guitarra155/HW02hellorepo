package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhon guitarra
 */
public class ChickenCoop {
    private int id;
   private ArrayList<Chicken> chickens;

   public void add(Chicken chicken){
       chickens.add(chicken);
       
   }
   
   public void remove(Chicken chicken){
    Scanner read = new Scanner(System.in); 
    System.out.println("Enter the chicken id for delete--->");
    id = read.nextInt();
      // if (chickens.listIterator()) {
           
      // }
    
    
    Chicken search = chickens.get(id);
    chickens.remove(id-1);
               
   }
   public int countChickens(){
       return chickens.size();
   }
    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    
    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }

   
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
   


    
}
