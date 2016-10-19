package fr.afcepf.atod.ws.delivery.dto;

import java.io.Serializable;

public class DeliveryQuantity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7483777016591547589L;
    
    private String srcCountryName;
    private Integer quantity;
    
    /**
     * 
     */
    public DeliveryQuantity() {
        super();
    }

    /**
     * @param srcCountryName
     * @param quantity
     */
    public DeliveryQuantity(String srcCountryName, Integer quantity) {
        super();
        this.srcCountryName = srcCountryName;
        this.quantity = quantity;
    }

    public String getSrcCountryName() {
        return srcCountryName;
    }

    public void setSrcCountryName(String srcCountryName) {
        this.srcCountryName = srcCountryName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DeliveryQuantity [srcCountryName=" + srcCountryName + ", quantity=" + quantity + "]";
    }
    
    

}
