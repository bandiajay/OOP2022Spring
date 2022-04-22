/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employees;

/**
 *
 * @author AJAY
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee emp = new Employee("", "", "") {
            @Override
            public double calcSalary() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        //Polymorphic substitution
        Employee emp1 = new HourlyEmploee("123", "John", "Smith", 10, 12);
        System.out.println(emp1.calcSalary());//late bingding polymorphism
        
        
        
        
        
        
    }
    
}
