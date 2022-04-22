/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ajay
 */
public class HalfGA extends GA{

    public HalfGA(String fName, String lName, String ssn) {
        super(fName, lName, ssn);
    }

    @Override
    public double calcSalary() {
        return SALARY/2;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
