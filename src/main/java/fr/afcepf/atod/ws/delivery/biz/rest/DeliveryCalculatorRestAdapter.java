package fr.afcepf.atod.ws.delivery.biz.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.afcepf.atod.ws.delivery.biz.api.IDeliveryCalculator;
import fr.afcepf.atod.ws.delivery.dao.api.IDeliveryDao;
import fr.afcepf.atod.ws.delivery.dto.DTDelivery;
import fr.afcepf.atod.ws.delivery.entity.Delivery;
import fr.afcepf.atod.ws.delivery.exception.DeliveriesWSException;

/**
 * Implementation of rest adapter for the DeliveryCalculator WS.
 * @author Zouheir
 *
 */
@Stateless
@Path("/deliveryCalculator")
@Produces("application/json")
public class DeliveryCalculatorRestAdapter implements IDeliveryCalculator, Serializable {

    /**
     * serialization ID.
     */
    private static final long serialVersionUID = -9152007609034659204L;
    /**
     * injected currency dao.
     */
    @EJB
    private IDeliveryDao dao;
    /**
     * test.
     */
    @GET
    @Path("/listAllDeliveries")
    @Override
    public List<DTDelivery> getAllDeliveries() throws DeliveriesWSException {
        List<DTDelivery> listDTO  = new ArrayList<DTDelivery>();
        for (Delivery d : dao.findAll()) {
            listDTO.add(entityDelivery2DeliveryDTO(d));
        }
        return listDTO;
    }
    /**
     * Utility method used for converting a DAO entity to a DTO.
     * @param d {@link Delivery}
     * @return {@link DTDelivery}
     */
    private DTDelivery entityDelivery2DeliveryDTO(Delivery d) {
        return new DTDelivery(d.getId(),
                d.getName(),
                d.getRate());
    }
    @POST
    @Consumes("application/json")
    @Path("/getRateDeliveryByCountry")
    @Override
    public Double getRateDeliveryByCountry(String srcCountryName) throws DeliveriesWSException {
        Delivery d = dao.findByName(srcCountryName);
        return d.getRate();
    }

}