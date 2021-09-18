package example;

import StringExtensions.StringExtensions;
import com.example.Customer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class User {
    public void processCustomer(Customer c) {
        c.getName();
        // setName() fun cannot be called
        // since the variable passed inside customer data class
        // is of val type -> read only..
        c.setName("Tarush");
    }

    @NotNull
    public Customer customer(String handle) {
        Customer customer = new Customer("Bob");
        // no extension fun in java so use concept
        // of static classes.
        // here string extensions kt is static class.
        // top level annotation ->
        // @file: JvmName(name)
        StringExtensions.initials(customer.getName());
        return customer;
    }

    @NotNull
    public List<Customer> newCustomer() {
        return new ArrayList<Customer>();
    }
}
