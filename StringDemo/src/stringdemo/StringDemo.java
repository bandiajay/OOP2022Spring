/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringdemo;

/**
 *
 * @author ajay
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "northwest";
        String str1 = "bearcat";
        
        System.out.println("Upper case: NORTHWEST-- "+str.toUpperCase());
        System.out.println(str.toUpperCase());
        
        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        String res = str.concat(str1);
        System.out.println(res);
        System.out.println(res.toUpperCase());
        
        
        double value1 = 314;
        double result = Math.sqrt(value1);
        System.out.println(result);
        
        
    }
    
}
