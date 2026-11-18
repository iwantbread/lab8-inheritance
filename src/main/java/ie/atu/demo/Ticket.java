package ie.atu.demo;

public class Ticket {
    private String eventName;
    private String holderName;
    private double basePrice;

    public Ticket(String eventName, String holderName, double basePrice) {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "Event: '" + eventName + '\'' +
                ", Name: '" + holderName + '\'' +
                ", Price: " + basePrice +
                '}';
    }
}
