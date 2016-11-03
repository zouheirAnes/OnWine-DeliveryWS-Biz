package fr.afcepf.atod.ws.delivery.dto;

import java.io.Serializable;

public class DeliveryQuantity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7483777016591547589L;
    
    private String codePays;
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
    public DeliveryQuantity(String codePays, Integer quantity) {
        super();
        this.codePays = codePays;
        this.quantity = quantity;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "DeliveryQuantity [codePays=" + codePays + ", quantity=" + quantity + "]";
    }
    
    

}
