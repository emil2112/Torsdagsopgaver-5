import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer c1 = new Customer("Jens", "Jensen", "Jens123");
        Customer c2 = new Customer("Børge", "Bassemand", "Børgemanden");
        Customer c3 = new Customer("Belinda", "B", "Blæksprutten");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        printCostumers(customers);

    }
    public static void printCostumers(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c);
            System.out.println();
        }
    }
}