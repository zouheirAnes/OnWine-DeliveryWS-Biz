package fr.afcepf.atod.ws.delivery.dto;

import java.io.Serializable;

/**
 * Data Transfer Object of the delivery Entity.
 * 
 * @author Zouheir
 *
 */
public class DTDelivery implements Serializable {

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
     * Delivery international rate
     */
    private Double rateInternational;

    /**
     * @param id
     * @param name
     * @param codePays
     * @param rate
     * @param quantity
     * @param rateInternational
     */
    public DTDelivery(Integer id, String name, String codePays, Double rate, Integer quantity,
            Double rateInternational) {
        super();
        this.id = id;
        this.name = name;
        this.codePays = codePays;
        this.rate = rate;
        this.quantity = quantity;
        this.rateInternational = rateInternational;
    }

    /**
     * 
     */
    public DTDelivery() {
        super();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the codePays
     */
    public String getCodePays() {
        return codePays;
    }

    /**
     * @param codePays
     *            the codePays to set
     */
    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    /**
     * @return the rate
     */
    public Double getRate() {
        return rate;
    }

    /**
     * @param rate
     *            the rate to set
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     *            the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the rateInternational
     */
    public Double getRateInternational() {
        return rateInternational;
    }

    /**
     * @param rateInternational
     *            the rateInternational to set
     */
    public void setRateInternational(Double rateInternational) {
        this.rateInternational = rateInternational;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DTDelivery [id=" + id + ", name=" + name + ", codePays=" + codePays + ", rate=" + rate + ", quantity="
                + quantity + ", rateInternational=" + rateInternational + "]";
    }

}
