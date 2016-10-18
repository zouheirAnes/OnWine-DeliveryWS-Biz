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
     * Delivery rate based on euro.
     */
    private Double rate;

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
     * @param paramName
     *            name
     * @param paramRate
     *            delivery rate
     */
    public DTDelivery(Integer paramId, String paramName, Double paramRate) {
        super();
        this.id = paramId;
        this.name = paramName;
        this.rate = paramRate;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DTDelivery [id=" + id + ", name=" + name + ", rate=" + rate + "]";
    }

}
