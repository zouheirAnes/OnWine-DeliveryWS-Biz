package fr.afcepf.atod.ws.delivery.biz.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.afcepf.atod.ws.delivery.biz.api.IDeliveryCalculator;
import fr.afcepf.atod.ws.delivery.dao.api.IDeliveryDao;
import fr.afcepf.atod.ws.delivery.dto.DTDelivery;
import fr.afcepf.atod.ws.delivery.entity.Delivery;
import fr.afcepf.atod.ws.delivery.exception.DeliveriesWSException;

/**
 * Concrete Implementation of DeliveryCalculator WS.
 * 
 * @author Zouheir
 *
 */
@Stateless
@WebService(endpointInterface = "fr.afcepf.atod." + "ws.delivery.biz.api.IDeliveryCalculator")
public class DeliveryCalculator implements IDeliveryCalculator, Serializable {

    /**
     * Serialization ID.
     */
    private static final long serialVersionUID = -8825655280684466495L;
    /**
     * injected delivery dao.
     */
    @EJB
    private IDeliveryDao dao;

    @Override
    public List<DTDelivery> getAllDeliveries() throws DeliveriesWSException {
        List<DTDelivery> listDTO = new ArrayList<DTDelivery>();
        for (Delivery d : dao.findAll()) {
            listDTO.add(entityDelivery2DeliveryDTO(d));
        }
        return listDTO;
    }

    /**
     * Utility method used for converting a DAO entity to a DTO.
     * @param c {@link Delivery}
     * @return {@link DTDelivery}
     */
    private DTDelivery entityDelivery2DeliveryDTO(Delivery d) {
        return new DTDelivery(d.getId(), d.getName(), d.getRate());
    }

    @Override
    public Double getRateDeliveryByCountry(String srcCountryName) throws DeliveriesWSException {
        Delivery d = dao.findByName(srcCountryName);
        return d.getRate();
    }
}
