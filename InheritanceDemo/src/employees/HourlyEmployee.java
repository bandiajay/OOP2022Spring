/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author ajay
 */
public class HourlyEmployee extends Employee {
    private int hrsWorked;
    private double hrlyWage;

    public HourlyEmployee(String fName, String lName, String ssn,int  hrsWorked, 
            double hrlyWage) {
        super(fName, lName, ssn);//calling super class constructor
        this.hrsWorked = hrsWorked;
        this.hrlyWage = hrlyWage;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getHrlyWage() {
        return hrlyWage;
    }

    public void setHrlyWage(double hrlyWage) {
        this.hrlyWage = hrlyWage;
    }

    @Override
    public String toString() {
        return super.toString()+ "-:" +hrsWorked +"$"+ hrlyWage;
    }
    
    public double calcSalary(){
        return hrlyWage*hrsWorked;
    }


    
}
