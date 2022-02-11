/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package books;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the isbn: ");
        String isbn = scan.next();
        
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        
        System.out.println("Enter the publisherName");
        scan.nextLine();
        String publisher = scan.nextLine();
        
        Book b1 = new Book(isbn, price, publisher);
        System.out.println(b1);
    }
    
}
