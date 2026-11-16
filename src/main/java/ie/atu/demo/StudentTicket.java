package ie.atu.demo;

public class StudentTicket extends Ticket {
    private  String studentId;

    public double studentPrice() {
        return getBasePrice() * 0.8;
    }

    public StudentTicket(String studentId) {
        super();
        this.studentId = "";
    }



}
