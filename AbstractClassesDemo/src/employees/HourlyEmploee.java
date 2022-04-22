/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author AJAY
 */
public class HourlyEmploee extends Employee{
    private int hrsWorked;
    private double wageRate;
            
    public HourlyEmploee(String ssn, String fName, String lName, 
            int hrsWorked, double wageRate) {
        super(ssn, fName, lName);
        this.hrsWorked = hrsWorked;
        this.wageRate = wageRate;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return "HourlyEmploee{" + "hrsWorked=" + hrsWorked + ", wageRate=" + wageRate + '}';
    }
    

    @Override
    public double calcSalary() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return wageRate*hrsWorked;
    }
    
    
}
