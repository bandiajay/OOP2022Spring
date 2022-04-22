/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employees;

/**
 *
 * @author ajay
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Employee("John", "Smith", "34354-7887");
        System.out.println(emp1.toString());
        
        HourlyEmployee hrEmp1 = new HourlyEmployee("Adam", "Bob", "7667-28367", 10, 15);
        System.out.println(hrEmp1.toString());        
        System.out.println(hrEmp1.calcSalary());
        
        //**************************
        
        //assigning a subclass instance to a super class instance.
        emp1 = hrEmp1;
        // hrEmp1 = emp1; illegal cannot assign to super class to sub class.
        System.out.println(emp1.toString());
        
       
    }
    
}
