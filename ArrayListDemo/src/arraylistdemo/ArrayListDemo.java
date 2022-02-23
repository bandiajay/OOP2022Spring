/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myCities = new ArrayList<String>();
        myCities.add("Maryville");
        myCities.add("KC");
        myCities.add("Boston");
        myCities.add("Saint Louis");
        //myCities.add();
        
        for(String city: myCities){
            System.out.println(city);
        }
        System.out.println("*************");
        for(int i =0; i<myCities.size(); i++){
            System.out.println(myCities.get(i));
        }
        System.out.println("**************");
        System.out.println(myCities);
        
        myCities.add(2, "Chicago");
        //size is 5; index is from 0 to 4
        myCities.add(4, "St. Jo");
        //size is 6; index 0 to 5
        myCities.add(6, "Memphis");
        //myCities.add(8, "Memphis");
        
        System.out.println("**************");
        System.out.println(myCities);  
        
        for(int i=0; i<myCities.size(); i++){
            myCities.remove(i);
        }
        
        System.out.println("**************");
        System.out.println(myCities);  
        System.out.println("The list contains Chicago? "+myCities.contains("Chicago"));
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(new Integer(4));//numbers.add(4)
        numbers.add(6);
        numbers.add(8);
        numbers.remove(new Integer(2));
        
        System.out.println("**********");
        System.out.println(numbers);
        
        
        
    }
    
}
