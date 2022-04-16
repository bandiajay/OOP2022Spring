/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author AJAY
 */
public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int add(){
        return num1 + num2;
    }
    
    public int sub(){
        int diff = num1-num2;
        if(diff < 0){
            throw new OverDraftException("Negavtive values are not allowed!");
        }
        return num1-num2;
    }
    
    public int mul(){
        return num1 * num2;
    }
    
    public int div(){
        if (num2 == 0){
            throw new ArithmeticException("Divisible by 0 is illegal!");
        }
        return num1/num2;
    }
}
