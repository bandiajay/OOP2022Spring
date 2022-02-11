/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerdemo;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String enteredName = scan.nextLine();
        System.out.println(enteredName);
        
        System.out.println("Enter the age: "); 
        int enteredAge = scan.nextInt();
        System.out.println(enteredAge); 
        
        System.out.println("Enter teh GPA: ");
        double enteredGPA = scan.nextDouble();
        System.out.println(enteredGPA);
        
        System.out.println("Enter your program name: ");
        scan.nextLine();
        String enteredProgramName = scan.nextLine();
        System.out.println(enteredProgramName);
       
        
      
    }
    
}
