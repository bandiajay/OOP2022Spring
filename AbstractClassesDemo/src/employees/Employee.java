/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author AJAY
 */
public abstract class Employee {
    private String ssn;
    private String fName;
    private String lName;

    public Employee(String ssn, String fName, String lName) {
        this.ssn = ssn;
        this.fName = fName;
        this.lName = lName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Employee{" + "ssn=" + ssn + ", fName=" + fName + ", lName=" + lName + '}';
    }
    
    public abstract double calcSalary();

            
}
