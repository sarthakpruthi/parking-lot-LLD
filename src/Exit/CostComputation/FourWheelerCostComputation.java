package Exit.CostComputation;

import Exit.PricingStrategy.PricingStrategy;
import Parking.Ticket;

public class FourWheelerCostComputation {

    PricingStrategy pricingStrategy;

    int getPrice(Ticket ticket){
        return pricingStrategy.price(ticket);
    }
}
