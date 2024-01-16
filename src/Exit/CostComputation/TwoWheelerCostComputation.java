package Exit.CostComputation;

import Exit.PricingStrategy.PricingStrategy;
import Parking.Ticket;

public class TwoWheelerCostComputation {

    PricingStrategy pricingStrategy;

    int getPrice(Ticket ticket){
        return pricingStrategy.price(ticket);
    }
}
