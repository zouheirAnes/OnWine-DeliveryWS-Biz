package fr.afcepf.atod.ws.delivery.biz.api;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.afcepf.atod.ws.delivery.dto.DTDelivery;
import fr.afcepf.atod.ws.delivery.exception.DeliveriesWSException;

/**
 * API of the Currencies Converter WS.
 * @author Zouheir
 */
@Remote
@WebService
public interface IDeliveryCalculator {
    /**
     * Get the complete list of {@link DTDelivery} availables.
     * @throws DeliveriesWSException
     *             custom exception
     * @return List list of {@link DTDelivery}
     */
    List<DTDelivery> getAllDeliveries() throws DeliveriesWSException;

    /**
     * method to get the delivery rate by country.
     * @param srcCountryName name of country Delivery
     * @throws DeliveriesWSException custom exception
     * @return Double rate delivery amount
     */
    Double getRateDeliveryByCountry(@WebParam(name = "srcCountryName") String srcCountryName)
            throws DeliveriesWSException;
}
