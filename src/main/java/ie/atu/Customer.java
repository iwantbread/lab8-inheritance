package ie.atu;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    public Customer(String name, String phoneNumber, String address, int customerNumber, boolean mailingList) {
        super(name, phoneNumber, address);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public boolean isMailingList() {
        return mailingList;
    }
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
