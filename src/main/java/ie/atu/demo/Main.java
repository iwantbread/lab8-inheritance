package ie.atu.demo;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Summer Concert", "Alice", 80);
        Ticket ticket2 = new StudentTicket("Summer Concert", "Bob", 80, "S123456");
        Ticket ticket3 = new VIPTicket("Summer Concert", "Charlie", 80);

        Ticket[] tickets = {ticket1, ticket2, ticket3};

        for (Ticket ticket : tickets) {
            System.out.println(ticket.getEventName() + " - " + ticket.getHolderName() + ": " + ticket.calculatePrice());

            if (ticket instanceof VIPTicket) {
                System.out.println(((VIPTicket) ticket).getBenefits());
            }

            if (ticket instanceof StudentTicket) {
                System.out.println(((StudentTicket) ticket).getStudentId());
            }
        }
    }
}
