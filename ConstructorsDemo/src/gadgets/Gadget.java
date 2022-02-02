/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gadgets;

/**
 *
 * @author ajay
 */
public class Gadget {
    private int gadgetId;
    private String gadgetName;
    private double gadgetPrice;
/*
    public Gadget(int gadgetId, String gadgetName, double gadgetPrice) {
        this.gadgetId = gadgetId;
        this.gadgetName = gadgetName;
        this.gadgetPrice = gadgetPrice;
    }
    
    public Gadget(String gadgetName, int gadgetId, double gadgetPrice){
        this.gadgetName = gadgetName;
        this.gadgetId = gadgetId;
        this.gadgetPrice = gadgetPrice;
    }
    
    public Gadget(String gadgetName, double gadgetPrice){
        this.gadgetName = gadgetName;
        this.gadgetPrice = gadgetPrice;
        this.gadgetId = -99;
    }
    
    public Gadget(int gadgetId){
        this.gadgetId = gadgetId;
    }
    
    public Gadget(){
        this.gadgetId = -99;
        this.gadgetName = "Unknown, not yet invented!";
        this.gadgetPrice = -99.99;
    }
*/
    public int getGadgetId() {
        return gadgetId;
    }

    public void setGadgetId(int gadgetId) {
        this.gadgetId = gadgetId;
    }

    public String getGadgetName() {
        return gadgetName;
    }

    public void setGadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public double getGadgetPrice() {
        return gadgetPrice;
    }

    public void setGadgetPrice(double gadgetPrice) {
        this.gadgetPrice = gadgetPrice;
    }

    @Override
    public String toString() {
        return "Gadget{" + "gadgetId=" + gadgetId + ", gadgetName=" + gadgetName
                + ", gadgetPrice=" + gadgetPrice + '}';
    }
    
    
}
