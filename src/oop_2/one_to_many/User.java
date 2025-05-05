package oop_2.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Address> addresses = new ArrayList<>();

    public User(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public static void main(String[] args) {
        List<Address> addresses1 = new ArrayList<>();
        addresses1.add(new Address("Arshakunyats Ave 27"));
        addresses1.add(new Address("Baghramyan 15"));

        User user = new User(addresses1);

        for (Address address : user.getAddresses()) {
            System.out.println(address.getAddress());
        }
    }
}

class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
