package fr.afcepf.atod.ws.delivery.dto;

import java.io.Serializable;
/**
 * Data Transfer Object of the delivery Entity.
 * @author Zouheir
 *
 */
public class DTDelivery implements Serializable{

    /**
     * Serialization Id.
     */
    private static final long serialVersionUID = -7776382446851334250L;
    
    /**
     * Unique identifier.
     */
    private Integer id;
    /**
     * Delivry name.
     */
    private String name;
    /**
     * Delivry codePays.
     */
    private String codePays;
    /**
     * Delivery rate based on euro.
     */
    private Double rate;

    /**
     * Delivery quantity.
     */
    private Integer quantity;

    /**
     * Default construcor.
     */
    public DTDelivery() {
        super();
    }

    /**
     * Constructor with parameters.
     * 
     * @param paramId
     *            id
     * @param paramcodePays
     *            codePays
     * @param paramName
     *            name
     * @param paramRate
     *            DTdelivery rate
     * @param paramQuantity
     *            DTdelivery quantity
     */
    public DTDelivery(Integer paramId, String paramCodePays, String paramName, Double paramRate, Integer paramQuantity) {
        super();
        this.id = paramId;
        this.codePays = paramCodePays;
        this.name = paramName;
        this.rate = paramRate;
        this.quantity = paramQuantity;
    }

    /**
     * public accessor for id.
     * 
     * @return Integer id
     */
    public Integer getId() {
        return id;
    }

    /**
     * public mutator for id.
     * 
     * @param paramId
     *            id
     */
    public void setId(Integer paramId) {
        id = paramId;
    }
    /**
     * public accessor for codePays.
     * @return String codePays
     */
    public String getCodePays() {
        return codePays;
    }

    /**
     * public mutator for codePays.
     * 
     * @param paramCodePays
     *            codePays
     */
    public void setCodePays(String paramCodePays) {
        codePays = paramCodePays;
    }
    /**
     * public accessor for name.
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * public mutator for name.
     * 
     * @param paramName
     *            name
     */
    public void setName(String paramName) {
        name = paramName;
    }

    /**
     * public accessor for rate.
     * 
     * @return Double rate
     */
    public Double getRate() {
        return rate;
    }

    /**
     * public mutator for rate.
     * 
     * @param paramRate
     *            rate
     */
    public void setRate(Double paramRate) {
        rate = paramRate;
    }

    /**
     * public accessor for quantity.
     * 
     * @return Integer id
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * public mutator for quantity.
     * 
     * @param paramQuantity
     *            quantity
     */
    public void setQuantity(Integer paramQuantity) {
        quantity = paramQuantity;
    }
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "DTDelivery [id=" + id + ", name=" + name + ", codePays=" + codePays + ", rate=" + rate + ", quantity="
                + quantity + "]";
    }
}
