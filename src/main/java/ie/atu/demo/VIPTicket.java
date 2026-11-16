package ie.atu.demo;

public class VIPTicket extends Ticket {
    public VIPTicket() {
        super();
    }

    public double VIPPrice() {
        return getBasePrice() + 25;
    }

    public String getBenefits() {
        return "Priority entry and reserved seating";
    }
}
