package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Patrick", "123456", "Gort", 12345, true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhoneNumber("123456789");
        secondCustomer.setAddress("Bob Street");
        secondCustomer.setMailingList(false);
        System.out.println("");
        System.out.println(secondCustomer);
    }
}
