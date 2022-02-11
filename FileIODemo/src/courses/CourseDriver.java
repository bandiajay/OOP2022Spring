/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class CourseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Scanner scan = new Scanner(new File("courses.txt"));
        PrintWriter write = new PrintWriter(new File("BandiOutput.txt"));
        
        while(scan.hasNext()){
            int crsId = scan.nextInt();
            scan.nextLine();
            String crsName = scan.nextLine();
            int creditHrs = scan.nextInt();
            Course c = new Course(crsId, crsName, creditHrs);
            System.out.println(c);
            write.println(c);
        }//while loop ends
        scan.close();
        write.close();
    }
    
}
