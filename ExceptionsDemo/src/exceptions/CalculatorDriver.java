/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;

/**
 *
 * @author AJAY
 */
public class CalculatorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculator calc = new Calculator(-3, 4);
        try {
            System.out.println(calc.add());
            System.out.println(calc.sub());
            System.out.println(calc.div());
            System.out.println(calc.mul());
            System.out.println("I am done!");
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }catch(OverDraftException ex){
           System.out.println(ex);
            System.out.println(ex.getMessage()); 
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("I am always executed!");
        }

    }

}
