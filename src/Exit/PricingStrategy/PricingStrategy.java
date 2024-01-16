package Exit.PricingStrategy;

import Parking.Ticket;

public interface PricingStrategy {
    int price(Ticket ticket);
}
