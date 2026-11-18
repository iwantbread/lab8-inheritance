package ie.atu.demo;

public class VIPTicket extends Ticket {
    public VIPTicket(String eventName, String holderName, double basePrice) {

        super(eventName, holderName, basePrice);
    }


    @Override
    public double calculatePrice() {
        return getBasePrice() + 25;
    }

    public String getBenefits() {
        return "Priority entry and reserved seating";
    }
}
