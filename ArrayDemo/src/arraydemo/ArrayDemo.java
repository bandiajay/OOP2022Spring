/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

/**
 *
 * @author ajay
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] numbers = new double[10];
        
        
        
        System.out.println(numbers.length);
        numbers[5] = 88.34;
        
        System.out.println(numbers[5]);
        System.out.println(numbers[7]);
        
        
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = Math.sqrt(i);
        }
        
        System.out.println("******************");
        
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]); 
       }
        
        System.out.println(numbers[9]);
        
        System.out.println("**********enhnaced for loop**********");
        
        for(double num: numbers){
            System.out.println(num);
        }
        
        System.out.println("**************");
        for(double num:numbers){
            num = Math.sqrt(num);
            System.out.println(num); 
       }
    }

}
