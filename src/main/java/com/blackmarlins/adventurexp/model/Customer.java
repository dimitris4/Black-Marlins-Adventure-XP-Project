package com.blackmarlins.adventurexp.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Customer {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false) // it accepts null values
    private String lastName;
    @Column(nullable = false)
    private String telephone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
