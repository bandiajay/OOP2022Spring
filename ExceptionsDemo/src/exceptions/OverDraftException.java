/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author AJAY
 */
public class OverDraftException extends RuntimeException {

    public OverDraftException() {
    }

    public OverDraftException(String message) {
        super(message);
    }
    
}
