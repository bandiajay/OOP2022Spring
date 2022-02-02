/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an object
        Dog d1 = new Dog("Jimmy", "Pug", 4);
        
        String d1Name = d1.getName();
        System.out.println(d1Name);
        
        System.out.println(d1.getName());
        
        d1.setName("Puppy");
        System.out.println(d1.getName());
        
        //Invoke toString
        String result = d1.toString();
        System.out.println(result);
        
        System.out.println(d1.toString());
        
        
    }
    
}
