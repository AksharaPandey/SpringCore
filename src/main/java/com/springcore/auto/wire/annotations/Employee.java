package com.springcore.auto.wire.annotations;

import com.springcore.auto.wire.Address;
import org.springframework.beans.factory.annotation.Qualifier;


@Qualifier
public class Employee {
    private com.springcore.auto.wire.Address address;

    public com.springcore.auto.wire.Address getAddress() {
        return address;
    }

    public void setAddress(com.springcore.auto.wire.Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
