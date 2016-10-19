package fr.afcepf.atod.ws.delivery.biz.api;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import fr.afcepf.atod.ws.delivery.dto.DTDelivery;
import fr.afcepf.atod.ws.delivery.dto.DeliveryQuantity;
import fr.afcepf.atod.ws.delivery.exception.DeliveriesWSException;

/**
 * API of the Currencies Converter WS.
 * @author Zouheir
 */
@Remote
@WebService(targetNamespace = "fr.afcepf.al28.delivery")
public interface IDeliveryCalculator {
    /**
     * Get the complete list of {@link DTDelivery} availables.
     * @throws DeliveriesWSException
     *             custom exception
     * @return List list of {@link DTDelivery}
     */
    List<DTDelivery> getAllDeliveries() throws DeliveriesWSException;


    Double getRateDeliveryTotal(DeliveryQuantity dtd) throws DeliveriesWSException;

}
