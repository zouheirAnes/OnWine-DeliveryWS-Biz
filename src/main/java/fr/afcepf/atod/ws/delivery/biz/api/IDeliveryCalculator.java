package fr.afcepf.atod.ws.delivery.biz.api;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import fr.afcepf.atod.ws.delivery.dto.DTDelivery;
import fr.afcepf.atod.ws.delivery.exception.DeliveriesWSException;

/**
 * API of the Currencies Converter WS.
 * 
 * @author Zouheir
 */
@Remote
@WebService(targetNamespace = "http://delivery.afcepf.fr")
public interface IDeliveryCalculator {
    /**
     * Get the complete list of {@link DTDelivery} availables.
     * 
     * @throws DeliveriesWSException
     *             custom exception
     * @return List list of {@link DTDelivery}
     */
    List<DTDelivery> getAllDeliveries() throws DeliveriesWSException;

    /*
     * Get the rate of local {@link DTDelivery}.
     * 
     * @throws DeliveriesWSException
     *             custom exception
     * @return Double rate of local Delivery
     */
    Double getRateDeliveryTotal(String codePays, Integer quantity) throws DeliveriesWSException;
    
    /*
     * Get the rate of international local {@link DTDelivery}.
     * 
     * @throws DeliveriesWSException
     *             custom exception
     * @return Double rate of local Delivery
     */
    Double getInternationalRateDelivery(String codePays, Integer quantity) throws DeliveriesWSException;

}
